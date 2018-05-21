
package Ej5;

import java.util.Scanner;
import java.io.*;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //nombre, apellidos, edad, tlf, email, ciudad, nacionalidad, profesion
        String nombre, apellidos, email, ciudad, nacionalidad, profesion;
        int edad, tlf;
        
        try{
            File f = new File("datos.bin");
            FileOutputStream fos = new FileOutputStream(f);
            DataOutputStream dos = new DataOutputStream(fos);
            
            System.out.print("Introduce el Nombre (fin para terminar): ");
            nombre = sc.nextLine();
            while(!"fin".equals(nombre)){
                dos.writeUTF(nombre);
                System.out.print("Introduce los Apellidos: ");
                apellidos = sc.nextLine();
                dos.writeUTF(apellidos);
                System.out.print("Introduce la Edad: ");
                edad = sc.nextInt();
                dos.writeInt(edad);
                System.out.print("Introduce el Teléfono: ");
                tlf = sc.nextInt();
                dos.writeInt(tlf);
                sc.nextLine();
                System.out.print("Introduce el Email: ");
                email = sc.nextLine();
                dos.writeUTF(email);
                System.out.print("Introduce la Ciudad: ");
                ciudad = sc.nextLine();
                dos.writeUTF(ciudad);
                System.out.print("Introduce la Nacionalidad: ");
                nacionalidad = sc.nextLine();
                dos.writeUTF(nacionalidad);
                System.out.print("Introduce la Profesión: ");
                profesion = sc.nextLine();
                dos.writeUTF(profesion);
                System.out.print("Introduce el Nombre (fin para terminar): ");
                nombre = sc.nextLine();
            }
            dos.close();
            fos.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
