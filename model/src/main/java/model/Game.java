package model;
 
import java.awt.Graphics;
import java.awt.Image;

public class Game implements IModel, Observable{

	int idActual;
	
	public void Game() {
		
	}
	
	public void initMap() {
		
	}
	
	public void changed() {
		
	}
	
	public IMap getMap() {
		
	}
	
	public IElement getElement(int x, int y) {
		
	}
	
	public void getMenu(Graphics graphics) {
		
	}
	
	public void getGameOver(Graphics graphics) {
		
	}
	
	public StateGame getState() {
		
	}
	
	public void setState(StateGame state) {
		
	}
	
	ArrayList<IMap> getMaps(){
		
	}
	
	public int getLevel() {
		
	}
	
	public void setLevel(int level) {
		
	}
	
	public void loadMap(int id) {
		
	}
	
	@Override
	public void getPermeability() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics graphics) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setImage(Image image) {
		// TODO Auto-generated method stub	
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}
}
