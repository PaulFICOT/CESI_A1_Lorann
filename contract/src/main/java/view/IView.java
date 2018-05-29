package view;

import java.awt.event.KeyEvent;
import java.util.List;

import controller.IController;
import model.IElement;
import model.IMobile;

/**
 * <h1>The Interface IView.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IView {

	List<IMobile> getMobile();
	List<IElement> getImages();
	
	void keyPressed(final KeyEvent e);
	
	
    /**
     * Display message.
     *
     * @param message
     *            the message
     */
    //void displayMessage(String message);
}
