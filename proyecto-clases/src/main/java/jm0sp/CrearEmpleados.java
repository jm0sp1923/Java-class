package jm0sp;

import java.util.Scanner;

public class CrearEmpleados {
    Scanner sc = new Scanner(System.in);
    String x[][];
    CrearEmpleados(String empleado[][], int fila){
        System.out.println("ingrese el nombre");
        String nombre = sc.nextLine();
        
        System.out.println("ingrese el apellido");
        String apellido = sc.nextLine();
         
        System.out.println("Ingrese el numero de identifiacion");
        String identificacion = sc.nextLine();
       
        System.out.println("ingrese la edad");
        String edad = sc.nextLine();
       
        System.out.println("ingrese el tipo de empleado");
        String tipoEmpleado = sc.nextLine();
       
        
        empleado[fila][0] = nombre; 
        empleado[fila][1] = apellido;
        empleado[fila][2] = ""+identificacion;
        empleado[fila][3] = ""+edad;
        empleado[fila][4] = tipoEmpleado;   
        this.x = empleado;
    }

    
}