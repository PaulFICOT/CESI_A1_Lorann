package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

public class Purse extends Items {

	private int x;
	private int y;
	Permeability perm = Permeability.COLLECTABLE;
	
	public Purse(int x, int y){
		
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
		BufferedImage purse = ImageIO.read(new File("C:\\Users\\vince\\git\\Loran\\purse.png"));
		return purse;
	}

	public Permeability getPerm() {
		// TODO Auto-generated method stub
		return this.perm;
	}

	public void move(char c) throws IOException {
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
