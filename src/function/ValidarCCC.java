// Crea una función que valide si un CCC (código cuenta cliente) es correcto.
// Un CCC es un numero de 20 dígitos que está formado por las siguientes partes:
//   - Entidad: los 4 primeros números
//   - Oficina: los 4 siguientes números
//   - Dígitos de control: los 2 siguientes números
//   - Número de cuenta: los últimos 10 dígitos
// Para que sea válido, debe cumplir lo siguiente:
//   - Tener 20 dígitos
//   - Que todos sean números
//   - Comprobar que los dígitos de control sean correctos.
// Lanzar una excepción cuando no se cumpla cualquiera de estas opciones.

package function;

public class ValidarCCC {
    public static void main(String[] args) {
        String ccc = "31831974251360758388";
        try {
            validar(ccc);
            System.out.println("CCC correcto");
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void validar (String CCC) throws Exception{
        if (CCC.length() != 20) throw new Exception("longitud debe ser 20 dígitos");
        
        String mensajeError = "";
        String aux;
        String ofice, count, control;
        try { //atrapar excepciones 
            for (int i=0; i<4; i++){
                switch(i){
                    case 0: //entidad 
                        aux = CCC.substring(0, 4);
                        //mensaje en caso de excepcion
                        mensajeError = "el código de entidad no es un número.";
                        Integer.parseInt(aux);
                        break;
                    case 1: //oficina
                        aux = CCC.substring(4, 8);
                        //mensaje en caso de excepcion
                        mensajeError = "el código de oficina no es un número.";
                        Integer.parseInt(aux);                        
                        break;
                    case 2: //numero de cuenta
                        aux = CCC.substring(10, 20);
                        //mensaje en caso de excepcion
                        mensajeError = "el número de cuenta no es un número.";
                        Integer.parseInt(aux);
                        break;
                    case 3: //digito de control
                        aux = CCC.substring(8, 10);
                        //mensaje en caso de excepcion
                        mensajeError = "los dígitos de control no son números.";
                        Integer.parseInt(aux);

                        //número para comprobar el dígito de control 
                        ofice = "00" + CCC.substring(0, 8);
                        count = CCC.substring(10, 20);
                        
                        //obtener dígitos de control
                        control = String.valueOf(obtenerDigitoDeControl(ofice)) 
                                + String.valueOf(obtenerDigitoDeControl(count));   
                        
                        //comprobrar si los dígitos son iguales
                        if (!aux.equals(control)){ //si no es igual
                            mensajeError = "dígitos de control no coinciden";
                            throw new Exception(mensajeError);
                        }
                        break;
                    
                }
            }
        } catch (NumberFormatException e){
            throw new Exception(mensajeError);
        }
    }

    public static int obtenerDigitoDeControl(String cadena){
        int[] factores = {1, 2, 4, 8, 5, 10, 9, 7, 3, 6};
        int digitoControl=0;

        int digitoCuenta;
        for (int i=0; i<cadena.length(); i++){
            //convertir la cadena en String, String en int y agregarlo al digito cuenta
            digitoCuenta = Integer.parseInt(String.valueOf(cadena.charAt(i)));
            //ecuacion para encontrar la base del dígito de control
            digitoControl += digitoCuenta * factores[i];
        }
        digitoControl = 11 - (digitoControl % 11); //numero de 0 a 10 
        if (digitoControl == 11){
            digitoControl = 0;
        } else if ( digitoControl == 10){
            digitoControl = 1;
        }
        return digitoControl;
    }
}
