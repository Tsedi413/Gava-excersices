/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vanillaarray;

/**
 *
 * @author Tsedi
 */
public class VanillaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] n={11,1112,1111};
        System.out.println(isVanilla(n));
    }
    public static int isVanilla(int[] a){
        int mainDigit=a[0]%10;
        int tempDigit=0;
        int element=0;
       for(int i=0;i<a.length;i++){
          element=a[i];
          while(element!=0){
              tempDigit=element%10;
              if(mainDigit!=tempDigit){
                  return 0;
              }
              element=element/10;
          }
                  
           
       }
       return 1;
      
    }
    
}
