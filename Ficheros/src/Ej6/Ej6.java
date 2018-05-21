
package Ej6;

import java.io.*;

public class Ej6 {
    public static void main(String[] args) {
        //nombre, apellidos, edad, tlf, email, ciudad, nacionalidad, profesion
        String nombre, apellidos, email, ciudad, nacionalidad, profesion;
        int edad, tlf;
        
        try{
            FileInputStream fis = new FileInputStream("datos.bin");
            DataInputStream dis = new DataInputStream(fis);
            
            try{
                while(true){
                nombre = dis.readUTF();
                apellidos = dis.readUTF();
                edad = dis.readInt();
                tlf = dis.readInt();
                email = dis.readUTF();
                ciudad = dis.readUTF();
                nacionalidad = dis.readUTF();
                profesion = dis.readUTF();
                
                if(edad<18){
                    File f = new File("menores.bin");
                    FileOutputStream fos = new FileOutputStream(f, true);
                    DataOutputStream dos = new DataOutputStream(fos);
                    
                    dos.writeUTF(nombre);
                    dos.writeUTF(apellidos);
                    dos.writeInt(edad);
                    dos.writeInt(tlf);
                    dos.writeUTF(email);
                    dos.writeUTF(ciudad);
                    dos.writeUTF(nacionalidad);
                    dos.writeUTF(profesion);
                    
                    dos.close();
                    fos.close();
                }
                
                if(edad>=18 && edad <65){
                    File f = new File("adultos.bin");
                    FileOutputStream fos = new FileOutputStream(f, true);
                    DataOutputStream dos = new DataOutputStream(fos);
                    
                    dos.writeUTF(nombre);
                    dos.writeUTF(apellidos);
                    dos.writeInt(edad);
                    dos.writeInt(tlf);
                    dos.writeUTF(email);
                    dos.writeUTF(ciudad);
                    dos.writeUTF(nacionalidad);
                    dos.writeUTF(profesion);
                    
                    dos.close();
                    fos.close();
                }
                
                if(edad>=65){
                    File f = new File("jubilados.bin");
                    FileOutputStream fos = new FileOutputStream(f, true);
                    DataOutputStream dos = new DataOutputStream(fos);
                    
                    dos.writeUTF(nombre);
                    dos.writeUTF(apellidos);
                    dos.writeInt(edad);
                    dos.writeInt(tlf);
                    dos.writeUTF(email);
                    dos.writeUTF(ciudad);
                    dos.writeUTF(nacionalidad);
                    dos.writeUTF(profesion);
                    
                    dos.close();
                    fos.close();
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
        
        try{
            FileInputStream fis = new FileInputStream("menores.bin");
            DataInputStream dis = new DataInputStream(fis);
            System.out.println("--- Fichero de menores ---");
            
            try{
                while(true){
                    nombre = dis.readUTF();
                    apellidos = dis.readUTF();
                    edad = dis.readInt();
                    tlf = dis.readInt();
                    email = dis.readUTF();
                    ciudad = dis.readUTF();
                    nacionalidad = dis.readUTF();
                    profesion = dis.readUTF();
                    
                    System.out.println("Nombre: " + nombre + "\nApellidos: " + apellidos + "\nEdad: " + edad 
                                    + "\nTlf: " + tlf + "\nEmail: " + email + "\nCiudad: " + ciudad
                                    + "\nNacionalidad: " + nacionalidad + "\nProfesión: " + profesion + "\n");
                }
            }catch(EOFException e){
                System.out.println(e);
            }
            dis.close();
            fis.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
        try{
            FileInputStream fis = new FileInputStream("adultos.bin");
            DataInputStream dis = new DataInputStream(fis);
            System.out.println("--- Fichero de adultos ---");
            
            try{
                while(true){
                    nombre = dis.readUTF();
                    apellidos = dis.readUTF();
                    edad = dis.readInt();
                    tlf = dis.readInt();
                    email = dis.readUTF();
                    ciudad = dis.readUTF();
                    nacionalidad = dis.readUTF();
                    profesion = dis.readUTF();
                    
                    System.out.println("Nombre: " + nombre + "\nApellidos: " + apellidos + "\nEdad: " + edad 
                                    + "\nTlf: " + tlf + "\nEmail: " + email + "\nCiudad: " + ciudad
                                    + "\nNacionalidad: " + nacionalidad + "\nProfesión: " + profesion + "\n");
                }
            }catch(EOFException e){
                System.out.println(e);
            }
            dis.close();
            fis.close();
        }catch(IOException e){
            System.out.println(e);
        }
        
        try{
            FileInputStream fis = new FileInputStream("jubilados.bin");
            DataInputStream dis = new DataInputStream(fis);
            System.out.println("--- Fichero de jubilados ---");
            
            try{
                while(true){
                    nombre = dis.readUTF();
                    apellidos = dis.readUTF();
                    edad = dis.readInt();
                    tlf = dis.readInt();
                    email = dis.readUTF();
                    ciudad = dis.readUTF();
                    nacionalidad = dis.readUTF();
                    profesion = dis.readUTF();
                    
                    System.out.println("Nombre: " + nombre + "\nApellidos: " + apellidos + "\nEdad: " + edad 
                                    + "\nTlf: " + tlf + "\nEmail: " + email + "\nCiudad: " + ciudad
                                    + "\nNacionalidad: " + nacionalidad + "\nProfesión: " + profesion + "\n");
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
