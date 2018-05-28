package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import controller.IController;
import model.IModel;

public class View extends JFrame implements KeyListener {

	private String Title;
	
	public View(IModel model, String Title) {
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void setTitle(String Title) {
		this.Title = Title;
	}
	
	public String getTitle() {
		return Title;
	}
	
	public IModel getModel() {
		return null; //Retourner le modèle quand celui ci sera implémenté
	}
	
	public IController getController() {
		return null;
	}
	
	
}
