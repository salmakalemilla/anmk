public class prime{

    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100 are:");

        for (int i = 2; i <= 100; i++) {                   
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) { 
            return false;
        }
       
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}
