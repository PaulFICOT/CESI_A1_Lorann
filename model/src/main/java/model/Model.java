package model;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Observable;

import javax.swing.JOptionPane;

public class Model extends Observable implements IModel, IMobile, IElement {

	int x;
	int y;
	int delay = 0;
	int period = 0;
	int lvl;
	private Permeability permBump = Permeability.BLOCKING;
	private String message;
	
	List<IElement> Arimages;
	List<IMobile> Armobile;
	
	public int LevelSelection() { //The home frame, where we ask the user at which level he want to start
		int level = 6;
		String[] TabLvl = { "1", "2", "3", "4", "5" };
		JOptionPane jop = new JOptionPane();
		while (level == 6) {

			level = JOptionPane.showOptionDialog(null, "Welcome! Which level do you want? ", "Level selection",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, TabLvl, TabLvl[0]);
		}
		this.lvl = level;
		return level;

	}
	
	

	public List<IMobile> getArmobile() {
		return this.Armobile;
	}

	/**
	 * Instantiates a new model.
	 */
	public Model() {
		this.message = "Initialisation du jeu.";
	}

	public void getMessage() {

	}

	/**
	 * Sets the message.
	 *
	 * @param message
	 *            the new message
	 */
	private void setMessage(final String message) {
		this.message = message;
		this.setChanged();
		this.notifyObservers();
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getMessage(java.lang.String)
	 */

	/*
	 * (non-Javadoc)
	 *
	 * @see contract.IModel#getObservable()
	 */
	public Observable getObservable() {
		return this;
	}

	public void moveL() {
		// TODO Auto-generated method stub

	}

	public void moveU() {
		// TODO Auto-generated method stub

	}

	public void moveD() {
		// TODO Auto-generated method stub

	}

	public void moveR() {
		// TODO Auto-generated method stub

	}

	public void launchSpell(char c) {
		// TODO Auto-generated method stub

	}

	public void move(char c) {
		// TODO Auto-generated method stub

	}

	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setX(int x) {
		// TODO Auto-generated method stub

	}

	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setY(int y) {
		// TODO Auto-generated method stub

	}

	public Permeability getPerm() {
		// TODO Auto-generated method stub
		return null;
	}

	public BufferedImage Image() throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getLvl() {
		return this.lvl;
	}

	public void move() {
		// TODO Auto-generated method stub

	}

	public void refresh() {
		// TODO Auto-generated method stub

	}

	public void launchSpell() {
		// TODO Auto-generated method stub

	}

	public int LevelChoice(String message) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Permeability checkPermBump() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addArmobile(IMobile mobile) {
		this.Armobile.add(mobile);
	}

	public void delArmobile(IMobile mobile) {
		this.Armobile.remove(mobile);
	}



	@Override
	public void createMap(int lvl) throws SQLException {
		// TODO Auto-generated method stub
		
	}



	@Override
	public List<IElement> getArimages() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Permeability checkBump(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

}
