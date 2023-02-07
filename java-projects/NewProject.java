/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.newproject;

/**
 *
 * @author Developer
 */
public class NewProject {
    //This is a comment
    public static void main(String[] args) {
        int x, y, z;
        x = y = z = 50;
        float f1 = 35e3f;
        System.out.println(f1);
        char myGrade = 'b';
        System.out.println(myGrade);
        char virgulilla = 126;
        char pesitos = 36;
        System.out.println(virgulilla);
        int asignacion = 10;
        asignacion += 5;
        System.out.println(asignacion);
        String vocales = "aeiou";
        System.out.println("La longitud de esta cadena es de: " + vocales.length());
        System.out.println("Hello World!");
        String saludo = "Hello My Friends";
        System.out.println(saludo.toUpperCase());
        System.out.println(saludo.toLowerCase());
        System.out.println(saludo.indexOf("Fri"));
        System.out.println(5*8); //this is a comment
        /*esto seria un comentario
        de bloque que comienza en una linea y termina en otra */
        

        System.out.println(x + y + z);
        int randomNumber = (int)(Math.random() * 101);
        int secondRandomNumber = (int) (Math.random() * 1001);
        System.out.println(randomNumber);
        System.out.println(secondRandomNumber);
        int time = 22;
        String saludoDelDia = (time <= 18) ? "Have a Good Day " : "Have a Good night";
        System.out.println(saludoDelDia);
        
        // Outer loop
        for (int i = 1; i <= 2; i++) {
        System.out.println("Bucle externo: " + i); // Executes 2 times

        // Inner loop
        for (int j = 1; j <= 3; j++) {
            System.out.println(" Bucle interno: " + j); // Executes 6 times (2 * 3)
        }
        } 
        
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
          System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
          if (i == 4) {
            break;
          }
          System.out.println(i);
        }
        for (int i = 0; i < 10; i++) {
          if (i == 4) {
            continue;
          }
          System.out.println(i);
        }
        int i = 0;
        while (i < 10) {
          System.out.println(i);
          i++;
          if (i == 4) {
            break;
          }
        }
        
        
        
    }
}
