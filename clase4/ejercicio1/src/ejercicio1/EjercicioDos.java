/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class EjercicioDos {
    /*
    Generar un programa que permita pedir datos por teclado para:
    ingreso de nombre
    ingreso de ciudad de nacimiento
    ingreso de edad
    ingreso de costo de matricula
    
    Luego presentar en pantalla los datos de la siguiente forma:
    Datos personales:
    Nombre:
    Ciudad de nacimiento:
    Edad:
    Matricula:
    */
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        String ciudad;
        int edad;
        double matricula;
        
        
        System.out.println("Ingres sus nombres");
        nombre = entrada.nextLine();
        System.out.println("Ingres su ciudad");
        ciudad = entrada.nextLine();
        System.out.println("Ingres su edad");
        edad = entrada.nextInt(); // ingreso de enteros
        System.out.println("Ingrese su valor de matricula");
        matricula = entrada.nextDouble(); // ingreso de decimales
        
        System.out.printf("Datos Personales: \nNombre:%s\nCiudad de nacimiento:"
              + "%s\nEdad:%d\nMatricula:%.1f\n", nombre, ciudad, edad,
              matricula);
        /*
        %s cadena
        %d entero
        %f decimal
        */

    }
}
