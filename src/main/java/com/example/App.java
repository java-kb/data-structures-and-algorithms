package com.example;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'minPower' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY cells as parameter.
     */

    public static int minPower(List<Integer> cells) {
        int minPower = 0;
        if (cells.size() > 1) {
            Integer minValue = Collections.min(cells);
            Integer minIndex = cells.indexOf(minValue);

            int nextMin = getNextMin(cells, minIndex);

            minPower = minValue + cells.get(nextMin);

            cells.set(minIndex, minPower);
            cells.remove(nextMin);

            minPower += minPower(cells);
        }

        return minPower;
    }

    private static int getNextMin(List<Integer> cells, int minIndex) {
        if (minIndex == 0)
            return 1;
        if (minIndex == cells.size() - 1)
            return cells.size() - 2;
        if (cells.get(minIndex - 1) < cells.get(minIndex + 1))
            return minIndex - 1;
        else
            return minIndex + 1;
    }

}

public final class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int cellsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> cells = IntStream.range(0, cellsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.minPower(cells);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
