/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package samenuberoffactor;

/**
 *
 * @author Tsedi
 */
public class SameNuberOfFactor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int n1=8;
       int n2=12;
        System.out.println(sameNumberof(n1,n2));
    }
    public static int sameNumberof(int n1, int n2){
        if(n1<0 || n2<0){
            return -1;
        }else{
            int count1=0;
            int count2=0;
            for(int i=2;i<n1;i++){
                if(n1%i==0){
                    count1++;
                }
            }
            for(int i=2;i<n2;i++){
                if(n2%i==0){
                    count2++;
                }
            }
          if(count1==count2)  {
              return 1;
          }
         return 0; 
        }
    }
    
}
