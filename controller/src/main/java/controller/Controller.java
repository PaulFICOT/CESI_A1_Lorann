package controller;

import java.awt.event.KeyEvent;

import model.IModel;
import view.IView;

public class Controller	{

	Thread thread = new Thread();
	
	public void Controller(IView view, IModel model) {
		
	}
	
	public void initPathFinder() {
		
	}
	
	public void startTick() {
		
	}
	
	public void update() {
		
	}
	
	public void setView(IView view) {
		
	}
	
	public void setModel(IModel model) {
		
	}
	
	public IView getView() {
		return null;
	}
	
	public IModel getModel() {
		return null;
	}
	
	/*public IElement getElement(int x, int y) {
		
	}*/
	public boolean isBlocked(int x, int y) {
		return false;	
	}
	
	public void keyEvent(KeyEvent event) {
		
	}
	public void move(int action, IEntitie entitie) {
		
	}
}
