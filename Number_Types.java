import java.util.*;

public class Number_Types {

    static void odd_and_even(int a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer");
        int n = sc.nextInt();
        System.out.print("The range of  even" + n + "--");
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("The range of  odd" + n + "--");

        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    static void palindrom(int a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the Integer");
        int n = sc.nextInt();
        int on = 0;
        n = on;
        int sum = 0;
        while (n != 0) {
            int b = n % 10;
            sum = (sum * 10) + b;
            n = n / 10;
        }
        if (sum == on)
            System.out.println(n + " is Palindrom");
        else
            System.out.println(n + " is Not a Palindrom");
    }

    static void magic(int a) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int add = 0;
        while (n != 0) {
            int b = n % 10;
            add = add + b;
            n = n / 10;
        }
        int c = add;
        int rev = 0;
        while (c != 0) {
            int d = c % 10;
            rev = (rev * 10) + d;
            c = c / 10;
        }
        int t = add * rev;
        if (t == n)
            System.out.println(n + " is a Magic number");
        else
            System.out.println(n + " is Not a magic");

    }

    static boolean prime(int a) {
        if (a == 2) {
            return true;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    static void Fact(int a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Integer");
        int b = sc.nextInt();

        int f = 1;
        for (int i = 1; i <= b; i++) {
            f = f * i;
        }
        System.out.println("The Factorial of " + b + " is--" + f);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while (n == 1) {
            System.out.println("\nSelect the option:...");
            System.out.println("1.odd ||2.palindrom|| 3.magic|| 4.Prime number|| 5.Factorial ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    odd_and_even(n);
                    break;
                case 2:
                    palindrom(n);
                    break;
                case 3:
                    magic(n);
                    break;
                case 4:
                    System.out.println("Enter the Integer");
                    int pr = sc.nextInt();

                    for (int i = 2; i <= pr; i++) {
                        if (prime(i))
                            System.out.print(i + " ");
                    }
                    break;
                case 5:
                    Fact(n);
                    break;
            }
        }

    }
}
