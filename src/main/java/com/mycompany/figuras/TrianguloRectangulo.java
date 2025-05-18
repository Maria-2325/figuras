package com.mycompany.figuras;

public class TrianguloRectangulo {
    //Atributos

    public Double base;
    public Double altura;

    public TrianguloRectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Métodos
    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        return calcularHipotenusa() + base + altura;
    }

    public double calcularHipotenusa() {
        return Math.sqrt((base * base) + (altura * altura));
    }

    public String determinarTipoTriangulo() {
        if (base == altura){
            return "Isóceles";
        }else if((base == calcularHipotenusa()) && (altura == calcularHipotenusa()) ){
            return "Equilatero";
        }else{
            return "Escaleno";
        }
    }

}

