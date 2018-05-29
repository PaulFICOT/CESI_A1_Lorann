package model;

import java.awt.Graphics;
import java.awt.Image;

public interface IEntitie{
	
	void draw(Graphics graphics);
	
	int getX();
	
	int getY();
	
	setPosition(int x, int y);
	
	boolean isMove(long tick);
	
}