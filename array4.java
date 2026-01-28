public class array4 {
    public static int reverseIterative(int num) {
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    public static int reverseRecursive(int num) {
        return reverseHelper(num, 0);
    }

    private static int reverseHelper(int num, int rev) {
        if (num == 0)
            return rev;
        return reverseHelper(num / 10, rev * 10 + num % 10);
    }

    public static void main(String[] args) {
        int num = 1234;

        System.out.println(reverseIterative(num)); 
        System.out.println(reverseRecursive(num));  
    }
}
