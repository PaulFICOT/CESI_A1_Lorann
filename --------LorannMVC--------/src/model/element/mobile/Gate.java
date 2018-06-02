package model.element.mobile;

import java.io.IOException;

import contract.model.IElement;
import contract.model.ILevel;
import model.element.Permeability;
import model.element.Sprite;


public class Gate extends Mobile implements IElement {
	   /** The Constant SPRITE. */
	




  private static final Sprite spritec = new Sprite('C', "gate_closed.png");
  private static final Sprite spriteo = new Sprite('C', "gate_open.png");

  private static final Sprite black = new Sprite('C', "black.png");



/**
  * Instantiates a new crystal. 
 * @throws IOException 
  */
	public Gate(final int x, final int y, final ILevel level) throws IOException {
        super(x, y, spritec, level, Permeability.GATEC);
    spriteo.loadImage();
     spritec.loadImage();
 }

	@Override
	public  void Gateo(){
		super.doNothing();
		  this.setSprite(spriteo);
		  
	}
	
	@Override
	public  void Gatec(){
		super.doNothing();
		  this.setSprite(spritec);
		  
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
  
	
	
	
}

