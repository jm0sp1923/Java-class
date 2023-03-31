package jm0sp;

import java.util.Scanner;

public class CrearEmpleados {
    Scanner sc = new Scanner(System.in);
    String x[][];
    CrearEmpleados(String empleados[][], int fila){
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
       
        
        empleados[fila][0] = nombre; 
        empleados[fila][1] = apellido;
        empleados[fila][2] = identificacion;
        empleados[fila][3] = edad;
        empleados[fila][4] = tipoEmpleado;   
        this.x = empleados;
      
    }

    
}