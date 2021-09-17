/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import empleado.Empleado;
import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado[] empleados =new Empleado[5];
        Scanner entrada=new Scanner(System.in);
        int opcion;
        int contador=0;
        
        do{
            System.out.println("TABLA DE OPCIONES");
            System.out.println("--------------------------");
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Mostrar Empleado");
            System.out.println("3. Mostrar Empleados");
            System.out.println("4. Salir");
            
            System.out.print("Digite una opcion:");
            opcion=entrada.nextInt();
            
            switch(opcion){
                case 1:
                    empleados[contador]=new Empleado();
                    System.out.println("Digita el id: ");
                    empleados[contador].setId(entrada.nextInt());
                    System.out.println("Digita el nombre: ");
                    empleados[contador].setNombre(entrada.next());
                    System.out.println("Digita el cargo: ");
                    empleados[contador].setCargo(entrada.next());
                    System.out.println("Digita el salario: ");
                    empleados[contador].setSalario(entrada.nextInt());
                    System.out.println("Digita el Telefono: ");
                    empleados[contador].setTelefono(entrada.next());
                    System.out.println("Digita la direccion: ");
                    empleados[contador].setDireccion(entrada.next());
                    
                    contador++;
                    break;
                    
                case 2:
                    break;
                    
                case 3:
                    for(int i=0;i<contador;i++)
                        System.out.println(empleados[i].getNombre());
                        
                    break;
                    
                case 4:
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Numero invalido");
                    break;
            }
        }while(opcion != 4);
    }
    
}
