/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trapaciosimpsons;

import consola.Menu;
import consola.MenuCallback;
import metodos.EulerPVI;
import metodos.Trapecio;
import metodos.Simpson1_3;
import metodos.Simpson3_8;
import metodos.TrapecioExtendido;

/**
 *
 * @author Chrono's Laptop
 */
public class TrapacioSimpsons {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setTitulo("Metodos Numericos");
                 menu.agregar("PVI: Euler", new MenuCallback(){
            public void ejecutar(){
                EulerPVI metodo =  new EulerPVI();
                metodo.consola();
            }
        });
                 
                menu.agregar("Trapecio", new MenuCallback() {
            public void ejecutar() {
                Trapecio metodo = new Trapecio();
                metodo.consola();
            }
        });
                /*
                Funcion Trapecio= 0.2 + 25*x - 200*x^2 + 675*x^3 - 900*x^4 + 400*x^5
                a= 0
                b= 0
                */
          menu.agregar("Trapecio (tabulado)", new MenuCallback() {
            public void ejecutar() {
                TrapecioExtendido metodo = new TrapecioExtendido();
                metodo.consola();
            }
        });
          
                  menu.agregar("Simpson 1/3", new MenuCallback() {
            public void ejecutar() {
                Simpson1_3 metodo = new Simpson1_3();
                metodo.consola();
            }
        });
                  /*
                  Funcion Simpson= 3*x^2
                  a= 0
                  b= 2
                  */
                   

                menu.agregar("Simpson 3/8", new MenuCallback() {
            public void ejecutar() {
                Simpson3_8 metodo = new Simpson3_8();
                metodo.consola();
            }
        });   
                
               
          menu.mostrar();
    }
    
}
