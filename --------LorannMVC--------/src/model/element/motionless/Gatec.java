package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Gatec extends MotionlessElement {
	   /** The Constant SPRITE. */
 public static Sprite SPRITE = new Sprite('H', "gate_closed.png");

 /**
  * Instantiates a new crystal.
  */
 public Gatec() {
     super(SPRITE, Permeability.GATEC);
 }

}

