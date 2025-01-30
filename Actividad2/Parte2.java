/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parte2;

/**
 *
 * @author Usuario
 */
public class Parte2 {
    public static void main(String[] args) {
        
        int[] numerosPares = new int[50];
        
       
        int index = 0;  
        for (int i = 2; i <= 100; i += 2) {  
            numerosPares[index] = i; 
            index++;  
        }
        
        
        System.out.println("Los números pares entre 2 y 100 son:");
        for (int i = 0; i < numerosPares.length; i++) {
            System.out.print(numerosPares[i] + " ");  
        }
    }
}

