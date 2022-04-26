/*

Escriba un programa que calcule los primeros 15 términos de la serie de fibonacci que
son 1,1,2,3,5,8,13, 21....etc. Observe que los dos primeros términos son invariables 1 y
1, seguidamente los demás términos se calculan de la forma:

1 + 1 = 2, 1 + 2 = 3, 2 + 3 = 5, 3 + 5 = 8 etc

*/
package Ejercicios_FuncionesJava;

import java.util.Scanner;

/**
 *
 * @author SebasTati
 */
public class Ejercicio16 {
    
    static Scanner sc = new Scanner(System.in);
    
    static boolean esFibonacci(int numero){
        
        int pre = 0, pos = 1, suma;
        
        boolean bandera = false;
        
        while( pre <= numero){
            if( pre == numero)
                bandera = true;
            
            suma = pre + pos;
            pre = pos;
            pos = suma;
        }
        
        return bandera;
        
    }
    
    public static void main(String[] args) {
        
        int numero;
        
        System.out.println("Favor ingresar un numero: ");
        numero = sc.nextInt();
        
        if( esFibonacci(numero))
            System.out.println("El numero SI pertence a la serie fibonacci ");
        else
            System.out.println("El numero NO pertenece a la serie fibonacci ");
    }
}
