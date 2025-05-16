
package com.mycompany.figuras;


public class Rectangulo {
    //Atributos
    public Double base;
    public Double altura;
    
    public Rectangulo (Double base,Double altura ){
        this.altura = altura;
        this.base = base;
    }
    
    //Métodos
    public double calcularArea (){
       return base * altura;
    }
    public double calcularPerimetro(){
        return 2*(base + altura);
    }
    
    
    
    
}
