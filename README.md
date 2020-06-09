# Simple Calculator

## Problem
Given the following method:

` public static double calculate(String sum) {
    // your code starts here
}`

…and the assumption that the String parameter will always consist of numbers and operators separated by **spaces**, 
your code must return the correct result for:
1.	1 + 1
2.	2 * 2
3.	1 + 2 + 3
4.	6 / 2
5.	11 + 23
6.	11.1 + 23

Your solution should ideally also handle brackets and provide the correct result for:
1.	( 11.5 + 15.4 ) + 10.1
2.	23 - ( 29.3 - 12.5 )

Please note that as with the earlier calculations; numbers, operators and brackets are all separated by spaces.

### Assumptions
The following assumptions were made when designing the solution:
* There is no syntax error, hence no validation is required for the String parameter `sum`;
* There will always be a closing bracket that corresponds to an opening bracket;
* Supported operands are addition (+), subtraction (-), multiplication (*) and division (/);
* If the brackets are not the first or last item in the String parameter, they will always be joined with an operand;
* In the absence of parentheses, multiplication and division are performed left to right.

Time spent: About 4 hours
