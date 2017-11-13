/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package grade.pkg12.a3;

/**
 *
 * @author millc9988
 */
public class A3Q4 {
    public int[] countingSort(int[] array){
        int[] tracker = new int[101];
        for (int i = 0; i < array.length; i++) {
            tracker[array[i]]++;
        }
        int pos = 0;
        for (int i = 0; i < tracker.length; i++) {
            while(tracker[i]!=0){
                array[pos]=i;
                pos++;
                tracker[i]--;
            }
        }
        return array;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q4 meme = new A3Q4();
        int[] compare = new int[100];
        for (int i = 0; i < compare.length; i++) {
            compare[i]=(int)(Math.random()*100);
        }
        System.out.println("The array before it is sorted is: ");
        for (int i = 0; i < compare.length; i++) {
            System.out.println(compare[i]);
        }
        compare = meme.countingSort(compare);
        for (int i = 0; i < compare.length; i++) {
            System.out.println(compare[i]);
        }
    }
}
