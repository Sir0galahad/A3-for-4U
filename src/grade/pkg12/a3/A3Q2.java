/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grade.pkg12.a3;

import java.util.Scanner;

/**
 *
 * @author millc9988
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        A3Q2 call = new A3Q2();
        boolean missing = false;
        int[] compare = new int[10001];
        for (int i = 0; i < 10001; i++) {
            compare[i]=i;
        }
        System.out.println("Please enter how long your array is.");
        int[] array = new int[in.nextInt()];
        System.out.println("Please populate your array");
        for (int i = 0; i < array.length; i++) {
            array[i]=in.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            if (!(array[i]==compare[i])) {
                System.out.println("The lowest missing number is "+compare[i]);
                missing=true;
                break;
            }
            
        }
        if (!missing) {
            System.out.println("there are no missing numbers");
        }
    }
}
