package model;

import java.awt.Graphics;
import java.awt.Image;

public interface IElement{
	
	void getPermeability();
	
	void draw(Graphics graphics);
	
	void setImage(Image image);
	
	int getX();
	
	int getY();
}
