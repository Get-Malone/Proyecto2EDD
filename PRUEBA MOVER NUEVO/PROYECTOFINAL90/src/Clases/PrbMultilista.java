/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author zgame
 */
public class PrbMultilista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Nodo r=null;
        
        //CREA UN NODO PARA CADA PAIS 
        Nodo p1 = new Nodo(null,"Fracia");
        Nodo p2 = new Nodo(null,"Afganistan");
        Nodo p3 = new Nodo(null,"Mexico");
        
        //CREA UN NODO PARA CADA ESTADO
        Nodo e1 = new Nodo(null,"Edo Mexico");
        Nodo e2 = new Nodo(null,"Jalisco");
        Nodo e3 = new Nodo(null,"Guerrero");
        
        //CREA UN NODO PARA CADA MUNICIIO
        Nodo m1 = new Nodo(null,"Xonacatlan");
        Nodo m2 = new Nodo(null,"Toluca");
        Nodo m3 = new Nodo(null,"Valle de Bravo");
        
        //INSERTA LOS DATOS DE LOS PAISES 
        
        System.out.println("---INSERTA LOS PAISES---");
        
        String []etqs = new String[1];//ARREGLO DE ETIQUETAS
        
        etqs[0]="Francia";
        r=Multilistas.inserta(r,p1,0,etqs);
        etqs[0]="Afganistan";
        r=Multilistas.inserta(r,p2,0,etqs);
        etqs[0]="Mexico";
        r=Multilistas.inserta(r,p3,0,etqs);
        
        //System.out.println(Multilistas.desp(r, 0));
        
        
        //INSERTA LOS DATOS DE LOS ESTADOS
        System.out.println("---INSERTA LOS ESTADOS---");
        
        etqs = new String[2];
        etqs[0]="Mexico";//ACCEDE AL PAIS MEXICO
        
        etqs[1] = "Edo Mexico";
        r=Multilistas.inserta(r,e1,0,etqs);
        etqs[1]="Jalisco";
        r=Multilistas.inserta(r,e2,0,etqs);
        etqs[1]="Guerrero";
        r=Multilistas.inserta(r,e3,0,etqs);
        
        //System.out.println(Multilistas.desp(r,0));
        
        
        System.out.println("---INSERTA LAS MUNICIPIOS---");
        etqs = new String[3];
        etqs[0]="Mexico";
        etqs[1] = "Edo Mexico";
        
        etqs[2]="Xonacatlan";
        r=Multilistas.inserta(r,m1,0,etqs);
        etqs[2]="Toluca";
        r=Multilistas.inserta(r,m2,0,etqs);
        etqs[2]="Valle de Bravo";
        r=Multilistas.inserta(r,m3,0,etqs);
        
        //System.out.println(Multilistas.desp(r,0));
        
        
        String prueba = "abcñ";
        System.out.println(prueba.toUpperCase().codePointAt(0));
        
        
        //System.out.println("---BUSCA UN ELEMENTO DENTRO DE LA MULTILISTA---");
        
       //Multilistas.busca(r,"Jalisco");
        
    }
    
}
