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
public class A3Q5 {
    public String[] sort(String[] thots){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < thots.length-1; j++) {
                if ((thots[j].compareTo(thots[j+1]))>0) {
                    String temp = thots[j];
                    thots[j]=thots[j+1];
                    thots[j+1]=temp;
                }
            }
        }
        return thots;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q5 memes = new A3Q5();
        Scanner in = new Scanner(System.in);
        String[] thots = new String[10];
        System.out.println("Feed in ten words");
        for (int i = 0; i < 10; i++) {
            thots[i] = in.nextLine();
        }
        thots = memes.sort(thots);
        System.out.println("In alphabetical order those words are:");
        for (int i = 0; i < 10; i++) {
            System.out.println(thots[i]);
        }
    }
}
