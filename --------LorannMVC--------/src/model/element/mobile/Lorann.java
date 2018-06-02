package model.element.mobile;

import java.io.IOException;

import contract.model.ILevel;
import model.element.Permeability;
import model.element.Sprite;



public class Lorann extends Mobile{
	
	/** The Constant SPRITE. */
    private static final Sprite sprite          = new Sprite('@', "lorann_ul.png");

    /** The Constant spriteTurnLeft. */
    private static final Sprite spriteTurnLeft  = new Sprite('@', "lorann_l.png");

    /** The Constant spriteTurnRight. */
    private static final Sprite spriteTurnRight = new Sprite('@', "lorann_r.png");
    
    /** The Constant spriteMoveUp. */
    private static final Sprite spriteMoveUp  = new Sprite('@', "lorann_u.png");

    /** The Constant spriteMoveDown. */
    private static final Sprite spriteMoveDown = new Sprite('@', "lorann_b.png");
    
    /** The Constant spriteMoveDownRight. */
    private static final Sprite spriteMoveDownRight = new Sprite('@', "lorann_br.png");
    
    /** The Constant spriteMoveDownLeft. */
    private static final Sprite spriteMoveDownLeft = new Sprite('@', "lorann_bl.png");
    
    /** The Constant spriteMoveDownRight. */
    private static final Sprite spriteMoveUpRight = new Sprite('@', "lorann_ur.png");
    
    /** The Constant spriteMoveDownLeft. */
    private static final Sprite spriteMoveUpLeft = new Sprite('@', "lorann_ul.png");

    /** The Constant spriteDie. */
    private static final Sprite spriteDie  = new Sprite('@', "BlackTile.jpg");

    /**
     * Instantiates a new my vehicle.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @param road
     *            the road
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public Lorann(final int x, final int y, final ILevel level) throws IOException {
        super(x, y, sprite, level, Permeability.BLOCKING);
        sprite.loadImage();
        spriteTurnLeft.loadImage();
        spriteTurnRight.loadImage();
        spriteMoveUp.loadImage();
        spriteMoveDown.loadImage();
        spriteDie.loadImage();
        spriteMoveUpLeft.loadImage();
        spriteMoveUpRight.loadImage();
        spriteMoveDownLeft.loadImage();
        spriteMoveDownRight.loadImage();
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.Mobile#moveLeft()
     */
    @Override
    public final void moveLeft() {
        super.moveLeft();
        this.setSprite(spriteTurnLeft);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.Mobile#moveRight()
     */
    @Override
    public final void moveRight() {
        super.moveRight();
        this.setSprite(spriteTurnRight);
    }
    
    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.Mobile#moveLeft()
     */
    @Override
    public final void moveUp() {
        super.moveUp();
        this.setSprite(spriteMoveUp);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.Mobile#moveRight()
     */
    @Override
    public final void moveDown() {
        super.moveDown();
        this.setSprite(spriteMoveDown);
    }
    
    @Override
    public final void moveDownRight() {
        super.moveDownRight();
        this.setSprite(spriteMoveDownRight);
    }
    
    @Override
    public final void moveDownLeft() {
        super.moveDownLeft();
        this.setSprite(spriteMoveDownLeft);
    }
    
    @Override
    public final void moveUpRight() {
        super.moveUpRight();
        this.setSprite(spriteMoveUpRight);
    }
    
    @Override
    public final void moveUpLeft() {
        super.moveUpLeft();
        this.setSprite(spriteMoveUpLeft);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.Mobile#die()
     */
    @Override
    protected final void recul() {
        super.recul();
        this.setSprite(spriteDie);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.Mobile#doNothing()
     */
    @Override
    public final void doNothingRight() {
            	
        this.setSprite(spriteTurnRight);
        this.doNothing();
        
                }
    
    
    @Override
    public final void doNothingLeft() {
        
        this.setSprite(spriteTurnLeft);
        this.doNothing();
                }
    
    
    @Override
    public final void doNothingUp() {
        
    	
        this.setSprite(spriteMoveUp);
        this.doNothing();
                }
    
    
    @Override
    public final void doNothingDown() {
        
   	
            this.setSprite(spriteMoveDown);
            this.doNothing();
        
                }
    
    
    @Override
    public final void doNothingUR() {
           	
        this.setSprite(spriteMoveUpRight);
        this.doNothing();
        
                }
    
    @Override
    public final void doNothingUL() {
        
    	
        this.setSprite(spriteMoveUpLeft);
        this.doNothing();
                }
    
    @Override
    public final void doNothingDR() {
        
            this.setSprite(spriteMoveDownRight);
            this.doNothing();
        
                }
    
    @Override
    public final void doNothingDL() {
        
        this.setSprite(spriteMoveDownLeft);
        this.doNothing();
        
                }

	@Override
	public void Gateo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Gatec() {
		// TODO Auto-generated method stub
		
	}
    }

