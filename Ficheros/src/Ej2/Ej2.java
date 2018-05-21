
package Ej2;

import java.io.*;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String matricula, marca, modelo;
        double tamDeposito;
        
        try{
            File f = new File("coches.dat");
            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);
            System.out.print("Introduce Matricula (fin para acabar): ");
            matricula = sc.nextLine();
            while(!"fin".equals(matricula)){
                dos.writeUTF(matricula);
                System.out.print("Introduce Marca: ");
                marca = sc.nextLine();
                dos.writeUTF(marca);
                System.out.print("Introduce el tamaño del deposito: ");
                tamDeposito = sc.nextDouble();
                dos.writeDouble(tamDeposito);
                sc.nextLine();
                System.out.print("Introduce el Modelo: ");
                modelo = sc.nextLine();
                dos.writeUTF(modelo);
                System.out.print("Introduce Matricula (fin para acabar): ");
                matricula = sc.nextLine();
            }
            dos.close();
            fos.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
        try{
            FileInputStream fis = new FileInputStream("coches.dat");
            DataInputStream dis = new DataInputStream(fis);
            System.out.println("--- Datos del archivo ---");
            
            try{
                while(true){
                    matricula = dis.readUTF();
                    marca = dis.readUTF();
                    tamDeposito = dis.readDouble();
                    modelo = dis.readUTF();
                    System.out.println("Matricula: " + matricula + ", Marca: " + marca + ", Tamaño Depósito: " 
                                       + tamDeposito + ", Modelo: " + modelo + "\n");
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
