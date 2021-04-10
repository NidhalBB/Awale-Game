package AwaléMultiJoueur;
import java.net.*;
import java.io.*;
public class Server {

	public Server() {
		
	try
	{
		ServerSocket ss = new ServerSocket(1234);
		System.out.println("J'attend Un Joueur");
		Socket s = ss.accept();
		InputStream is = s.getInputStream();
		OutputStream os = s.getOutputStream();
		s.close();
	}catch(IOException e) {
		e.printStackTrace();
	}
}
}
