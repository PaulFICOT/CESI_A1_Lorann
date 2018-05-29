package model;

import java.awt.Graphics;
import java.awt.Image;

import javax.lang.model.element.TypeElement;

public interface IElement {
	
	void getPermeability();
	void draw(Graphics graphics);
	TypeElement getTypeElement();
	void setImage(Image image);
	int getX();
	int getY();
}
