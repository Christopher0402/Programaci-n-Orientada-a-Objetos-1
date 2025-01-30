package com.mycompany.actividad2;

import java.util.Scanner;

public class Actividad2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); 
      
        if (nombre.equals("Christopher")) {
            System.out.println("Hola como estas Christopher");
        } else if (nombre.equals("Efren")) {
            System.out.println(" Un gusto Efren");
        } else {
            System.out.println("Nombre no reconocido");
        }
        
       
        scanner.close();
    }
}

