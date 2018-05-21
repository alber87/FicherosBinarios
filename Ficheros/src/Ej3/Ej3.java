
package Ej3;

import java.util.Scanner;
import java.io.*;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nombre, apellido, sexo, edad, num suspensos, resi familiar, ingresos anuales
        String nombre, apellido, sexo, resiFamiliar;
        int edad, numSuspensos, ingAnuales;
        
        try{
            File f = new File("datosbeca.bin");
            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);
            
            System.out.print("Introduce el Nombre (fin para acabar): ");
            nombre = sc.nextLine();
            while(!"fin".equals(nombre)){
                dos.writeUTF(nombre);
                System.out.print("Introduce el Apellido: ");
                apellido = sc.nextLine();
                dos.writeUTF(apellido);
                System.out.print("Introduce el sexo (H o M): ");
                sexo = sc.nextLine();
                dos.writeUTF(sexo);
                System.out.print("Introduce la edad: ");
                edad = sc.nextInt();
                dos.writeInt(edad);
                System.out.print("Introduce el número de suspensos (0-4): ");
                numSuspensos = sc.nextInt();
                dos.writeInt(numSuspensos);
                sc.nextLine();
                System.out.print("¿Residencia familiar? (SI / NO): ");
                resiFamiliar = sc.nextLine();
                dos.writeUTF(resiFamiliar);
                System.out.print("Introduce los ingrsos anuales: ");
                ingAnuales = sc.nextInt();
                dos.writeInt(ingAnuales);
                sc.nextLine();
                System.out.print("Introduce el Nombre (fin para acabar): ");
                nombre = sc.nextLine();
            }
            dos.close();
            fos.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
        /*
        try{
            FileInputStream fis = new FileInputStream("datosbeca.bin");
            DataInputStream dis = new DataInputStream(fis);
            System.out.println("--- Datos del Archivo ---");
            
            try{
                while(true){
                    nombre = dis.readUTF();
                    apellido = dis.readUTF();
                    sexo = dis.readUTF();
                    edad = dis.readInt();
                    numSuspensos = dis.readInt();
                    resiFamiliar = dis.readUTF();
                    ingAnuales = dis.readInt();
                    
                    System.out.println("Nombre: " + nombre + "\nApellido: " + apellido + "\nSexo: " + sexo 
                                    + "\nEdad: " + edad + "\nNumero Suspensos: " + numSuspensos 
                                    + "\nResidencia Familiar: " + resiFamiliar + "\nIngresos Anuales: " + ingAnuales + "\n");
                }
            }catch(EOFException e){
                System.out.println(e);
            }
            
        }catch(IOException e){
            System.out.println(e);
        }
        */
    }
    
}
