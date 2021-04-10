package GameObject;

import javax.swing.ImageIcon;
import GameImage.Image;
import GameImage.ImageFactory;

public class Ball extends Sprite {
	protected int x;
	protected int y ;
	public Ball() {
	}
	
	public Ball(int x_Start, int y_Start) {
		initialize(x_Start, y_Start);
	}

	private void initialize(int x_Start, int y_Start) {
		ImageIcon imageIcon = ImageFactory.createImage(Image.Ball);
		setImage(imageIcon.getImage());
		setX(x_Start);
		setY(y_Start);
	}

}


