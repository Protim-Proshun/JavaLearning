public class NumberPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));

    }

    public static boolean isPalindrome(int number) {
        if(number < 0) {
            number = number * (-1);
        }

        int reverse = 0;
        int dividend = number;

        while(true) {
            if(dividend / 10 == 0) {
                break;
            }

            reverse = (reverse * 10) + (dividend % 10);
            dividend = dividend / 10;
        }

        reverse = (reverse * 10) + (dividend % 10);

        if(number == reverse) {
            return true;
        }

        return false;
    }

}
