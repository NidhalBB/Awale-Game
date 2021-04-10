package GameInterface;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import GameConstants.Constants;
import GameImage.Image;
import GameImage.ImageFactory;
import GameObject.Ball;

public class GamePanel extends JPanel{

	private static final long serialVersionUID = 1L;
	private ImageIcon Background;
	private List<Ball>  cellule ;
	private List<List<Ball>>  Balls ;
	public GamePanel() {
		initializeLayout();
		initializeVariables();
		initializeGame();
		
		this.addMouseListener((MouseListener) new MouseAdapter() {
    	    @Override 
    	    public void mousePressed(MouseEvent e) {
  
    	    	if((e.getX() >= 66 && e.getX() <= 124 ) && (e.getY() >= 294 && e.getY() <= 347)) {
    	    		for(int i =1 ; i <= Balls.get(0).size() ; i++) {
    	    			
    	    			Balls.get(i).add(new Ball(85+i*120,290));	
    	    			
    	    	 }
    	    		Balls.get(0).clear();
    	    		System.out.println(Balls.get(1).size());	
    	    		repaint();

        	    	try{
                        Thread.sleep(2000);
                        for(int i =1 ; i <= Balls.get(7).size() ; i++) {
        	    			
        	    			if(i==1) {
        	    				Balls.get(8).add(new Ball(85+8*45,25+8*20));
        	    			}
        	    			if(i==2) {
        	    				Balls.get(9).add(new Ball(40+9*30,25+9*15));
        	    			}
        	    			if(i==3) {
        	    				Balls.get(10).add(new Ball(40+10*15,25+9*15));	
        	    			}
        	    			if(i==4) {
        	    				Balls.get(11).add(new Ball(5+10*10,25+9*15));	
        	    			}
        	    			//Balls.get(i).add(new Ball(85+i*120,280));	
        	    			if(i==5) {
        	    				Balls.get(0).add(new Ball(85,290));	
        	    			}
        	    			if(i==6) {
        	    				Balls.get(1).add(new Ball(205,280));		
        	    			}
        	    	 }
        	    		Balls.get(7).clear();
        	    		repaint();
        	    		System.out.println(Balls.get(2).size());
                }
                catch(InterruptedException e1){
                    System.out.println("thread 2 interrupted");
                }
    	    	}
    	    	
    	    	else if((e.getX() >= 184 && e.getX() <= 255 ) && (e.getY() >= 290 && e.getY() <= 347)) {
    	    		for(int i =1 ; i <= Balls.get(1).size() ; i++) {
    	    			
    	    			if(i==1) {
    	    				Balls.get(i).add(new Ball(85+i*120,280));	
    	    			}
    	    			if(i==2) {
    	    				Balls.get(i).add(new Ball(85+i*120,280));	
    	    			}
    	    			if(i==3) {
    	    				Balls.get(i).add(new Ball(85+i*120,280));	
    	    			}
    	    			if(i==4) {
    	    				Balls.get(i).add(new Ball(65+i*120,240+i*20));	
    	    			}
    	    			//Balls.get(i).add(new Ball(85+i*120,280));	
    	    			if(i==5) {
    	    				Balls.get(i).add(new Ball(85+i*120,280));	
    	    			}
    	    			if(i==6) {
    	    				Balls.get(i).add(new Ball(85+i*100,65+i*20));	
    	    			}
    	    	 }
    	    		Balls.get(1).clear();
    	    		repaint();
    	    		System.out.println(Balls.get(2).size());	
    	    	
    	    		try{
                        Thread.sleep(2000);
                        for(int i =1 ; i <= Balls.get(6).size() ; i++) {
                        	if(i==1) {
        	    				Balls.get(7).add(new Ball(85+7*70,35+7*20));	
        	    			}
        	    			if(i==2) {
        	    				Balls.get(8).add(new Ball(85+8*45,25+8*20));
        	    			}
        	    			if(i==3) {
        	    				Balls.get(9).add(new Ball(40+9*30,25+9*15));
        	    			}
        	    			if(i==4) {
        	    				Balls.get(10).add(new Ball(40+10*15,25+9*15));	
        	    			}
        	    			if(i==5) {
        	    				Balls.get(11).add(new Ball(5+10*10,25+9*15));	
        	    			}
        	    			
        	    	 }
        	    		Balls.get(6).clear();
        	    		repaint();
        	    		System.out.println(Balls.get(2).size());
                }
                catch(InterruptedException e1){
                    System.out.println("thread 2 interrupted");
                }
    	    	 }
    	    	else if((e.getX() >= 315 && e.getX() <= 374 ) && (e.getY() >= 289 && e.getY() <= 343)) {
    	    		
    	    			for(int i =2 ; i <= Balls.get(2).size()+1 ; i++) {
    	    				if(i==2) {
        	    				Balls.get(i).add(new Ball(85+i*120,280));	
        	    			}
    	    			if(i==3) {
    	    				Balls.get(i).add(new Ball(85+i*120,280));	
    	    			}
    	    			if(i==4) {
    	    				Balls.get(i).add(new Ball(85+i*120,280));	
    	    			}
    	    			if(i==5) {
    	    				Balls.get(i).add(new Ball(85+i*120,220+i*20));	
    	    			}
    	    			//Balls.get(i).add(new Ball(85+i*120,280));	
    	    			if(i==6) {
    	    				Balls.get(i).add(new Ball(85+i*100,45+i*20));	
    	    			}
    	    			if(i==7) {
    	    				Balls.get(i).add(new Ball(85+i*70,65+i*20));	
    	    			}
    	    	 }
    	    		Balls.get(2).clear();
    	    		repaint();
    	    		System.out.println(Balls.get(6).size());	
    	    		try{
                        Thread.sleep(2000);
                        for(int i =1 ; i <= Balls.get(10).size() ; i++) {
                        	if(i==1) {
                        		Balls.get(11).add(new Ball(5+10*10,25+9*15));	
        	    			}
        	    			if(i==2) {
        	    				Balls.get(0).add(new Ball(85,290));	
        	    			}
        	    			if(i==3) {
        	    				Balls.get(1).add(new Ball(205,280));
        	    			}
        	    			if(i==4) {
        	    				Balls.get(2).add(new Ball(85+2*120,280));
        	    			}
        	    			if(i==5) {
        	    				Balls.get(3).add(new Ball(85+3*120,280));
        	    			}
        	    			
        	    	 }
        	    		Balls.get(10).clear();
        	    		repaint();
        	    		System.out.println(Balls.get(2).size());
                }
                catch(InterruptedException e1){
                    System.out.println("thread 2 interrupted");
                }
    	    		
    	    	}
    	    	
    	    	else if((e.getX() >= 431 && e.getX() <= 488 ) && (e.getY() >= 288 && e.getY() <= 339)) {
    	    		for(int i =2 ; i <= Balls.get(3).size()+2 ; i++) {
    	    			
    	    			
    	    			if(i==3) {
    	    				Balls.get(i).add(new Ball(85+i*120,280));	
    	    			}
    	    			if(i==4) {
    	    				Balls.get(i).add(new Ball(85+i*120,280));	
    	    			}
    	    			if(i==5) {
    	    				Balls.get(i).add(new Ball(85+i*120,220+i*20));	
    	    			}
    	    			if(i==6) {
    	    				Balls.get(i).add(new Ball(85+i*100,45+i*20));	
    	    			}
    	    			//Balls.get(i).add(new Ball(85+i*120,280));	
    	    			if(i==7) {
    	    				Balls.get(i).add(new Ball(85+i*70,35+i*20));	
    	    			}
    	    			if(i==8) {
    	    				Balls.get(i).add(new Ball(85+i*45,25+i*20));	
    	    			}
    	    	 }
    	    		Balls.get(3).clear();
    	    		repaint();
    	    		System.out.println(Balls.get(6).size());	
    	    		
    	    		try{
                        Thread.sleep(2000);
                        for(int i =1 ; i <= Balls.get(11).size() ; i++) {
                        	if(i==1) {
                        		Balls.get(0).add(new Ball(85,290));	
        	    			}
        	    			if(i==2) {
        	    				Balls.get(1).add(new Ball(205,280));
        	    			}
        	    			if(i==3) {
        	    				Balls.get(2).add(new Ball(85+2*120,280));
        	    			}
        	    			if(i==4) {
        	    				Balls.get(3).add(new Ball(85+3*120,280));
        	    			}
        	    			if(i==5) {
        	    				Balls.get(4).add(new Ball(85+4*120,280));
        	    			}
        	    			
        	    	 }
        	    		Balls.get(11).clear();
        	    		repaint();
        	    		System.out.println(Balls.get(2).size());
                }
                catch(InterruptedException e1){
                    System.out.println("thread 2 interrupted");
                }
    	    	
    	    	 }
    	    	else if((e.getX() >= 547 && e.getX() <=606 ) && (e.getY() >= 287 && e.getY() <= 342)) {
    	    		for(int i =1 ; i <= Balls.get(4).size() ; i++) {
    	    			
    	    			if(i==1) {
    	    				Balls.get(5).add(new Ball(85+5*120,220+5*20));	
    	    			}
    	    			if(i==2) {
    	    				Balls.get(6).add(new Ball(85+6*100,45+6*20));	
    	    			}
    	    			//Balls.get(i).add(new Ball(85+i*120,280));	
    	    			if(i==2) {
    	    				Balls.get(7).add(new Ball(85+7*70,35+7*20));		
    	    			}
    	    			if(i==4) {
    	    				Balls.get(8).add(new Ball(85+8*45,25+8*20));
    	    			}
    	    			if(i==5) {
    	    				Balls.get(9).add(new Ball(40+9*30,25+9*15));	
    	    			}
    	    	 }
    	    		Balls.get(4).clear();
    	    		repaint();
    	    		System.out.println(Balls.get(6).size());	
    	    	
    	    		try{
                        Thread.sleep(2000);
                        for(int i =1 ; i <= Balls.get(8).size() ; i++) {
                        	if(i==1) {
                        		Balls.get(9).add(new Ball(40+9*30,25+9*15));
        	    			}
        	    			if(i==2) {
        	    				Balls.get(10).add(new Ball(40+10*15,25+9*15));
        	    			}
        	    			if(i==3) {
        	    				Balls.get(11).add(new Ball(5+10*10,25+9*15));
        	    			}
        	    			if(i==4) {
        	    				Balls.get(0).add(new Ball(85,290));	
        	    			}
        	    			if(i==5) {
        	    				Balls.get(1).add(new Ball(205,280));
        	    			}
        	    			
        	    	 }
        	    		Balls.get(8).clear();
        	    		repaint();
        	    		System.out.println(Balls.get(2).size());
                }
                catch(InterruptedException e1){
                    System.out.println("thread 2 interrupted");
                }
    	    	 }
    	    	else if((e.getX() >= 671 && e.getX() <=733 ) && (e.getY() >= 289 && e.getY() <= 350)) {
    	    		for(int i =1 ; i <= Balls.get(5).size() ; i++) {
    	    			
    	    			if(i==1) {
    	    				Balls.get(6).add(new Ball(85+6*100,45+6*20));	
    	    			}
    	    			if(i==2) {
    	    				Balls.get(7).add(new Ball(85+7*70,35+7*20));	
    	    			}
    	    			//Balls.get(i).add(new Ball(85+i*120,280));	
    	    			if(i==2) {
    	    				Balls.get(8).add(new Ball(85+8*45,25+8*20));		
    	    			}
    	    			if(i==4) {
    	    				Balls.get(9).add(new Ball(40+9*30,25+9*15));
    	    			}
    	    			if(i==5) {
    	    				Balls.get(10).add(new Ball(40+10*15,25+9*15));	
    	    			}
    	    	 }
    	    		Balls.get(5).clear();
    	    		repaint();
    	    		System.out.println(Balls.get(6).size());	
    	    	
    	    		try{
                        Thread.sleep(2000);
                        for(int i =1 ; i <= Balls.get(9).size() ; i++) {
                        	if(i==1) {
                        		Balls.get(10).add(new Ball(40+10*15,25+9*15));
        	    			}
        	    			if(i==2) {
        	    				Balls.get(11).add(new Ball(5+10*10,25+9*15));
        	    			}
        	    			if(i==3) {
        	    				Balls.get(0).add(new Ball(85,290));	
        	    			}
        	    			if(i==4) {
        	    				Balls.get(1).add(new Ball(205,280));
        	    			}
        	    			if(i==5) {
        	    				Balls.get(2).add(new Ball(85+2*120,280));
        	    			}
        	    			
        	    	 }
        	    		Balls.get(9).clear();
        	    		repaint();
        	    		System.out.println(Balls.get(2).size());
                }
                catch(InterruptedException e1){
                    System.out.println("thread 2 interrupted");
                }
    	    	 }
    	    }});
	}
	
