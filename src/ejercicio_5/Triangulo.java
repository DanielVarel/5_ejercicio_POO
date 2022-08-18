package ejercicio_5;

public class Triangulo {
    // Atributos
    double lados;
    double base;
    
    // Metodos
    public Triangulo(double lados, double base){
        this.lados = lados;
        this.base = base;
    }

    public double obtenerPerimetro() {
        double perimetro = base + (2*lados);
        return perimetro;
    }
    
    public double obtenerArea(){
        double altura = Math.sqrt(Math.pow(lados, 2)- (Math.pow(base, 2)/4));
        double area = (base*altura)/2;
        return area;
    }         
}
