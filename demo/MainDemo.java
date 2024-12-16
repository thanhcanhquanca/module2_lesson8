package demo;

public class MainDemo {
    // bản gốc
    public static int calculate(int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case '+':
                return firstOperand + secondOperand;
            case '-':
                return firstOperand - secondOperand;
            case '*':
                return firstOperand * secondOperand;
            case '/':
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }

    // bản sửa

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate1(int firstOperand1, int secondOperand1, char operator1) {
        switch (operator1) {
            case ADDITION:
                return firstOperand1 + secondOperand1;
            case SUBTRACTION:
                return firstOperand1 - secondOperand1;
            case MULTIPLICATION:
                return firstOperand1 * secondOperand1;
            case DIVISION:
                if (secondOperand1 != 0)
                    return firstOperand1 / secondOperand1;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }
}
