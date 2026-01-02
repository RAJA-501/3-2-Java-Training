import java.util.Arrays;

public class UtilityDemo {

    // Math utilities
    static int power(int a, int b) {
        int res = 1;
        for (int i = 1; i <= b; i++)
            res = res * a;
        return res;
    }

    static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++)
            f = f * i;
        return f;
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    // String utilities
    static String reverse(String s) {
        String r = "";
        for (int i = s.length() - 1; i >= 0; i--)
            r = r + s.charAt(i);
        return r;
    }

    static boolean palindrome(String s) {
        return s.equals(reverse(s));
    }

    []
    static int countVowels(String s) {
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                c++;
        }
        return c;
    }

    // Array utilities
    static int findMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];
        return max;
    }

    static int findMin(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++)
            if (a[i] < min)
                min = a[i];
        return min;
    }

    static void reverseArray(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {


        System.out.println(power(2, 3));
        System.out.println(factorial(5));
        System.out.println(isPrime(7));
        System.out.println(gcd(12, 18));


        System.out.println(reverse("java"));
        System.out.println(palindrome("madam"));
        System.out.println(countVowels("hello"));


        int[] arr = {3, 5, 1, 9};
        System.out.println(findMax(arr));
        System.out.println(findMin(arr));

        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
