public class FirstLastDigitSum {

    public static void main(String[] args) {

        System.out.println(sumFirstAndLastDigit(7));

    }

    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }

        int count = 0;
        int sum = number % 10;

        while(true) {
            if(number / 10 == 0) {
                break;
            }

            number = number / 10;
            count = count + 1;
        }

        if(count == 0) {
            sum = number + number;
        }
        else {
            sum = sum + number;
        }

        return sum;
    }

}
