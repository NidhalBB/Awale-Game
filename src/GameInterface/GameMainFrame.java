package GameInterface;

import java.awt.CardLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import GameConstants.Constants;
import GameImage.Image;
import GameImage.ImageFactory;

public class GameMainFrame extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	CardLayout cardLayout;
	public GameMainFrame() throws IOException {
		
			init();
		
	}
		
	
	public void init() throws IOException {
		
		 cardLayout = new CardLayout();
		 JPanel mainPanel = new JPanel(cardLayout);
		MenuPanel Panel1 = new MenuPanel();
		GamePanel Panel2 = new GamePanel();
		RulesPanel1 Panel3 = new RulesPanel1();
		RulesPanel2 Panel4 = new RulesPanel2();
		mainPanel.add(Panel1, "menu");
        mainPanel.add(Panel2, "game");
        mainPanel.add(Panel3, "rules1");
        mainPanel.add(Panel4, "rules2");
        this.add(mainPanel);
		setIconImage(ImageFactory.createImage(Image.Icon).getImage());
		
		setTitle(Constants.TITLE);
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		 cardLayout.show(mainPanel, "menu");
		
		 Panel1.addMouseListener((MouseListener) new MouseAdapter() {
    	    @Override 
    	    public void mousePressed(MouseEvent e) {
    	    	if((e.getX() >= 124 && e.getX() <= 236 ) && (e.getY() >= 185 && e.getY() <= 220 )) {
    	    		
    	    		
    	    		cardLayout.show(mainPanel, "game");

    	    	}
    	    	 if((e.getX() >= 676  && e.getX() <= 761  ) && (e.getY() >= 22  && e.getY() <= 58 )) {
    	    		
   	    		 cardLayout.show(mainPanel, "rules1");
   	    	}}
    	  });
		 Panel3.addMouseListener((MouseListener) new MouseAdapter() {
	    	    @Override 
	    	    public void mousePressed(MouseEvent e) {
	    	    	
	    	    	if((e.getX() >= 677   && e.getX() <= 757  ) && (e.getY() >= 27  && e.getY() <= 59  )) {
	     	    		
	       	    		 cardLayout.show(mainPanel, "rules2");
	       	    	}
	    	    	if((e.getX() >= 25 && e.getX() <= 102 ) && (e.getY() >= 25  && e.getY() <= 61  )) {
	     	    		
	       	    		 cardLayout.show(mainPanel, "menu");
	       	    	}
	    	    	 }
	    	  });
		 
		 Panel4.addMouseListener((MouseListener) new MouseAdapter() {
	    	    @Override 
	    	    public void mousePressed(MouseEvent e) {
	  
	    	    	if((e.getX() >= 25 && e.getX() <= 102 ) && (e.getY() >= 25  && e.getY() <= 61  )) {
	     	    		
	       	    		 cardLayout.show(mainPanel, "rules1");
	       	    	}
	    	    	 }
	    	  });
		 Panel2.addMouseListener((MouseListener) new MouseAdapter() {
	    	    @Override 
	    	    public void mousePressed(MouseEvent e) {
	  
	    	    	if((e.getX() >= 682 && e.getX() <= 751 ) && (e.getY() >= 437  && e.getY() <= 471  )) {
	     	    		
	    	    		dispose();     	    	}
	    	    	if((e.getX() >= 25 && e.getX() <= 102 ) && (e.getY() >= 25  && e.getY() <= 61  )) {
	     	    		
	       	    		 cardLayout.show(mainPanel, "menu");
	       	    	}
	    	    	//System.out.println(e.getX() + "," + e.getY());
	    	    	 }
	    	    
	    	  });
	}
}
