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
        
        computadora dell = new computadora();
        System.out.println(computadora.contador);
        computadora asus = new computadora();
        System.out.println(computadora.contador);
        computadora hp = new computadora();
        System.out.println(computadora.contador);
        
        dell.setMicro(hp);
        computadora MSI = dell.getMicro();
        
        System.out.println(dell);
        System.out.println(hp);
        System.out.println(MSI);
        System.out.println(dell.getMicro());
        
        
    }
    
    public static double CalcularHipotenusa(double ladoA, double ladoB){
        return Math.sqrt(ladoA*ladoA+ladoB*ladoB);
    }
    
}
