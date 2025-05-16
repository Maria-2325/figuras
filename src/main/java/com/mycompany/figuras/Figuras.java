package com.mycompany.figuras;

public class Figuras {

    public static void main(String[] args) {
        System.out.println("\n\t---------Circulo----------");
        Circulo objCirculo = new Circulo(5d);
        System.out.println("El area del circulo es: " + objCirculo.calcularArea());
        System.out.println("El perimetro del circulo es: " + objCirculo.calcularPerimetro());

        
        System.out.println("\n\t-----Cuadrado-----");
        Cuadrado objCuadrado = new Cuadrado(12d);
        System.out.println("El area del cuadrado es: " + objCuadrado.calcularArea());
        System.out.println("El perimetro del cuadrado es: " + objCuadrado.calcularPerimetro());

        
        System.out.println("\n\t-----Rectangulo--------");
        Rectangulo objRectangulo = new Rectangulo(4d, 5d);
        System.out.println("El area del rectangulo es: " + objRectangulo.calcularArea());
        System.out.println("El perimetro del rectangulo es: " + objRectangulo.calcularPerimetro());

        
        System.out.println("\n\t---------Triangulo Rectangulo------");
        TrianguloRectangulo objTrianguloRectangulo = new TrianguloRectangulo(8d, 16d);
        System.out.println("El area del triangulo rectangulo es: " + objRectangulo.calcularArea());
        System.out.println("El perimetro del triangulo rectangulo es: " + objRectangulo.calcularPerimetro());
        System.out.println("La hipotenusa del triangulo rectangulo es: " + objRectangulo.calcularArea());
        System.out.println("El tipo de triangulo es: " + objRectangulo.calcularPerimetro());
        

    }
}
