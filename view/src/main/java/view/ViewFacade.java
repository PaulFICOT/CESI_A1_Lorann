package view;

import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.SwingUtilities;

import controller.ControllerOrder;
import model.IElement;
import model.IMobile;
import model.IModel;



/**
 * <h1>The Class ViewFacade provides a facade of the View component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class ViewFacade implements IView, Runnable{

	private View view;
	
    public ViewFacade(final IModel model) {
        this.view = new View(model);
        SwingUtilities.invokeLater(this);
    }
    


	@Override
	public void run() {
		// TODO Auto-generated method stub
		this.view.setVisible(true);
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

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	protected static ControllerOrder keyCodeToControllerOrder(final int keyCode) { //KeyEvent which get back the enter
		
		switch (keyCode) {
		case KeyEvent.VK_NUMPAD6: //NUMPAD mean the number at the right of the keyboard
			return ControllerOrder.Right;
			
		case KeyEvent.VK_NUMPAD4:
			return ControllerOrder.Left;
			
		case KeyEvent.VK_NUMPAD8:
			return ControllerOrder.Up;
			
		case KeyEvent.VK_NUMPAD2:
			return ControllerOrder.Down;
			
		case KeyEvent.VK_NUMPAD9:
			return ControllerOrder.UpperRight;
			
		case KeyEvent.VK_NUMPAD7:
			return ControllerOrder.UpperLeft;
			
		case KeyEvent.VK_NUMPAD3:
			return ControllerOrder.LowerRight;
			
		case KeyEvent.VK_NUMPAD1:
			return ControllerOrder.LowerLeft;
		
		case KeyEvent.VK_SPACE:
			return ControllerOrder.Spell;
		}
		return null;
}
    /*
     * (non-Javadoc)
     * @see view.IView#displayMessage(java.lang.String)
     */
}
