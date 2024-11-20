## Algorithm for Converting Binary Numbers to Decimal
Number systems have different bases. Decimals numbers with a base of ten are what most of us are familiar with. Computers, on the other hand, use only ones and zeros (binary).
Let's try to write some code that converts binary numbers to decimals.

Specifically, we want to develop an algorithm that accepts a string containing ones and
zeros and returns an integer.

We can convert the binary string by following these steps:
1. Start from the end of the string and process each character at a time. The position
of each digit in the binary string corresponds to a decimal number in a sequence.
2. To generate this sequence, you start from one and multiply by two every time, so
one, two, four, eight, and so on (see Conversion Sequence row of Table 1.1). More
formally, the sequence is a geometric progression that starts at one and
progresses in a common ratio of two.
3. We then apply the binary string as a mask on this sequence (see the Binary String
(Mask) row of Table 1.1).
4. The result is a new sequence where the values are only kept if the corresponding
position in the binary string has a value of one (see the Result row of Table 1.1).
5. After applying the mask, we just need to sum up the resulting numbers together.

|Conversion Sequence |16 |8 |4 |2 | 1|
|:-------------------|:- |:-|:-|:-|:-|
|Binary String (Mask) |1 |0 |1 |1 |0|
|Result |16 |0 |4 |2 |0|

In the preceding example , resulting total is 22. This is our decimal
number corresponding to the binary number 10110.

To design our algorithm, it's important to realize that we don't need to
store the entire conversion sequence. Since we are processing one binary
digit at a time (starting from the back), we only need to use the conversion
number corresponding to the binary position we are processing.
Snippet 1.1 shows us how we can do this. We use a single conversion variable instead of a
sequence and initialize this variable to the value of one. We then use a loop to iterate over
the length of the binary string starting from the end. While iterating, if the digit at our
current position is one, we add the current conversion variable to the final result. We then
simply double the current conversion variable and repeat. The code snippet is as follows:
```java
public int convertToDecimal(String binary) {
    int conversion = 1;
    int result = 0;
    for (int i = 1; i <= binary.length(); i++) {
        if (binary.charAt(binary.length() - i) == '1')
            result += conversion;

        conversion *= 2;
    }
    return result;
}
```
