package com.mycompany.figuras;

public class Figuras {

    public static void main(String[] args) {
        System.out.println("\n\t---------Circulo----------");
        Circulo objCirculo = new Circulo(5d);
        System.out.println("Datos: ");
        System.out.println("El radio es: " + objCirculo.radio);
        System.out.println("El area del circulo es: " + objCirculo.calcularArea() + " cm^2");
        System.out.println("El perimetro del circulo es: " + objCirculo.calcularPerimetro() + " cm" );

        
        System.out.println("\n\t-----Cuadrado-----");
        Cuadrado objCuadrado = new Cuadrado(12d);
        System.out.println("Datos: ");
        System.out.println("El lado es: " + objCuadrado.lado);
        System.out.println("El area del cuadrado es: " + objCuadrado.calcularArea() + " cm^2");
        System.out.println("El perimetro del cuadrado es: " + objCuadrado.calcularPerimetro() + " cm" );

        
        System.out.println("\n\t-----Rectangulo--------");
        Rectangulo objRectangulo = new Rectangulo(4d, 5d);
        System.out.println("Datos: ");
        System.out.println("La base es: " + objRectangulo.base);
        System.out.println("La altura es: " + objRectangulo.altura);
        System.out.println("El area del rectangulo es: " + objRectangulo.calcularArea() + " cm^2");
        System.out.println("El perimetro del rectangulo es: " + objRectangulo.calcularPerimetro() + " cm" );

        
        System.out.println("\n\t---------Triangulo Rectangulo------");
        TrianguloRectangulo objTrianguloRectangulo = new TrianguloRectangulo(8d, 16d);
        System.out.println("Datos: ");
        System.out.println("La base es: " + objTrianguloRectangulo.base);
        System.out.println("La altura es: " + objTrianguloRectangulo.altura);
        System.out.println("El area del triangulo rectangulo es: " + objTrianguloRectangulo.calcularArea() + " cm^2" );
        System.out.println("El perimetro del triangulo rectangulo es: " + objTrianguloRectangulo.calcularPerimetro() + " cm" );
        System.out.println("La hipotenusa del triangulo rectangulo es: " + objTrianguloRectangulo.calcularHipotenusa() + " cm" );
        System.out.println("El tipo de triangulo es: " + objTrianguloRectangulo.determinarTipoTriangulo());
        

    }
}
