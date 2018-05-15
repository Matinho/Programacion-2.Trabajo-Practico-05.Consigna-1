package ar.edu.um.programacion2_2018.servidor.cliente;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Supermercado {
	
	public Supermercado() {
		
	}
    
	public static void main(String[] args) throws IOException {
		ServerSocket s_serv = null;	
        System.out.println("Servidor iniciado");
        
        try {
        	s_serv = new ServerSocket(1234);
        	while(true) {
        		Socket s_Cola = s_serv.accept();
        		System.out.println("Nueva cola aceptada");
        		Cajero tmp = new Cajero(s_Cola);
        		tmp.start();
        	}
        }catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(s_serv != null) {
				s_serv.close();
			}
		}
        
    }
}
