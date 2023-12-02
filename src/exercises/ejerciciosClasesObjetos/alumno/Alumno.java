package exercises.ejerciciosClasesObjetos.alumno;

public class Alumno {
    private String nombre;
    private double[] notas;

    public Alumno(String nombre){
        this.nombre = nombre;
        this.notas =  new double[3];
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getNota(int evaluacion){
        if (numeroNotas()==0 || evaluacion-1>3 
            || evaluacion-1<0) return -1;
        return notas[evaluacion-1];
    }

    public boolean ponerNota(int evaluacion, double nota){
        if (evaluacion-1>=0 && evaluacion-1<=3 && nota>0 && nota<=10){
            notas[evaluacion-1]=nota;
            return true;
        }
        return false;
    }

    public boolean quitarNota(int evaluacion){
        if (notas[evaluacion-1]==0 && evaluacion-1<0 && evaluacion-1>=3){
            return false;
        }
        notas[evaluacion-1]=0;
        return true;
    }

    public int numeroNotas(){
        int nNotas=0;
        for (double nota : notas) {
            if (nota != 0) nNotas++;
        }
        return nNotas;
    }

    public double notaMaxima(){
        //comprobar si no hay notas
        if (numeroNotas()==0) return -1;

        double nMayor=notas[0];
        for (int i=1; i<notas.length; i++){
            //nuevo mayor
            if (nMayor<notas[i]) nMayor=notas[i];
        }
        return nMayor;
    }

    public boolean tieneNota(int evaluacion){
        return evaluacion-1 >= 0 && evaluacion-1 < 3 
                && notas[evaluacion]!=0;
    }

    public void mostrarNotas(){
        for(int i=0; i<notas.length; i++){
            System.out.println("nota " + (i+1) + ": " + notas[i]);
        }
    }

}
