package view;

import java.awt.Graphics;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class Panel extends JPanel implements Observer {
	
	public Panel(IView View) {
		
	}
	
	@Override
	public void update(Observable observable, Object object) {
		// TODO Auto-generated method stub
		
	}
	
	public void paintComponant(Graphics graphics) {
		
	}
	
	public void clearComponant(Graphics graphics) {
		
	}
}
