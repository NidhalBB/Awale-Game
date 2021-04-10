package Game;

import java.awt.EventQueue;
import java.io.IOException;

import GameInterface.GameMainFrame;

public class Awalé {

	
	public static void main(String[] args) {
		EventQueue.invokeLater(()-> {
			try {
				new GameMainFrame();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}

}
