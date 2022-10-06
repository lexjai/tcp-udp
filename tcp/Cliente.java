package connect;
 
import java.io.*;
import java.net.*;
import java.net.*;
import java.util.*;
public class Cliente {
 
	 
	
    private static String HOST = "localhost";
    private static int PUERTO = 8050;
 
    public static void main(String args[]) {
        
    	InetAddress iaRemoteAddress = null;
        Socket socket;
        DataOutputStream mensaje;
         
        try {
            //Creamos nuestro socket
            socket = new Socket(HOST, PUERTO);
     
            mensaje = new DataOutputStream(socket.getOutputStream());
 
            //Enviamos un mensaje
         
            mensaje.writeUTF("Hola!!<EOF>");
 
            //Cerramos la conexión
           socket.close();
 
        } catch (UnknownHostException e) {
            System.out.println("El host no existe o no está activo.");
        } catch (IOException e) {
            System.out.println("Error de entrada/salida."+ e);
        }
         
    }
}