
package Ej4;

import java.util.Scanner;
import java.io.*;

public class Ej4 {
    public static void main(String[] args) {
        String nombre, apellido, sexo, resiFamiliar;
        int edad, numSuspensos, ingAnuales;
        
        int baseFija = 1500, beca;
        
        try{
            FileInputStream fis = new FileInputStream("datosbeca.bin");
            DataInputStream dis = new DataInputStream(fis);
            System.out.println("--- Datos del Archivo ---");
            
            try{
                while(true){
                    beca = baseFija;
                    nombre = dis.readUTF();
                    apellido = dis.readUTF();
                    sexo = dis.readUTF();
                    edad = dis.readInt();
                    numSuspensos = dis.readInt();
                    resiFamiliar = dis.readUTF();
                    ingAnuales = dis.readInt();
                    
                    if(numSuspensos<2){
                        if(edad<23)
                        beca = beca + 200;
                        if(numSuspensos==0)
                            beca = beca + 500;
                        if(numSuspensos==1)
                            beca = beca + 200;
                        if("NO".equals(resiFamiliar))
                            beca = beca + 1000;
                        if(ingAnuales<=12000)
                            beca = beca + 500;
                        
                        System.out.println("Nombre: " + nombre + "\nApellido: " + apellido + "\nSexo: " + sexo 
                                    + "\nEdad: " + edad + "\nNumero Suspensos: " + numSuspensos 
                                    + "\nResidencia Familiar: " + resiFamiliar + "\nIngresos Anuales: " + ingAnuales 
                                    + "\nCuantía Total: " + beca + "\n");
  
                    }
                     
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
