public class NumberToWords {

    public static void main(String[] args) {

        numberToWords(123);
        System.out.println();
        numberToWords(1010);
        System.out.println();
        numberToWords(1000);
        System.out.println();
        numberToWords(-12);
//        System.out.println(getDigitCount(0));
//        System.out.println(getDigitCount(reverse(2000)));

    }

    public static void numberToWords(int number) {
        int reversedNumber = reverse(number);

        if(reversedNumber < 0) {
            System.out.println("Invalid Value");
        }
        else {
            for(int i = 0; ; i++) {
                int digit = reversedNumber % 10;
                if(digit == 0) {
                    System.out.println("Zero");
                }
                else if(digit == 1) {
                    System.out.println("One");
                }
                else if(digit == 2) {
                    System.out.println("Two");
                }
                else if(digit == 3) {
                    System.out.println("Three");
                }
                else if(digit == 4) {
                    System.out.println("Four");
                }
                else if(digit == 5) {
                    System.out.println("Five");
                }
                else if(digit == 6) {
                    System.out.println("Six");
                }
                else if(digit == 7) {
                    System.out.println("Seven");
                }
                else if(digit == 8) {
                    System.out.println("Eight");
                }
                else {
                    System.out.println("Nine");
                }

                if(reversedNumber / 10 == 0) {
                    break;
                }
                reversedNumber = reversedNumber / 10;
            }

            if(getDigitCount(reverse(number)) != getDigitCount(number)) {
                for (int i = 0; i < getDigitCount(number) - getDigitCount(reverse(number)); i++) {
                    System.out.println("Zero");
                }
            }

        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        int digit = 0;
        for(int i = 0; ; i++){
            digit = number % 10;
            reverse = reverse + digit;
            if(number / 10 == 0) {
                break;
            }
            number = number / 10;
            reverse = reverse * 10;
        }

        return reverse;
    }

    public static int getDigitCount(int number) {
        if(number >= 0) {
            int count = 0;
            for(int i = 0; ; i++) {
                number = number / 10;
                count++;
                if(number == 0) {
                    break;
                }
            }
            return count;
        }

        return -1;
    }
}
