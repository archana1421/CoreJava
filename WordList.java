/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wordlist;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.ArrayList;

/**
 *
 * @author armanchi
 */
public class WordList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException,IOException {
        String path="C:/Users/armanchi/Documents/NetBeansProjects/WordList/src/wordlist/input";
        BufferedReader br=new BufferedReader(new FileReader(path));
        String line=null;
        
        ArrayList<String> al=new ArrayList<String>();
        
        
        while((line =br.readLine() )!= null)
        {
        // TODO code application logic here
            String arr[]=line.split("\\W+");
            for(int i=0;i<arr.length;i++)
            {
               if(!al.contains(arr[i].toLowerCase())) 
                   al.add(arr[i].toLowerCase());
                   
            }
        }
        System.out.println(al);
    }
    
}
