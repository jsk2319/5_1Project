
/**
 *@author jsk2319@email.vccs.edu
 * Author: Jude Kallista-Fitzpatrick
 * Purpose: The purpose is to use all of the Math class types listed. The variables used are all randomly selected.
 */
import static java.lang.Math.*;
import java.util.*;
public class EquationsWithMath {

    public static void main(String[] args){
        all();
    }
    public static void all() {

        System.out.println("x, y, and z will be randomly selected. Then they will be used as parts of each equation.");

        //selecting x, y, and z
        double x = (Math.random()*100);
        x = (double)(Math.round(x * 100)) / 100;
        double y = (Math.random()*100);
        y = (double)(Math.round(y * 100)) / 100;
        double z = (Math.random()*100);
        z = (double)(Math.round(z * 100)) / 100;

        //logic for first equation
        double answerH = pow(x,10);
        //display for first equation
        System.out.println("x was " + x + "\nh(x) = x^10 is " + answerH);
        //logic for second equation
        double answerF = x + y;
        //display for second equation
        System.out.println("y was " + y + "\nf(x,y) = x + y is " + answerF);
        //doing the sqrt, abs, and pow for the third equation
        double root = sqrt(x);
        double absolute = abs(y);
        double power = pow(z,y);
        //logic for third equation
        double answerG = root + absolute + power;
        answerG = (double)(Math.round(answerG * 100)) / 100;
        //display for third equation
        System.out.println("z was " + z + "\ng(x,y,z) = √x + |y| + z^y is " + answerG);


        System.out.println("The next two will demonstrate the use of ceil and floor.");
        //logic and display for ceil
        double ceilG = ceil(answerG);
        System.out.println("The ceil of g is " + ceilG);
        //logic and display for floor
        double floorG = floor(answerG);
        System.out.println("The floor of g is " + floorG);


        System.out.println("Variables C and K will now be chosen for min and max.");
        //Establishing c and k
        Random mMRand = new Random();
        int c = mMRand.nextInt(100);
        int k = mMRand.nextInt(100);
        //Logic for max and min
        int mMax = Math.max(c,k);
        int mMin = Math.min(c,k);
        //Display for max and min
        System.out.println("C was " + c + "\nK was " + k + "\nThe max was " + mMax + "\nThe min was " + mMin);

    }

}
