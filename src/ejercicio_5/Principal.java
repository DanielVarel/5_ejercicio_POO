package ejercicio_5;

import java.util.Scanner;

public class Principal {
    
    public static double mayorAera(Triangulo triangulos[]){
        double area = triangulos[0].obtenerArea();
        for(int i=1; i<triangulos.length; i++){
            if(triangulos[i].obtenerArea()> area){
                    area = triangulos[i].obtenerArea();
            }
        }
        return area;
    }
    
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        double lado, base;
        int nTriangulos;
        
        System.out.print("Digite el numero de triangulos: ");
        nTriangulos = entrada.nextInt();
        
        Triangulo triangulos[] = new Triangulo[nTriangulos];
        
        for(int i=0; i<triangulos.length; i++){
            System.out.println("\nDigite los datos del "+(i+1)+" triangulo: ");
            System.out.print("Digite la base: ");
            base = entrada.nextDouble();
            System.out.print("Digite el valor de los lados: ");
            lado = entrada.nextDouble();
            triangulos[i] = new Triangulo(lado, base);
            
            System.out.println("\nEl perimetro del triangulo es: "+triangulos[i].obtenerPerimetro());
            System.out.println("El area es: "+triangulos[i].obtenerArea());
            
        }
        
        System.out.println("\nEl area del triangulo con mayor superficie es: "+mayorAera(triangulos));
        
        
    }
}
