/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uniqu2;

/**
 *
 * @author Tsedi
 */
public class Uniqu2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a={2,3,4};
        int n=5;
        System.out.println(isUnique(a,n));
    }
    public static int isUnique(int[] a, int n){
       int isunique=0;
       if(a.length > 2){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]+a[j]==n){
                   if(isunique==0){
                       isunique=1;
                   }
                else{
                    isunique=2;
                    break;
                }
            }  
            }
        if(isunique==2){
          isunique=0;
          break;
        }
        
          
        
       }
      
    }
       return isunique;
}
}
