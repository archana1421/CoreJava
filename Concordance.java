/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concordance;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.HashMap;
/**
 *
 * @author armanchi
 */
public class Concordance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException{
        // TODO code application logic here
        String path="C:/Users/armanchi/Documents/NetBeansProjects/WordList/src/wordlist/input";
        BufferedReader br=new BufferedReader(new FileReader(path));
        String line=null;
        
        HashMap<String,Integer> hm=new HashMap<String,Integer>();
        
        
        while((line =br.readLine() )!= null)
        {
        // TODO code application logic here
            String arr[]=line.split("\\W+");
            for(int i=0;i<arr.length;i++)
            {
              if(hm.get(arr[i].toLowerCase())== null)
              {
                  hm.put(arr[i].toLowerCase(),1);
                   
              }
              else
                   hm.put(arr[i].toLowerCase(),hm.get(arr[i].toLowerCase())+1);
            }
       
        }
         System.out.println(hm);
    }
    
}
