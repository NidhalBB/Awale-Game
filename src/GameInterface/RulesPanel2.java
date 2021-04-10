 package GameInterface;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import GameConstants.Constants;
import GameImage.Image;
import GameImage.ImageFactory;

public class RulesPanel2 extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private ImageIcon Background_R2;

	public RulesPanel2() {
		init();
		initVariable();
	}

	private void initVariable() {
		this.Background_R2 = ImageFactory.createImage(Image.BACKGROUND_Rules2);
		
	}

	private void init() {
		setPreferredSize(new Dimension(Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(Background_R2.getImage(), 0, 0,null);
		
	}
	
}