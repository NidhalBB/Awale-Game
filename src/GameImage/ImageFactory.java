package GameImage;

import javax.swing.ImageIcon;

import GameConstants.Constants;

public class ImageFactory {

	
	public static ImageIcon createImage(Image image) {
		ImageIcon imageIcon = null ;
		
		switch (image) {
		case BACKGROUND_Main:
			imageIcon = new ImageIcon(Constants.BACKGROUND_Menu_URL);
			break;
		case BACKGROUND_Game:
			imageIcon = new ImageIcon(Constants.BACKGROUND_Game_URL);
			break;
		case Icon:
			imageIcon = new ImageIcon(Constants.Icon_Game_URL);
			break;
		case BACKGROUND_Rules1:
			imageIcon = new ImageIcon(Constants.BACKGROUND_Rules1);
			break;
		case BACKGROUND_Rules2:
			imageIcon = new ImageIcon(Constants.BACKGROUND_Rules2);
			break;
		case Ball:
			imageIcon = new ImageIcon(Constants.Ball);
			break;

		default:
			return null ;
		}
		
		return imageIcon;
	}
}
