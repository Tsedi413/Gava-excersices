/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wavyarray;

/**
 *
 * @author Tsedi
 */
public class WavyArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] a={3,4,5,8};
        System.out.println(isWavy(a));
    }
    public static int isWavy(int[] a){
        int isWavy=1;
       for(int i=0;i<a.length;i++){
        if(a[i]%2==0 && a[i+1]%2==0){
            isWavy= 0;
            break;
        }
       else if(a[i]%2!=0 && a[i+1]%2!=0){
            isWavy= 0;
            break;
        }    
        
    }
       return isWavy;
    }
}
