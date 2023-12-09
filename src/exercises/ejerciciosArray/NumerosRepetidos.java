package exercises.ejerciciosArray;

public class NumerosRepetidos {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int filas = matriz.length;
        int columnas = matriz[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("\nmatriz invertida");
        for (int i = matriz.length-1; i>0; i--){
            for (int j = matriz[i].length-1; j>0 ;j--){
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
        //comprobar si hay un número repetido 
        System.out.println(repetido(matriz));
    }

    //reescribir con hashmap
    public static boolean repetido(int[][] matriz){
        System.out.println("Repetidos: ");

        //recorrer matriz
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                int elementoActual = matriz[i][j]; //asignar un elemento actual 

                //buscar el elemento seleccionado 
                for(int x=0; x<matriz.length; x++){
                    for(int y=0; y<matriz[0].length; y++){
                        if (x!=i && y!=j && elementoActual == matriz[x][y]) return true;
                    }
                }
                
            }
        }
        return false;
    }
}
