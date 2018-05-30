package controller;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import model.IElement;
import model.IEntitie;
import model.IMobile;
import model.IModel;
import view.IView;

public class Controller	implements IController{

	private IView view;
	private IModel model;
	private char c;

	public Controller(final IView view, final IModel model) { // Controller
																// constructor
		this.setView(view);
		this.setModel(model);
	}

	private void setView(final IView view) {
		this.view = view;
	}

	private void setModel(final IModel model) {
		this.model = model;
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

	public void getMap1() throws SQLException {
	}

	public List<IMobile> getArmobile(){
		
		return null;
	}
	public void printMessage(String message) {
		// TODO Auto-generated method stub
		
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public List<IElement> getArimages(){
		// TODO Auto-generated method stub
		return null;
}

	@Override
	public void getMap() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IElement> getImages() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<IMobile> getMobile() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
	
}
