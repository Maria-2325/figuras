
package com.mycompany.figuras;


public class Cuadrado {
    //Atributos
    public Double lado;

    public Cuadrado(Double lado) {
        this.lado = lado;
    }
    
    
    
    //Métodos
    public double calcularArea (){
       return lado * lado;
    }
    public double calcularPerimetro(){
        return 4 * lado;
    }
    
    
}
