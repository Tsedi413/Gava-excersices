/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package size.of.gutherie;

/**
 *
 * @author Tsedi
 */
public class SizeOfGutherie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        public static int gutherieSize(int n){
            int count =0;
            int gutherie=0;
            if(n==1){
                
            }
            if(n%2==0){
                n=n/2;
                count++;
            }else{
                n=(n*3)+1;
                count++;
            }
        }
    }
    
}
