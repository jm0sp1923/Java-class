package jm0sp;

import java.util.Scanner;

public class Menu {
    String empleados[][] = new String[100][7];
    int fila = 0;
    Scanner sc = new Scanner(System.in);

    Menu(){
        menu();
    }

    public static void main(String[] args) {
        new Menu();
    }
    void menu(){
        int opc =0;
       do{ 
        System.out.println("1. Crear Empleado");
        System.out.println("2. Registrar Ingreso");
        System.out.println("3. Mostrar todos los ingresos");
        System.out.println("4. Mostrar quienes llegaron tarde");
        System.out.println("5. Mostrar todos los ingresos de OF");
        System.out.println("6. Mostrar todos los ingresos de OP");
        System.out.println("7. Mostrar todos los ingresos de TR");
        System.out.println("0. salir");
        opc = sc.nextInt();

        switch(opc){
            case 1:{
                crearEmpleados();
                break;
            }
            case 2:{
                registrarIngresos();
                break;
            }
            case 3:{
                mostrar();
                break;
            }             
        }

       }while(opc != 0);
    }

    void crearEmpleados(){
       CrearEmpleados crearempleados = new CrearEmpleados(empleados, fila);
       empleados = crearempleados.x;
        fila++;
       
    }

    void registrarIngresos(){
       RegistrarIngresos rg = new RegistrarIngresos(empleados,fila);
        empleados = rg.x;
    }


    void mostrar(){
        for(int i = 0 ; i < fila ; i++){
            for(int j =0;j<=6;j++){
                System.out.print(empleados[i][j]+" ");
            }
            System.out.println();
        }
    }
}
