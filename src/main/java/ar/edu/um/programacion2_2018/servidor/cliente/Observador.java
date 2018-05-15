package ar.edu.um.programacion2_2018.servidor.cliente;

import java.io.IOException;

public class Observador {

    public static void main(String[] args) throws IOException{  
        System.out.println("Inicia el cliente");
		
        /*CREO LAS COLAS*/
		ColaCaja cola = new ColaCaja();
		ColaCaja cola2 = new ColaCaja();
		ColaCaja cola3 = new ColaCaja();
		ColaCaja cola4 = new ColaCaja();
		ColaCaja cola5 = new ColaCaja();
		
		/*CREO LOS LLENADORES DE LAS COLAS*/
        Llenador lle1 = new Llenador(cola);
        Llenador lle2 = new Llenador(cola2);
        Llenador lle3 = new Llenador(cola3);
        Llenador lle4 = new Llenador(cola4);
        Llenador lle5 = new Llenador(cola5);
               
        /*INICIO LOS LLENADORES*/
        lle1.start();
        lle2.start();
        lle3.start();
        lle4.start();
        lle5.start();
       
        /*INICIO LAS COLAS Y LAS CONEXIONES A LAS CAJAS*/
        cola.start();
        cola2.start();
        cola3.start();
        cola4.start();
        cola5.start();
        
    }
   
}