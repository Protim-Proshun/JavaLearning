import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            try {
                int input = Integer.parseInt(scanner.nextLine());
                sum += input;
                count++;
            } catch(NumberFormatException unexpectedInputFormat) {
                break;
            }
        }


        try {
            double average = (double) sum / count;
            System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
        } catch(ArithmeticException unsupportedMathOperation) {
            System.out.println("SUM = " + sum + " AVG = " + 0);
        }
    }

}
