package model.element.motionless;

import java.awt.Point;
import java.io.IOException;

import contract.model.IMobile;
import model.element.Permeability;
import model.element.Sprite;

public class Gate extends MotionlessElement implements IMobile{
	   /** The Constant SPRITE. */
 private static final Sprite SPRITEC = new Sprite('H', "gate_closed.png");
 private static final Sprite SPRITEO = new Sprite('H', "gate_open.png");
 String state = "CLOSED";
	 /**
	  * Instantiates a new gate.
	  */
	 Gate() {
	     super(SPRITEC, Permeability.GATE);
	     
	        try {
				SPRITEC.loadImage();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        try {
				SPRITEO.loadImage();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
	 }
	 

	 
	 public void setEtat(String newstate){
		 this.state = newstate;
		 if(state=="CLOSED"){
			 setSprite(SPRITEC);
		 }
		 else if (state=="CLOSED"){
			 setSprite(SPRITEO);
		 }
	 }
		 
		 public String getEtat(){
			 
			 return state;
		 }
	 

	 

	 
	 
	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doNothingDown() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doNothingRight() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doNothingLeft() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doNothingUp() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doNothingUR() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doNothingUL() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doNothingDR() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doNothingDL() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doNothing() {
		
		
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
	@Override
	public Boolean isAlive() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean isCrashed() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void moveUpLeft() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void moveDownLeft() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void moveUpRight() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void moveDownRight() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void alive() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Boolean isMonstre() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean isPurse() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void ressucite() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Boolean isCrystal() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean checkWin() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Boolean isWin() {
		// TODO Auto-generated method stub
		return null;
	}
	 
	 
	 
}