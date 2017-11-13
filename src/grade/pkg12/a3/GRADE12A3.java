/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grade.pkg12.a3;

/**
 *
 * @author millc9988
 */
public class GRADE12A3 {
    public void swap(int[] array, int p1, int p2) {
        int temp = array[p1];
        array[p1] = array[p2];
        array[p2] = temp;
    }

    public void selectionSort(int[] array) {
        int store = 0;
        int storePos = 0;
        for (int pos = 0; pos < array.length; pos++) {
            for (int i = pos + 1; i < array.length; i++) {
                if (array[i] < array[pos]&&store<array[i]) {
                    store=array[i];
                    storePos = i;
                }
                if (i==array.length-1) {
                    swap(array, pos,storePos);
                    System.out.println("reached");
                }
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GRADE12A3 call = new GRADE12A3();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*(100-1)+1);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("After its been sorted");
        call.selectionSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
