package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Gateo extends MotionlessElement {
	   /** The Constant SPRITE. */
 public static Sprite SPRITE = new Sprite('Z', "gate_open.png");
 
 public static Sprite SPRITEC = new Sprite('Z', "gate_closed.png");

 /**
  * Instantiates a new crystal.
  */
  public Gateo() {
     super(SPRITEC, Permeability.GATEC);

 }
  
  
	public  void Gateoo(){
		
		  this.setSprite(SPRITEC);
		  
	}
  
}