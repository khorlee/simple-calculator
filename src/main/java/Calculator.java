import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Khor Lee Yong, 25/08/2019
 */
public class Calculator {
    private static final String openingBracket = "(";

    public static double calculate(String sum) {
        String[] chars = sum.split(" ");

        // First, handle the calculation with brackets that takes precedence
        ArrayList<String> flattenedExpression = resolveBrackets(new ArrayList<>(Arrays.asList(chars)));

        ArrayList<String> calculated = calculateFromLeft(flattenedExpression);

        return Double.parseDouble(calculated.get(0));
    }

    private static ArrayList<String> resolveBrackets(final ArrayList<String> expression) {
        int openBracIndex = expression.lastIndexOf(openingBracket);

        if (openBracIndex == -1 || expression.size() == 1)
            return expression;

        resolve(expression, openBracIndex, true);

        // move on to resolve the next expression with brackets till there is none
        resolveBrackets(expression);

        return expression;
    }

    private static void resolve(ArrayList<String> expression, int from, boolean hasBrackets) {
        int xIndex = (hasBrackets) ? from + 1 : from;
        int to = (hasBrackets) ? xIndex + 4 : xIndex + 2;

        ArrayList<String> anExpression = new ArrayList<>(expression.subList(xIndex, xIndex + 3));
        double newValue = calculateAnExpression(new ArrayList<>(anExpression));

        expression.subList(xIndex, to).clear();
        expression.set(from, String.valueOf(newValue));
    }

    private static ArrayList<String> calculateFromLeft(final ArrayList<String> flattenedExpression) {
        if (flattenedExpression.get(0).equals(openingBracket) || flattenedExpression.size() < 3) {
            return flattenedExpression;
        }

        int xIndex = 0;

        // Multiplication and division takes precedence
        if (flattenedExpression.contains("*"))
            xIndex = flattenedExpression.indexOf("*") - 1;
        if (flattenedExpression.contains("/"))
            xIndex = flattenedExpression.indexOf("/") - 1;

        resolve(flattenedExpression, xIndex, false);
        calculateFromLeft(flattenedExpression);

        return flattenedExpression;
    }

    private static double calculateAnExpression(final ArrayList<String> anExpression) {
        double x = Double.parseDouble(anExpression.get(0));
        double y = Double.parseDouble(anExpression.get(2));

        return evaluate(x, y, anExpression.get(1));
    }

    private static double evaluate(final double x, final double y, final String operator) {
        switch (operator) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                return x / y;
        }
        return 0;
    }
}
