package model;

import java.awt.Graphics;
import java.awt.Image;

public interface IParticule{
	
	void graphics(Graphics graphics);
	
	int getX();
	
	int getY();
	
	void move();
	
	boolean isLife();
	
	void setDirection(int direction);
}