	private void initializeVariables() {
		this.Balls = new ArrayList<>();
		this.Background = ImageFactory.createImage(Image.BACKGROUND_Game);
		
	}

	public void initializeLayout() {
		setFocusable(true);
		setPreferredSize(new Dimension(Constants.BOARD_WIDTH, Constants.BOARD_HEIGHT));
	}
	
	public void initializeGame() {
		
		for(int i =0 ;i<6;i++) {
			cellule = new ArrayList<>();
			for(int j = 0 ; j<4;j++) {
				if(j==0) {
					Math.random();
			    	  Math.random();
					cellule.add(new Ball(85+i*120,270+j*20));
				}else if(j==1) {
					cellule.add(new Ball(120+i*120,270+j*20));
				}
				else if(j==2) {
					cellule.add(new Ball(105+i*120,280+j*20));
				}
				else if(j==3) {
					cellule.add(new Ball(65+i*120,250+j*20));
				}	
			}
			Balls.add(cellule);
		}
		for(int i =5 ;i>=0;i--) {
			cellule = new ArrayList<>();
			for(int j = 0 ; j<4;j++) {
				if(j==0) {
					cellule.add(new Ball(85+(i)*120,145+j*20));
				}else if(j==1) {
					cellule.add(new Ball(120+(i)*120,145+j*20));
				}
				else if(j==2) {
					cellule.add(new Ball(105+(i)*120,155+j*20));
				}
				else if(j==3) {
					cellule.add(new Ball(65+(i)*120,125+j*20));
				}	
			}
			Balls.add(cellule);
		}
		
	}
	
	private void drawcellule(Graphics g) {
		for(List<Ball> cellule : this.Balls ) {
			for(Ball ball : cellule) {
				g.drawImage(ball.getImage(), ball.getX(), ball.getY(),this);
			}
		}
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(Background.getImage(), 0, 0,null);
		doDrawing(g);
	}

	private void doDrawing(Graphics g) {
			drawcellule(g);
			}

}