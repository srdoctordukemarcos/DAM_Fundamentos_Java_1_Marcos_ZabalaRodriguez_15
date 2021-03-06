package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Bienvenido, por favor introduzca una fecha a corroborar.");
        Scanner sc = new Scanner(System.in);
        int day=sc.nextInt();
        int month=sc.nextInt();
        int year=sc.nextInt();
        check(day,month,year);
    }

    /*
    Función main donde pediremos las variables día, mes y año al usuario.
     */

    private static void check(int day, int month, int year) {
        if(day<0||day>30){
            System.out.println("El día es incorrecto.");
        }else{
            if(month<0||month>12){
                System.out.println("El mes es incorrecto.");
            }else{
                if(year<0){
                    System.out.println("El año es incorrecto.");
                }else{
                    System.out.println("La fecha es correcta.");
                }
            }
        }
    }

    /*
    Aquí comprobaremos que las variables son correctas.
     */
}
