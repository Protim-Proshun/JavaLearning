public class EvenDigitSum {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }

        int sum = 0;
        int denominator = 0;

        while(true) {
            if(number / 10 == 0) {
                break;
            }

            denominator = number % 10;

            if(denominator % 2 == 0) {
                sum = sum + denominator;
            }

            number = number / 10;
        }

        denominator = number % 10;

        if(denominator % 2 == 0) {
            sum = sum + denominator;
        }

        return sum;
    }

}
