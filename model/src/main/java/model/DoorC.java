package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

public class DoorC {

	private int x;
	private int y;
	private String name = "doorC";
	Permeability perm = Permeability.BLOCKING;

	

	public DoorC(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
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
		BufferedImage doorC = ImageIO.read(new File("src/main/resources/sprite/gate_closed.png"));
		return doorC;
	}

	public Permeability getPerm() {
		// TODO Auto-generated method stub
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
		return name;
}
}
