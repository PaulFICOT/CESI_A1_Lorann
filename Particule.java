package model; 

public class Particule extends Map {
	
	private int life;
	
	private int direction;
	
	private Image[] image;
	
	private int x;
	
	private int y;
	
	private int index;
	
	public void Particule(int life, int direction, Image image, int x, int y) {
		this.life = life;
		this.direction = direction;
		this.image = image;
		this.x = x;
		this.y = y;
		this.index = index;
	}
	
	public void move() {
		
	}
	
	public void draw(Graphics graphics) {
		
	}
	
	public void setPosition(int x, int y) {
		
	}
}