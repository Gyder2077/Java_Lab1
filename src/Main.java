import java.util.Random;
import java.lang.Math;

public class Main {
    public static double first(double n){
        return Math.pow(Math.pow(n, (n + Math.PI) / Math.PI) / Math.PI, 2);
    }
    public static double second(double n){
        return Math.sin(Math.pow(Math.log(Math.abs(n)), (Math.pow(((2 / 3 - n) / 1) / 3, 2) / Math.asin((n + 1.5) / 19) + 1)));
    }
    public static double third(double n){
        return Math.pow(2 + Math.asin(Math.cos(Math.log(Math.pow(Math.cos(n), 2)))) / Math.pow((Math.pow(Math.pow(n / (1 - n), 3), n * (n - 1)) + 2 / 3) / Math.pow(Math.pow(Math.E, n), Math.asin((n + 1.5) / 19)), 3), 2);
    }
    public static void output(double[][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.printf("%.2f \t", a[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[] s = {16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        double[] x = new double[15];
        for (int i = 0; i < 15; i++) {
            Random n = new Random();
            x[i] = (double)(n.nextInt(19) - 8) + n.nextDouble();
        }

        double[][] w = new double[16][15];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < x.length; j++) {
                switch (s[i]){
                    case 13: w[i][j] = first(x[j]); break;
                    case 1, 3, 5, 6, 7, 11, 15, 16: w[i][j] = second(x[j]); break;
                    default: w[i][j] = third(x[j]);
                }
            }
        }
        output(w);
    }
}
