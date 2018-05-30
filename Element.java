package model;
 
public class Element extends Door, Map {

	private Image image;
	
	private int x;
	
	private int y;
	
	private false permeability;
	
	public void Element(Element element) {
		
		
	}
	
	public void Element(Image image, int x, int y) {
		
		this.image = image;
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public void setImage(Image image) {
		
	}
	
	public Image getImage() {
		
	}
	
	public boolean getPermeability() {
		return this.permeability;
	}
	
	public TypeElement getTypeElement() {
		return this.typeelement;
	}
	
	public void setTypeElement(TypeElement typeElement) {
		
	}
	
	public void draw(Graphics graphics) {
		
	}
	
	public void setPosition(int x, int y) {
		
	}
	
}
