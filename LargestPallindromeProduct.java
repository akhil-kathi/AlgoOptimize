/*
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 × 99.
 * 
 * Find the largest palindrome made from the product of two n-digit numbers.
 */

class LargestPalindromeProduct {
    public static void main(String[] args) {
        int n = 3;
        int largestPalindromeProduct = 0;
        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
            for (int j = (int) Math.pow(10, n - 1); j < (int) Math.pow(10, n); j++) {
                int product = i * j;
                if (isPalindrome(product) && product > largestPalindromeProduct) {
                    largestPalindromeProduct = product;
                }
            }
        }
        System.out.println("Largest Palindrome Product: " + largestPalindromeProduct);
    }

    public static boolean isPalindrome(int number) {
        String numberString = Integer.toString(number);
        int length = numberString.length();
        for (int i = 0; i < length / 2; i++) {
            if (numberString.charAt(i) != numberString.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
}