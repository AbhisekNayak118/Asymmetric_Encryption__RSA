import java.util.*;
// import java.io.*;
// import java.lang.*;

public class RSA_algorithm {
    static double gcd(double a, double b) {
        if (b != 0)
            return gcd(b, a % b);
        else
            return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 17, b = 29;
        double n = a * b;
        double phin = (a - 1) * (b - 1);
        double e = 3;

        while (e < phin) {
            if (gcd(e, phin) == 1) {
                break;
            }
            e++;
        }
        double cnst = 3;
        // double d = (1 + (cnst * phin)) / e; // For decryption
        System.out.println("Enter your message to be encrypted: ");
        double msg = in.nextDouble();
        in.close();
        double res = Math.pow(msg, cnst);
        res %= n;

        System.out.println("Your encrypted message is :" + res);
    }
}