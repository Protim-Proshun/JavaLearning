public class LargestPrime {

    public static void main(String[] args) {

        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(8));


    }

    public static int getLargestPrime(int number) {
        int largestPrimeNumber = 2;
        if(number > 1) {
            if(number == 2) {
                return 2;
            }
            for(int i = 2; i <= number; i++) {
                if(number % i == 0) {
                    for(int j = 2; j < i; j ++) {
                        if(i % j == 0) {
                            break;
                        }
                        else if(j == i-1) {
                            if(i > largestPrimeNumber) {
                                largestPrimeNumber = i;
                            }
                        }
                    }
                }
            }

            return largestPrimeNumber;
        }
        return -1;
    }

}
