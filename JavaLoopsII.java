import java.util.*;
import java.io.*;

class JavaLoopsII {
    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); // number of queries
        
        for (int i = 0; i < t; i++) {
            int a = in.nextInt(); // base value
            int b = in.nextInt(); // multiplier
            int n = in.nextInt(); // number of terms

            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += (int) Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
