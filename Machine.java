/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package machine;

import java.util.concurrent.ThreadLocalRandom;
/**
 *
 * @author ARMANCHI
 */
public class Machine {
    public enum state
    {
        BAR,MEDAL,COIN,TRIPLE_BAR,CHERRY;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]=new int[3];
        for(int i=0;i<3;i++)
        {
            int random=ThreadLocalRandom.current().nextInt(5);
            
            arr[i]=random;
        }
        for(int i=0;i<3;i++)
        {
            System.out.print(state.values()[arr[i]]+" : ");
        }
    }
    
}
