package tema5;

import java.util.Scanner;

public class Tema5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double ladoA, ladoB, hipotenusa;
        
        System.out.println("Ingrese el lado A");
        ladoA = sc.nextDouble();
        System.out.println("Ingrese el lado B");
        ladoB = sc.nextDouble();
        
        hipotenusa = CalcularHipotenusa(ladoA,ladoB);
        
        System.out.println("Tu hipotenusa mide " + hipotenusa);
        
    }
    
    public static double CalcularHipotenusa(double ladoA, double ladoB){
        return Math.sqrt(ladoA*ladoA+ladoB*ladoB);
    }
    
}
