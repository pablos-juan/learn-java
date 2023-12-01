//Crea una clase Complejo que permita trabajar con números complejos (parte real
//y parte imaginaria). Incluye los siguientes métodos: constructores (por defecto y
//parametrizado), getters, setters, suma, resta, multiplicación, división,
//acumulación y toString().

package ejerciciosClasesObjetos.complejos;

public class Complejo {
    //variables
    private double real;
    private double imaginario;

    //métodos constructores
    public Complejo(){ //constructor vacío
    }
    public Complejo(double real, double imaginario){ //constructor con parámetros
        this.imaginario = imaginario;
        this.real = real;
    }

    //getters y setters
    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    public Complejo suma(Complejo otroComplejo){
        Complejo complejo = new Complejo();

        //calcular suma-resta: real +- real, imaginario +- imaginario
        double nuevoReal=this.real + otroComplejo.getReal();
        double nuevoImaginario=this.imaginario + otroComplejo.getImaginario();

        complejo.setReal(nuevoReal);
        complejo.setImaginario(nuevoImaginario);
        return complejo;
    }

    public Complejo resta(Complejo otroComplejo){
        Complejo complejo = new Complejo();

        double nuevoReal=this.real - otroComplejo.getReal();
        double nuevoImaginario=this.imaginario - otroComplejo.getImaginario();

        complejo.setReal(nuevoReal);
        complejo.setImaginario(nuevoImaginario);
        return complejo;
    }

    public Complejo multiplicar(Complejo otroComplejo){
        Complejo complejo = new Complejo();

        //calcular producto: (real1*real2 - imaginario1*imaginario2) + i(real1*imaginario2 + real2*imaginario1)
        double nuevoReal=(this.real * otroComplejo.getReal())
                - (this.imaginario * otroComplejo.getImaginario());
        double nuevoImaginario=(this.real * otroComplejo.getImaginario())
                + (otroComplejo.getReal() * this.imaginario);

        complejo.setReal(nuevoReal);
        complejo.setImaginario(nuevoImaginario);
        return complejo;
    }

    public Complejo dividir(Complejo otroComplejo){
        Complejo complejo = new Complejo();

        //(r1*r2 + i1*i2)/(r2^2 + i2^2), i(i1*r2 - r1*i2)/(r2^2 + i2^2)
        double nuevoReal = (this.real * otroComplejo.getReal()
                + this.imaginario * otroComplejo.getImaginario())
                / (otroComplejo.getReal() * otroComplejo.getReal()
                + otroComplejo.getImaginario() * otroComplejo.getImaginario());

        double nuevoImaginario = (this.imaginario * otroComplejo.getReal()
                - this.real * otroComplejo.getImaginario())
                / (otroComplejo.getReal() * otroComplejo.getReal()
                + otroComplejo.getImaginario() * otroComplejo.getImaginario());

        complejo.setReal(nuevoReal);
        complejo.setImaginario(nuevoImaginario);
        return complejo;
    }

    @Override
    public String toString(){
        //return String.format("(%.2f, %.2fj)", real, imaginario);
        return "(" + real + ", " + imaginario + "j)";
    }
}
