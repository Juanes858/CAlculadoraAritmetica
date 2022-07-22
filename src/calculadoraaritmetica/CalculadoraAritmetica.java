/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraaritmetica;

import java.util.Scanner;

/**
 *
 * @author Juanes
 */
public class CalculadoraAritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2;
        int opcion;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("CALCULADORA");
        System.out.println("Por favor ngresar el primer numero: ");
        num1 = sc.nextDouble();
        System.out.println("Por favor ingrese el segundo numero: ");
        num2 = sc.nextDouble();
        
        do{
            System.out.println("\nCALCULADORA");
            System.out.println("Digite la opcion de la operacion a realizar"
                    + "\n1. Suma"
                    + "\n2. Resta"
                    + "\n3. Multiplicacion"
                    + "\n4. Division"
                    + "\n5. Digitar otros valores"
                    + "\n6. Finalizar");
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("== SUMA ==");
                    double Suma = num1 + num2;
                    System.out.println(num1+" + "+num2+" = "+Suma);
                    break; 
                case 2:
                    System.out.println("== RESTA ==");
                    double Resta = num1 - num2;
                    System.out.println(num1+" + "+num2+" = "+Resta);
                    break;
                case 3:
                    System.out.println("== MULTIPLICACION ==");
                    double Multiplicacion = num1 * num2;
                    System.out.println(num1+" + "+num2+" = "+Multiplicacion);
                    break;
                case 4:  
                    System.out.println("== DIVISION ==");
                    double Division = num1 / num2;
                    System.out.println(num1+" + "+num2+" = "+Division);
                    break;
                case 5:
                    System.out.println("\nCALCULADORA");
                    System.out.println("Por favor ngresar el primer numero: ");
                    num1 = sc.nextDouble();
                    System.out.println("Por favor ingrese el segundo numero: ");
                    num2 = sc.nextDouble();
                    break;
                case 6:
                    System.out.println("Muchas gracias por usar este programa, vuelva pronto ");
                    break;
                default:
                    System.out.println("Pro favor ingrese un valor valido");
                    break;
            }
        }while(opcion != 6);
    }
    
}
