package AwaléMultiJoueur;

import java.net.*;
import java.io.*;
public class Client {
	
	public Client () {
		
		try
		{
			Socket s = new Socket("LocalHost" ,1234);
			System.out.println("J'attend Un Joueur");
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();
		}catch(IOException e) {
			e.printStackTrace();
		}
}
}
