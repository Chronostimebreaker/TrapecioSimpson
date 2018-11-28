/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import consola.Consola;
import funcion.*;
/**
 *
 * @author Chronos
 */
public class EulerPVI extends Base {
    
    public EulerPVI(){
        this.espaciado = 5;
        this.decimales = 5;
        this.fraccion = false;
    }
    
    public double evaluar ( Funcion funcion, double x0, double x1, double y, int n){
        
        System.out.println("--------------------------------------------------");
        System.out.println("------------PVI: Metodo Euler-------------");
        System.out.println("--------------------------------------------------");
        
        System.out.println("Valores ingresados:");
        System.out.println("Funcion:"+funcion);
        System.out.println("X0:"+x0);
        System.out.println("X1:"+x1);
        System.out.println("Y:"+y);
        System.out.println("n:"+n);
        System.out.println("--------------------------");
        
        double PVI=0;
        double f,h;
        double X[] = new double [n+1];
        double Y[] = new double [n+1];
        
        h=(x1 - x0)/n;
        System.out.println("h:"+h);
        
        X[0] = x0;
        System.out.println("X0:"+X[0]);
        Y[0] = y;
        System.out.println("Y0:"+Y[0]);
        System.out.println("--------------------------");
        for( int i = 0; i<n; i++){
            f=funcion.evaluar(X[i], Y[i]);
            System.out.println("F(X("+i+"),Y("+i+")) :"+f);
            
            Y[i+1] = Y[i] + (h*f);
            System.out.println("Y"+(i+1)+":"+Y[i+1]);
            
            X[i+1] = X[i] + h;
            System.out.println("X"+(i+1)+":"+X[i+1]);
            System.out.println("--------------------------");
            
        }
        PVI = Y[n];
        
        this.reportarcoordenadas(X, Y);
        
        System.out.println("Resultado del PVI:"+ this.redondear(PVI));
        
        return PVI;
    }
    
    public void consola(){
        System.out.println("--------------------------");
        Consola consola = new Consola();
        String funcion_cadena = consola.getCadena("Ingresar la funcion:");
        double a = consola.getNumero("Ingresar el Valor en a:");
        double b = consola.getNumero("Ingresar el valor en b:");
        double y = consola.getNumero("Ingresar el valor para Y");
        int n = consola.getEntero("Ingresar numero de intervalos:");
        int decimales = consola.getEntero("Cuantos decimales utilizara para los resultados",4);
        
        this.decimales = decimales;
        System.out.println("--------------------------");
        consola.limpiarPantalla();
        Funcion funcion =  new Funcion(funcion_cadena);
        this.evaluar(funcion, a, b, y, n);
    }
    
    
    
    
    
}
