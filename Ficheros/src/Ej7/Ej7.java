
package Ej7;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Ej7 {
    public static void main(String[] args) {
        ArrayList<Datos> temp = new ArrayList<Datos>();
        String num;
        
        try{
            FileReader fr = new FileReader("temperaturas.txt");
            BufferedReader br = new BufferedReader(fr);
            num = br.readLine();
            while(num!=null){
                System.out.println(num);
                num = br.readLine();
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
     
    }
    
}
