/*The prime factors of 13195 are 5, 7, 13 and 29. */
public class LargestPrimeFactor {
    public static void main(String[] args) {
        long number = 600851475143L;
        long largestPrimeFactor = 0;
        for (long i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                largestPrimeFactor = i;
                i--;
            }
        }
        System.out.println("Largest Prime Factor: " + largestPrimeFactor);
    }
}
