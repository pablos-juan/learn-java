package exercises.ejerciciosClasesObjetos.hora;

import java.util.Scanner;

public class Hora{
    Scanner sc = new Scanner(System.in);
    private int hora;
    private int minutos;
    private int segundos;

    public Hora(){
    }

    public Hora(int hora, int minutos, int segundos){
        this.hora=hora;
        this.minutos=minutos;
        this.segundos=segundos;
        valida(hora, minutos, segundos);
    }


    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    //solicitar la hora, los minutos y los segundos
    public void leer() {
        System.out.print("Ingrese la hora: ");
        this.hora=sc.nextInt();

        System.out.print("Ingrese los minutos: ");
        this.minutos=sc.nextInt();

        System.out.print("Ingrese los segundos: ");
        this.segundos=sc.nextInt();

        valida(hora, minutos, segundos);
        print();
    }

    //comprobar la hora
    private void valida(int hora, int minutos, int segundos){
        if(hora>24 || hora<0) setHora(0);
        if(minutos>59 || minutos<0) setMinutos(0);
        if(segundos>59 || segundos<0) setSegundos(0); 
    }

    // @Override
    // public String toString(){
    //     return String.format("%2d:%2d:%2d", hora, minutos, segundos);
    // }

    public void print(){
        System.out.println(hora + ":" + minutos + ":" + segundos);
    }

    //muestra los segundos desde media noche
    public int aSegundos(){
        int segundosNoche = (hora * 3600) + (minutos * 60) + segundos;
        return segundosNoche;
    }

    //segundos desde media noche
    public void deSegundos(){
        System.out.print("Digite los segundos: ");
        int segundosNoche = sc.nextInt();

        this.segundos = segundosNoche/3600;
        segundosNoche = segundosNoche%3600;
        this.minutos = segundosNoche/60;
        this.segundos = segundosNoche%60;
    }

    //mostrar segundos transcurridos desde una hora hasta otra 
    public int segundosDesde(Hora otraHora){
        int hora1 = otraHora.aSegundos();
        System.out.println("Segundos de la primera hora: " + hora1);
        int hora2 = this.aSegundos();
        System.out.println("Segundos de la segunda hora: " + hora2);
        if(hora1>hora2){
            return hora1 - hora2;
        }
        
        return hora2 - hora1;
    }

    //agregar un segundo
    public void siguiente(){
        segundos++;
        if(segundos>59){
            segundos=0;
            minutos++;

            if(minutos>59){
                minutos=0;
                hora++;

                if(hora>23){
                    hora=0;
                }
            }
        }
        print();
    }

    //restar un segundo
    public void anterior(){
        segundos--;
        if(segundos<0){
            segundos=59;
            minutos--;

            if(minutos<0){
                minutos=59;
                hora--;

                if(hora<0){
                    hora=23;
                }
            }
        }
        print();
    }

    //copia hora
    public Hora copia(){
        return new Hora(this.hora, this.minutos, this.segundos);
    }

    //hora igual que 
    public boolean igualQue(Hora otHora){
        return this.hora == otHora.hora && this.minutos == otHora.minutos
        && this.segundos == otHora.segundos;
    }

    //si la hora es menor que otra 
    public boolean menorQue(Hora otraHora) {
        return this.aSegundos() < otraHora.aSegundos();
    }
 
    //si la hora mayor que otra
    public boolean mayorQue(Hora otraHora) {
        return this.aSegundos() > otraHora.aSegundos();
    }


}