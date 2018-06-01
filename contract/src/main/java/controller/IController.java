package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import model.IElement;
import model.IMobile;

/**
 * <h1>The Interface IController.</h1>
 * 
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IController {
	
	void orderPerform(ControllerOrder controllerOrder) throws IOException, SQLException;
	void getMap() throws SQLException;
	
	public List<IElement> getArimages() throws SQLException;
	public List<IMobile> getArmobile() throws SQLException;
}
