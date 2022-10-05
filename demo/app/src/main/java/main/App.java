/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package main;
import java.util.Arrays;
import static java.lang.Math.*;
import static java.lang.Math.pow;
import java.util.Arrays;
public class App {
    public static void main(String[] args) {
        int [] d = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18};
        int [] if1 = { 2, 3, 6, 7, 8, 10, 13, 15};
        float [] x = new float[11];
        for (int k = 0; k <11; k++) {
            double a = Math.random() * 20.0 - 10.0;
            float b = (float) a;
            x[k] = b;
        }
        double [][] c = new double [17][11];
        for (int j = 0; j<11;  j++) {
            for (int i = 0; i<17; i++) {
                float x1 = x[j];
                if (d[i] == 12){
                    c[i][j] = pow((cos(asin( x1 / 2 * E + 1))), ((pow(x1, 1/3))*((pow(cos(x1), (cos(x1) + 0.25)/4))-0.25)));
                }
                else if (Arrays.binarySearch(if1, d[i]) > -1) {
                    c[i][j] = cos(4/(pow(E, x1)- 2));
                }
                else {
                    c[i][j] = cos(4*(1- pow(E, pow(x1, x1/2))));
                }
            }
        }
        for (int j = 0; j<11;  j++) {
            for (int i = 0; i < 17; i++) {
                System.out.printf("%14.4f",c[i][j]);
            }
            System.out.println();
        }
    }
}