package view;

import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.SwingUtilities;

import controller.ControllerOrder;
import controller.IController;
import model.IElement;
import model.IMobile;
import model.IModel;

public class ViewFacade implements IView, Runnable {

	private final View view;
	
	public ViewFacade(IModel model) {
		this.view = new View(model);
		SwingUtilities.invokeLater(this);
	}

	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) { //KeyEvent which get back the enter
			
		switch (keyCode) {
		case KeyEvent.VK_RIGHT: //NUMPAD mean the number at the right of the keyboard
			return ControllerOrder.Right;
			
		case KeyEvent.VK_LEFT:
			return ControllerOrder.Left;
			
		case KeyEvent.VK_UP:
			return ControllerOrder.Up;
			
		case KeyEvent.VK_DOWN:
			return ControllerOrder.Down;
			/*
			 * 
			 * Problem duplicate case without any logic
			 * 
		case KeyEvent.VK_RIGHT + KeyEvent.VK_UP:
			return ControllerOrder.UpperRight;
			
		case KeyEvent.VK_LEFT + KeyEvent.VK_UP:
			return ControllerOrder.UpperLeft;
			
		case KeyEvent.VK_RIGHT + KeyEvent.VK_DOWN:
			return ControllerOrder.LowerRight;
			
		case KeyEvent.VK_LEFT + KeyEvent.VK_DOWN:
			return ControllerOrder.LowerLeft;
			*/
		case KeyEvent.VK_SPACE:
			return ControllerOrder.Spell;
		}
		return null;
	}


	public void printMessage(final String message) {
		this.view.printMessage(message);
	}

	public void run() {
		this.view.setVisible(true);
	}


	public void setController(final IController controller) {
		this.view.setController(controller);
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	public List<IMobile> getArmobile() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<IElement> getArimages() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addArmobile(IMobile mobile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<IMobile> getMobile() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<IElement> getImages() {
		// TODO Auto-generated method stub
		return null;
	}

}
