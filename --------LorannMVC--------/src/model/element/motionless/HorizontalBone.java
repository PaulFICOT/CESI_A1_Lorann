package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class HorizontalBone extends MotionlessElement {
	   /** The Constant SPRITE. */
 private static final Sprite SPRITE = new Sprite('*', "horizontal_bone.png");

	 /**
	  * Instantiates a new horizontal bone.
	  */
	 HorizontalBone() {
	     super(SPRITE, Permeability.BLOCKING);
	 }
}
