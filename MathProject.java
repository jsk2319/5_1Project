
/**
 *@author jsk2319@email.vccs.edu
 * Author: Jude Kallista-Fitzpatrick
 * Purpose: The purpose is to have the user pick the varibles used in the following equations. The method of solving these does not use math class.
 */

import java.util.Scanner;

public class MathProject {

    public static void main(String[] args){
        all();
        }
    public static void all() {

            Scanner keyboardX = new Scanner(System.in);
            System.out.println("Enter a number in place of x.");

            double x = keyboardX.nextDouble();
            double answerH = x * x * x * x * x * x * x * x * x * x;
            System.out.println("x^10 is " + answerH);

            Scanner keyboardY = new Scanner(System.in);
            System.out.println("Enter a number in place of y.");

            double y = keyboardY.nextDouble();
            double answerF = x + y;
            System.out.println("x + y is " + answerF);



                Scanner keyboardZ = new Scanner(System.in);
                System.out.println("Enter a number in place of z.");
                double z = keyboardZ.nextDouble();

                double power = 1;
                double absolute = 1;
                double root = 1;
                if (y >= 0) {
                    absolute = y;
                }else {
                    System.out.println();
                    absolute = y - (2 * y);
                }
                if (y < 0) {
                   z = 1.0 / z;
                   y = -y;
                }for (int i = 0; i < y; i++) {
                    power = power * z;
                }for (int r = 0; r < x; r++) {
                    root = 0.5 * (root + x / root);
                 }
                    double answerG = root + absolute + power;
                  System.out.println("√x + |y| + z^y is " + answerG);

            }

}
