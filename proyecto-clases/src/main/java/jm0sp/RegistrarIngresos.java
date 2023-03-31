package jm0sp;

import java.util.Scanner;

class RegistrarIngresos{
    Scanner sc = new Scanner(System.in);
    String x[][];
    
    RegistrarIngresos(String empleados[][],int fila){
        System.out.println("Digite su codigo para ingresar fecha y hora de ingreso");    
        int codigoEmpleado = sc.nextInt();
        boolean existe = false;
        for(int i =0;i<fila;i++){
        if(Integer.parseInt(empleados[0][2]) == codigoEmpleado){
            System.out.println("Empleado: "+empleados[i][0]);
            System.out.println("Digite la hora de entrada(El formato debe ser 2400)");
            int hora = sc.nextInt();

            System.out.println("Digite la fecha de entrada(El formato debe ser ddmmyyyy)");
            int fecha = sc.nextInt();

            empleados[i][5] = (hora+"");
            empleados[i][6] = (fecha+"");
            this.x = empleados;
            existe = true;
            return;
            }
        }if(!existe){
            System.out.println("No se ha encontrado ninung empleado con ese codigo");
        }
    }
}
 