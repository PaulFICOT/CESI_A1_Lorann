package model;

import java.awt.Graphics;
import java.awt.Image;

public interface IElement extends Map {
	
	void getPermeability();
	
	void draw(Graphics graphics);
	
	void setImage(Image image);
	
	int getX();
	
	int getY();
}
