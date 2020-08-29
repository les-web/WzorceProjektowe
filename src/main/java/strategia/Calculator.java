package strategia;

public class Calculator {

    public static void main(String[] args) {

        String operator = "add";
        int a = 5;
        int b = 10;


    }

    private static int calculate(String operator, int a, int b) {

        if (operator.equals("add")) {
            return a + b;
        } else if (operator.equals("minus")) {
            return a -b;
        }  else if (operator.equals("multiply")) {
            return a * b;
        } else if (operator.equals("divide")) {
            return a / b;
        } else {
            return 0;
        }
    }
}
