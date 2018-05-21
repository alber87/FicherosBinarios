
package Ej1;

import java.util.Scanner;
import java.io.*;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidad, num;
        System.out.print("Introduce la cantidad de números a meter en el fichero: ");
        cantidad = sc.nextInt();
        
        try{
            File f = new File("numeros.dat");
            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);
            for (int i =0; i<cantidad; i++) {
                num = (int) (Math.random()*100 + 1);
                dos.write(num);
                System.out.println(num);
            }
            dos.close();
            fos.close();
            
        }catch(IOException e){
            System.out.println(e);
        }
        
        try{
            int numero = 0;
            FileInputStream fis = new FileInputStream("numeros.dat");
            DataInputStream dis = new DataInputStream(fis);
            try{
                while(true){
                    numero = dis.readInt();
                    System.out.println(numero);
                    System.out.println("-");
                }
            }catch(EOFException e){
                System.out.println(e);
            }
            dis.close();
            fis.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
    }
    
}
