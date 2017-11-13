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
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q3 call = new A3Q3();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter in the length of your array.");
        int length = in.nextInt();
        int[] A = new int[length];
        System.out.println("Please populate your array");
        for (int i = 0; i < A.length; i++) {
            A[i]=in.nextInt();
        }
        System.out.println("The number of ones is "+call.countOnes(A));
        
    }
    public int countOnes(int[] A){
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i]==1) {
                count++;
            }
        }
        return count;
    }
}
