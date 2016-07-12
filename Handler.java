/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package handler;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;
import java.nio.file.Files;
/**
 *
 * @author ARMANCHI
 */
public class Handler {

    /**
     * @param args the command line arguments
     */
    FileInputStream fis;
    FileOutputStream fos;
    
    public void takeInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input file name:");
        String input=sc.nextLine();
        try
        {
        fis=new FileInputStream(input);
        }
        catch(FileNotFoundException fe)
        {
            System.out.println(fe);
            takeInput();
        }
        
    }
    public void takeOutput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter output filename:");
        String outputfileName=sc.nextLine();
        try
        {
       fos=new FileOutputStream(outputfileName);
        
        }
        catch(FileNotFoundException fe)
        {
            System.out.println(fe);
            takeOutput();
        }
        
        
        
    }
     public void copy()
    {
        
       
        
        try{
            int i=0;  
            while((i=fis.read())!=-1){  
                
                fos.write((byte)i);  
            }  
            System.out.println("Copied Successfully");
            
        }
        catch(IOException ie)
        {
            System.out.println("could not copy");
            takeInput();
            takeOutput();
            copy();
        }
         

    }
    public static void main(String[] args) {
        
        Handler hnd=new Handler();
        hnd.takeInput();
        hnd.takeOutput();
        // TODO code application logic here
        
        hnd.copy();
        
        
    }
   
    
}
