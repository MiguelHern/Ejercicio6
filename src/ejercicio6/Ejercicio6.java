/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6;
import java.util.Scanner;
/**
 *
 * @author ROCIO
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int numero = entrada.nextInt();
        if(numero>=10 && numero<=99){
        System.out.println("Tiene dos cifras");}
        else {System.out.println("Distinto a dos cifras");
        }
    }
    
}
