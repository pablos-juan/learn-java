package projects.mercaRegala;
//revisar el código y mejorar la estructura. Puede que el patron de diseño factory haga mas limpio el código, pero justo
//ahora no estoy seguro de como pasar los atributos a los métodos constructores individualmente

import java.util.Scanner;

public class Almacen {
    private final Producto[] productos = new Producto[20];

    public Almacen(){
    }

    //método para instanciar un producto y agregar al almacen
    public void agregarProducto(int tipo){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        System.out.println("AGREGAR UN PRODUCTO: ");
        //solicitar las instacias del producto
        System.out.println("nombre del producto: ");
        String name = scanner.next();
        System.out.println("peso del producto: ");
        double peso = scanner.nextDouble();
        System.out.println("precio por kilo: ");
        double precioKg = scanner.nextDouble();

        //abstraer mensaje para producto agregado
        String message = "producto agregado.";
        //definir el tripo de producto
        switch (tipo) {
            case 1 -> {
                //reunir los atributos faltantes para instanciar la clase
                System.out.println("digite los días de caducidad: ");
                int caducidad = scanner.nextInt();
                //agregar objeto a el arreglo de productos
                ponerEnAlmacen(new CarneFresca(name, peso, precioKg, caducidad));
                System.out.println(message);
            }
            case 2 -> {
                //reunir los atributos faltantes para instanciar la clase
                System.out.println("digite la empresa distribuidora: ");
                String distribuidora = scanner.next();

                System.out.println("viene en bandeja: ");
                boolean enVandeja = scanner.nextBoolean();

                //agregar objeto a el arreglo de productos
                ponerEnAlmacen(new CongeladaPiezaEntera(name, peso, precioKg, distribuidora, enVandeja));
                System.out.println(message);
            }
            case 3 -> {
                //atributos faltantes
                System.out.println("digite la empresa distribuidora: ");
                String distribuidora = scanner.next();

                System.out.println("digite la media de piezas: ");
                int mediaPiezas = scanner.nextInt();

                //instanciar un nuevo producto
                ponerEnAlmacen(new CongeladaPiezaTrozada(name, peso, precioKg, distribuidora, mediaPiezas));
                System.out.println(message);
            }
            case 4 -> {
                ponerEnAlmacen(new Pescado(name, peso, precioKg));
                System.out.println(message);
            }
        }
    }

    //método privado para agregar un producto al almacen
    private void ponerEnAlmacen(Producto producto){
        for (int i=0; i<productos.length; i++){
            if (productos[i] == null){
                productos[i] = producto;
                return;
            }
        }
    }

    private final String noProductMessage = "no hay productos en el almacen.";
    private boolean sinProductos(){
        for (Producto producto: productos){
            if (producto != null) return false;
        }
        return true;
    }

    public void productosEnPeligro(){
        if (sinProductos()){
            System.out.println(noProductMessage);
        } else {
            for (Producto producto: productos){
                if (producto instanceof CarneFresca && ((CarneFresca) producto).getDiasCaducidad()<10){
                    System.out.println(producto.getInfo());
                }
            }
        }
    }

    public void mostrarAlmacen(){
        if (sinProductos()){
            System.out.println(noProductMessage);
        } else {
            System.out.println("\tPRODUCTOS EN EL ALMACEN: ");
            for (Producto producto: productos){
                if (producto != null){
                    System.out.println("nombre: " + producto.getNombre() +
                            "\nprecio: $" + producto.getPrecio() +
                            "\n --------------------------");
                }
            }
        }
    }

    public void precioMedio(){
        if (sinProductos()){
            System.out.println(noProductMessage);
        } else {
            double acum = 0;
            int i = 0;
            for (Producto producto: productos){
                if (producto != null){
                    acum += producto.getPrecio();
                    i++;
                }
            }
            System.out.println("Precio medio de los productos en el almacen: $" + (acum/i));
        }
    }

    public void eliminarVandejas(){
        if (sinProductos()){
            System.out.println(noProductMessage);
        } else {
            for (int i=0; i<productos.length; i++){
                if (productos[i] instanceof CongeladaPiezaEntera && ((CongeladaPiezaEntera) productos[i]).getVieneEnVandeja()){
                    eliminar(i);
                    System.out.println("se eliminó: " + productos[i].getNombre());
                }
            }
        }
    }

    private void eliminar(int posicion){
        for (int i=posicion; i<productos.length-1; i++){
            productos[i] = productos[i+1];
        }
    }
}
