//Crea una función que nos devuelva un array de un numero a otro, ambos incluidos. 
//Por ejemplo, si introduzco de 5 a 7, el array tendrá los números 5,6,7 pero si inserto 
//de 7 a 5, el array tendrá los números de 7 a 5.

package arrays;

public class Serie {
    public static void main(String[] args) {
        int[] arreglo1 = serie(5, 6);    
        int[] arreglo2 = serie(8, 3);
        int[] arreglo3 = serie(5, 5);

        System.out.println("de 5 a 6: ");
        print(arreglo1);
        System.out.println("de 8 a 3: ");
        print(arreglo2);
        System.out.println("de 5 a 5: ");
        print(arreglo3);

    }
       
    public static int[] serie(int nInicio, int nFinal){
        int tamanio = Math.abs(nInicio - nFinal) + 1; //valor absoluto de esa operación
        int[] serie = new int[tamanio];

        if(nInicio < nFinal){
            for(int i=0; i<serie.length; i++){
                serie[i]=nInicio;
                nInicio++;
            }
        } else{
            for(int i=0; i<serie.length; i++){
                serie[i]=nInicio;
                nInicio --;
            }
        }
        return serie;
    }

    public static void print(int[] arreglo){
        for(int i=0; i<arreglo.length; i++){
            System.out.println(arreglo[i]);
        }
    }
}



