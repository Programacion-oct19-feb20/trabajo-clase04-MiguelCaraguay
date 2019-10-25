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
public class EjercicioTres {
    /*
    Generar un programa que permita pedir datos por teclado para:
    ingreso de nombtes completo del estudiante
    ingreso de nota 1 (debe ser entero)
    ingreso de nota 2 (debe ser entero)
    ingreso de ciclo que cursa en alimno (debe ser cadena)
    Luego presentar en pantalla los datos de la siguiente forma:
    Informe de alumno:
    Nombres Completos:
    Ciclo:
    Nota 1:
    Nora 2:
    */
     public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        int nota1;
        int nota2;
        String ciclo;
        
        System.out.println("Ingrese su Nombre completo");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su Nota 1");
        nota1 = entrada.nextInt();
        System.out.println("Ingrese su Nota 2");
        nota2 = entrada.nextInt();
        entrada.nextLine();  // se limpia para poder volver a hacer cadena
        System.out.println("Ingrese su Ciclo");
        ciclo = entrada.nextLine();
        
        System.out.printf("Informe del Alumno\nNombres Completos: %s\nCiclo: "
                + "%s\nNota 1: %d\nNota 2: %d\n", nombre, ciclo, nota1, nota2);
     }
    
}
