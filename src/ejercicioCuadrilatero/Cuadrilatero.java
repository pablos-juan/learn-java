/*
Ejercicio 1: Construir un programa que calcule el área y el perímetro de un cuadrilátero dada la longitud de sus dos lados.
Los valores de la longitud deberán introducirse por línea de ordenes. Si es un cuadrado, sólo se proporcionará la longitud de uno de
los lados al constructor.
*/

package ejercicioCuadrilatero;

public class Cuadrilatero {
    //Atributos.
    private float lado1;
    private float lado2;

    //Método constructor 1. Para cuadrilatero.
    public Cuadrilatero(float lado1, float lado2){
        this.lado1=lado1;
        this.lado2=lado2;
    }

    //Método constructor 2. Para cuadrado.
    public Cuadrilatero(float lado1){
        this.lado1=this.lado2=lado1;
    }

    public float getPerimetro(){
        return 2*(lado1+lado2);
    }

    public float getArea(){
        return lado1*lado2;
    }
}
