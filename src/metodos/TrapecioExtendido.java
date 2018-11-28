package metodos;

import consola.Consola;
import funcion.*;

public class TrapecioExtendido extends Base {

    public TrapecioExtendido() {
        this.espaciado = 0;
        this.decimales = 10;
    }

    public double evaluar(double x0, double x1, double x2, double f0, double f1, double f2) {
     //0.2 + 25*x - 200*x^2 + 675*x^3 - 900*x^4 + 400*x^5
        System.out.println("a: " + x0);
        System.out.println("b: " + x1);
        System.out.println("a: " + x2);
        System.out.println("b: " + f0);
        System.out.println("a: " + f1);
        System.out.println("b: " + f2);
        System.out.println();
        
//        System.out.println("Resultado en la funcion F(a)"+ this.redondear(funcion.evaluar(a) ));
//        System.out.println("Resultado en la funcion F(b)"+ this.redondear(funcion.evaluar(b) ));
//        System.out.println();
        double resultado =((x2 - x0)  * ((f0 + f2)/2));



        System.out.println("");
        System.out.println("Resultado:");
        System.out.println(this.redondear(resultado));




        return resultado;

    }

    public void consola() {

        Consola consola = new Consola();
        double x0 = consola.getNumero("Ingresa el Valor para x0");
        double x1 = consola.getNumero("Ingresa el Valor para x1");
        double x2 = consola.getNumero("Ingresa el Valor para x2");
        double f0 = consola.getNumero("Ingresa el Valor para f0");
        double f1= consola.getNumero("Ingresa el Valor para f1");
        double f2 = consola.getNumero("Ingresa el Valor para f2");


        boolean fraccion = consola.getBoolean("Quieres usar Fraccciones?");
        int decimales = consola.getEntero("cuantos decimales queres usar para el reporte?", 6);

        this.fraccion = fraccion;
        this.decimales = decimales;

        consola.limpiarPantalla();
        this.evaluar(x0,x1,x2,f0,f1,f2);

    }
}
