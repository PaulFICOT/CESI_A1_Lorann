package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class VerticalBone extends MotionlessElement {
	   /** The Constant SPRITE. */
 private static final Sprite SPRITE = new Sprite('|', "vertical_bone.png");

	 /**
	  * Instantiates a new crystal.
	  */
	 VerticalBone() {
	     super(SPRITE, Permeability.BLOCKING);
	 }
}
