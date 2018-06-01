package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

public class Black extends Background{

	private int x;
	private int y;
	Permeability perm = Permeability.PENETRABLE;

	public Black(int x, int y) {

		this.x = x;
		this.y = y;
		

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public BufferedImage Image() throws IOException {
		BufferedImage black = ImageIO.read(new File("C:\\\\Users\\\\vince\\\\git\\\\Loran\\\\black.png"));
		return black;

	}

	public Permeability getPerm() {
		
		return this.perm;
	}

	public void move(char c) {
		// TODO Auto-generated method stub
		
	}

	public List<IElement> getArimages() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
}
}
