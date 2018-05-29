package model;

import java.awt.Graphics;
import java.awt.Image;

public interface IModel extends Game{
	
	IMap getMap();
	
	IElement getElement(int x, int y);
	
	void addObserver(Observer observer);
	
	void changed();
	
	StateGame getState();
	
	void setState(StateGame state);
	
	void getGameOver(Graphics graphics);
	
	void getMenu(Graphics graphics);
	
	void addParticule(int life, StateHero state, IEntitie hero);
	
	return setLevel(int level);
	
	int getLevel();
	
	ArrayList<IMap> getMaps();
	
	int getCoordinateXBackground();
	
	int getCoordinateYBackground();
	
	void setCoordinateXBackground(int x);
	
	void setCoordinateYBackground(int y);
	
	void setDirectionBackground(int direction);
	
	int getDirectionBackground();
	
	void loapMap(int id);
	
	void playMusic(String name, boolean loop);
	
	void playEffect(String name);
	
	
}