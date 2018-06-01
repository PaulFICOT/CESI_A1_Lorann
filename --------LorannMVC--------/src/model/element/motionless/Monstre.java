package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Monstre extends MotionlessElement {
	   /** The Constant SPRITE. */
 private static final Sprite SPRITE = new Sprite('M', "monster_1.png");

	 /**
	  * Instantiates a new bone.
	  */
	 Monstre() {
	     super(SPRITE, Permeability.MONSTER);
	 }
}