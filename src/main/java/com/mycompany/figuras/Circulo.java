
package com.mycompany.figuras;


public class Circulo {
    //Atributos
    public Double radio; // tipo de variable no recomendada
    
    // 
    public Circulo(Double radio) {
        this.radio = radio;
    }
    
    //Métodos
    public double calcularArea (){
       return radio * radio * Math.PI;
    }
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;  
    }
}
