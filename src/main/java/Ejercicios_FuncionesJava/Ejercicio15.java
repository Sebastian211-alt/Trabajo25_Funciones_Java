/*
Calcular e imprimir el coeficiente binomial C definido como:
                C = N! / (N-1)! * I!
*/
package Ejercicios_FuncionesJava;

/**
 *
 * @author SebasTati
 */
public class Ejercicio15 {
    
    public static int Bernoulli (double p){
        
        double ri = Math.random();
        
        if (ri <= p) {
            
            return(1);
            
        }else{
            return(0);
        }
        
    }
    
    public static int Binomial(double p, int ensayos){
        int exitos = 0;
        
        for (int i = 0; i < ensayos; i++) {
            
            if (Bernoulli(p) == 1) {
                
                exitos++;
                
            }
            
        }
        
        return(exitos);
        
    }
    
    public static void main(String[] args) {
        
        for(int i=0; i<10; i++)
        
        System.out.println("Resultado " + Binomial(0.5,10));
    }
    
}
