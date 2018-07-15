/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Pcwl
 */
public class AllData {
 String ec_number=null;

    public void setEc_number(String ec_number) {
        this.ec_number = ec_number;
    }

    public String getEc_number() {
        return ec_number;
    }
    
    public void setIc(String number){
        try {
            
            FileOutputStream fos=new FileOutputStream("icNumber.dat");
            DataOutputStream dataInputStream=new DataOutputStream(fos);
           dataInputStream.writeUTF(number);
        } catch (Exception e) {
        }
    }
    
    
      public String getIc(){
          String icNumber=null;
        try {
            
           // FileOutputStream fos=new FileOutputStream("icNumber.dat");
          
            FileInputStream fileInputStream=new FileInputStream("icNumber.dat");
         
            DataInputStream dataInputStream=new DataInputStream(fileInputStream);
             icNumber=dataInputStream.readUTF();
            System.out.println("DATAOUTPUT"+icNumber);
            
           return icNumber;
           
        } catch (Exception e) {
            System.out.println("Error"+e.getMessage());
        }
        return icNumber;
    }   
}
