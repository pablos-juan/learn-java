package ejerciciosClasesObjetos.cafeteria;

public class Test {
    public static void main(String[] args) {
        Caferetia predeterminada = new Caferetia();
        Caferetia miCafeteria = new Caferetia(3000);
        Caferetia otraCafeteia = new Caferetia(2000, 500);

        predeterminada.llenarCafetera();
        System.out.println("Cantidad de cafe cafetería predeterminada: " + predeterminada.getCantidadActual());

        miCafeteria.vaciarCafeteria();
        System.out.println("Cantidad de café miCafetería: " + miCafeteria.getCantidadActual());

        otraCafeteia.servirTaza(100);
        System.out.println("Cantidad de café otraCafetería: " + otraCafeteia.getCantidadActual());
        otraCafeteia.agregarCafe(1900);
        System.out.println(otraCafeteia.getCantidadActual());
    }
}
