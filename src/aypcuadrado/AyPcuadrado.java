/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aypcuadrado;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class AyPcuadrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float area, perimetro, lado;
        System.out.println("escriba la medida de un lado del cuadrado");
        Scanner sc=new Scanner (System.in);
        lado = sc.nextFloat();
        
        area=lado*lado;
        perimetro=4*lado;
        
        System.out.println("el area del cuadrado es "+area);
        System.out.println("el perimetro del cuadrado es "+perimetro);
        
        
    }
    
}
