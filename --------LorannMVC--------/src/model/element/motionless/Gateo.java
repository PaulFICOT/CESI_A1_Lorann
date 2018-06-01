package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

public class Gateo extends MotionlessElement {
	   /** The Constant SPRITE. */
 public static Sprite SPRITE = new Sprite('C', "gate_open.png");

 /**
  * Instantiates a new crystal.
  */
  public Gateo() {
     super(SPRITE, Permeability.GATEO);
 }
}