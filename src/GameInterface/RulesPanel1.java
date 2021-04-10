 package GameInterface;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import GameConstants.Constants;
import GameImage.Image;
import GameImage.ImageFactory;

public class RulesPanel1 extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private ImageIcon Background_R1;

	public RulesPanel1() {
		init();
		initVariable();
	}

	private void initVariable() {
		this.Background_R1 = ImageFactory.createImage(Image.BACKGROUND_Rules1);
		
	}

	private void init() {
		setPreferredSize(new Dimension(Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT));
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawImage(Background_R1.getImage(), 0, 0,null);
		
	}
	
}
