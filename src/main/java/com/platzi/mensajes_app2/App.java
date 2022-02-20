package com.platzi.mensajes_app2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
    	
    	int option = 0;
    	do {
    		System.out.println("--------------------");
    		System.out.println("Aplicacion de mensajes");
    		System.out.println("1. Crear mensaje");
    		System.out.println("2. Listar mensaje");
    		System.out.println("3. Eliminar mensaje");
    		System.out.println("4. Editar mensaje");
    		System.out.println("5. Salir");
    		// leemos la opcion del usuario 
    		option = sc.nextInt();
    		
    		switch(option) {
    			case 1:
    				MensajesService.crearMensaje();
    				break;
    			case 2:
    				MensajesService.listarMensaje();
    				break;
    			case 3:
    				MensajesService.borrarMensaje();
    				break;
    			case 4:
    				MensajesService.editarMensaje();
    				break;
    			case 5:
    				break;
    			default:
    				break;
    		}


    	}while(option!=5);
    	
    	
    }
}
