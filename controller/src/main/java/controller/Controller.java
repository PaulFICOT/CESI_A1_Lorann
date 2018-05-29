package controller;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.SQLException;

import model.IEntitie;
import model.IModel;
import view.IView;

public class Controller	implements IController{

	Thread thread = new Thread();
	private char c;
	
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
	public void orderPerform(final ControllerOrder controllerOrder) throws IOException, SQLException { //Get back the enter from the View before send the char to the Model
		switch (controllerOrder) {
		
		case Right:
			this.c = 'R';
			this.model.getArmobile().get(0).move(c);
			break;
			
		case Left:
			this.c = 'L';
			this.model.getArmobile().get(0).move(c);
			break;
			
		case Up:
			this.c = 'U';
			this.model.getArmobile().get(0).move(c);
			break;
			
		case Down:
			this.c = 'D';
			this.model.getArmobile().get(0).move(c);
			break;
			
		case UpperRight:
			this.c = '9';
			this.model.getArmobile().get(0).move(c);
			break;
			
		case UpperLeft:
			this.c = '7';
			this.model.getArmobile().get(0).move(c);
			break;
			
		case LowerRight:
			this.c = '3';
			this.model.getArmobile().get(0).move(c);
			break;
			
		case LowerLeft:
			this.c = '1';
			this.model.getArmobile().get(0).move(c);
			break;
			
		case Spell:
			this.model.getArmobile().get(0).launchSpell(c);
			break;

		default:
			break;
		}
}
}
