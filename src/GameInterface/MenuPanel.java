package GameInterface;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import GameConstants.Constants;
import GameImage.Image;
import GameImage.ImageFactory;

public class MenuPanel extends JPanel{

	/**
	 * 
	 */
	private ImageIcon Background_Image;
	private static final long serialVersionUID = 1L;

	public MenuPanel() {
		init();
		initVariable();
	}

	private void initVariable() {
		this.Background_Image = ImageFactory.createImage(Image.BACKGROUND_Main);
		
	}

	private void init() {
		setPreferredSize(new Dimension(Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(Background_Image.getImage(), 0, 0,null);
		//doDrawing(g);
	}
	
}
