
package Ej7;

import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Ej7 {
    public static void main(String[] args) {
        ArrayList<Datos> temp = new ArrayList<Datos>();
        String cadena, hora, tmp;
        int dia = 22;
        
        try{
            File f = new File("temperaturas.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            cadena = br.readLine();
            while(cadena!=null){
                System.out.println(cadena);
                
                hora=cadena.substring(0, 2);
                tmp=cadena.substring(3, 5);
                System.out.println("Hora: " + hora + ", Temperatura: " + tmp);
                int horaNum = Integer.parseInt(hora);
                int tmpNum = Integer.parseInt(tmp);
                
                File f2 = new File("tempSep.dat");
                FileOutputStream fos = new FileOutputStream(f2, true);
                DataOutputStream dos = new DataOutputStream(fos);
                
                dos.writeInt(dia);
                dos.writeInt(horaNum);
                dos.writeInt(tmpNum);
                
                cadena = br.readLine();
                cadena = br.readLine();
                
                dos.close();
                fos.close();
            }
            
            br.close();
            fr.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
        
        try{
            File f3 = new File("tempSep.dat");
            FileInputStream fos = new FileInputStream(f3);
            DataInputStream dos = new DataInputStream(fos);
            
            try {
                while(true){
                    dia = dos.readInt();
                    int horaNum = dos.readInt();
                    int tmpNum = dos.readInt();
                    System.out.println("Dia: " + dia + "\nHora: " + horaNum + "\nTemp: " + tmpNum);
                }
            }catch(EOFException e) {
                System.out.println(e);
            }
            dos.close();
            fos.close();
        }catch(IOException e){
            System.out.println(e);
        }
     
    }
    
}
