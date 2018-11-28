package metodos;

import consola.Consola;
import funcion.*;

public class Trapecio extends Base {

    public Trapecio() {
        this.espaciado = 0;
        this.decimales = 10;
    }

    public double evaluar(Funcion funcion, double a, double b) {
        //0.2 + 25*x - 200*x^2 + 675*x^3 - 900*x^4 + 400*x^5
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println();
        
//        System.out.println("Resultado en la funcion F(a)"+ this.redondear(funcion.evaluar(a) ));
//        System.out.println("Resultado en la funcion F(b)"+ this.redondear(funcion.evaluar(b) ));
//        System.out.println();
        double resultado =((b - a)  * ((funcion.evaluar(a) + funcion.evaluar(b))/2));



        System.out.println("");
        System.out.println("Resultado:");
        System.out.println(this.redondear(resultado));




        return resultado;

    }

    public void consola() {

        Consola consola = new Consola();
        String funcion_cadena = consola.getCadena("Ingresa la Funcion");
        double a = consola.getNumero("Ingresa el Valor para a");
        double b = consola.getNumero("Ingresa el Valor para b");


        boolean fraccion = consola.getBoolean("Quieres usar Fraccciones?");
        int decimales = consola.getEntero("cuantos decimales queres usar para el reporte?", 6);

        this.fraccion = fraccion;
        this.decimales = decimales;

        consola.limpiarPantalla();
        Funcion funcion = new Funcion(funcion_cadena);
        this.evaluar(funcion, a, b);

    }
}
