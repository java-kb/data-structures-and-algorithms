# Algorithm to Convert Numbers from Octal To Decimal
## Scenario
In aviation, the aircraft's transponders transmit a code so that they can identify one another.
This code uses the octal system, a number system which has a base of 8. We have been
asked to write a method to convert octal numbers into decimals. For example, the octal number 17 is represented as 15 in the decimal system.

**Octal**

Octal number is a number expressed in the base 8 numeral system. Octal number's digits have 8 symbols: 0,1,2,3,4,5,6,7. Each digit of an octal number counts a power of 16.

Octal number example:
6278 = 6×82+2×81+7×80 = 158010

**Decimal**

Decimal number is a number expressed in the base 10 numeral system. Decimal number's digits have 10 symbols: 0,1,2,3,4,5,6,7,8,9. Each digit of a decimal number counts a power of 10.

Decimal number example:
65310 = 6×102+5×101+3×100

**How to convert from octal to decimal**

A regular decimal number is the sum of the digits multiplied with 10n.

**Example #1**

137 in base 10 is equal to each digit multiplied with its corresponding 10n:

13710 = 1×102+3×101+7×100 = 100+30+7

Octal numbers are read the same way, but each digit counts 8n instead of 10n.

Multiply each digit of the hex number with its corresponding 8n.

**Example #2**

37 in base 8 is equal to each digit multiplied with its corresponding 8n:

378 = 3×81+7×80 = 24+7 = 31

**Example #3**

7014 in base 8 is equal to each digit multiplied with its corresponding power of 8:

70148 = 7×83+0×82+1×81+4×80= 3584+0+8+4 = 3596

## Steps for Completion
1. The algorithms for Converting Binary Numbers to Decimal the preceding snippets of code can be
adapted to work with octal numbers instead of binary.
2. Change the base from two to eight. This can be done by changing the conversion
multiplier variable in above Snippet.
1. Parse the digit being processed to convert it into an integer. This integer can then
be multiplied by the conversion variable or result of the power function.

The code snippet is as follows:
```java
public static int algorithm1(String octal) {
    double conversion = 1;
    int result = 0;
    for (int i = 1; i <= octal.length(); i++) {
        int octDigit = Integer.parseInt(octal.charAt(octal.length() - i) + "");
        conversion = Math.pow(8, i - 1);
        
        result += octDigit * conversion;
    }
    return result;
}

public static int algorithm2(String oct) {
    int result = 0;
    for (int i = 1; i <= oct.length(); i++) {
        int octDigit = Integer.parseInt(oct.charAt(oct.length() - i) + "");
        result += Math.pow(8, i - 1) * octDigit;
    }
    return result;
}
```