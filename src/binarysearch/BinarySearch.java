/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearch;

/**
 *
 * @author Toasty
 */
public class BinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] anArray = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(binarySearch(anArray, 3));
        
    }
    
    
    public static int binarySearch(int[] array1, int b){
        int low = 0;
        int high = array1.length;
        while(low <= high){
            int mid = (low + high) / 2;
            if(mid > b){
                high = mid - 1;
            }
            else if(mid < b){
                low = mid + 1;
            }
            else return b;
            
        }
        
        return -1;
    }
}
