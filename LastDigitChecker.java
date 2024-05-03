public class LastDigitChecker {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit (41, 22, 71));
        System.out.println(hasSameLastDigit (23, 32, 42));
        System.out.println(hasSameLastDigit (9, 99, 999));
    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {
        if(isValid(number1) && isValid(number2) && isValid(number3)) {
            int lastDigitNumber1 = number1 % 10;
            int lastDigitNumber2 = number2 % 10;
            int lastDigitNumber3 = number3 % 10;
            if((lastDigitNumber1 == lastDigitNumber2) || (lastDigitNumber2 == lastDigitNumber3)
            || (lastDigitNumber3 == lastDigitNumber1)) {
                return true;
            }
            else {
                return false;
            }
        }

        return false;
    }

    public static boolean isValid(int number) {
        if(number >= 10 && number <= 1000) {
            return true;
        }

        return false;
    }

}
