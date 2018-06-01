package model.element.mobile;

import java.awt.Point;
import java.io.IOException;

import javax.swing.ImageIcon;

import contract.model.ILevel;
import contract.model.IMobile;
import fr.exia.showboard.IBoard;
import model.element.Element;
import model.element.Permeability;
import model.element.Sprite;
import model.element.motionless.Gatec;
import model.element.motionless.Gateo;
import model.element.motionless.MotionlessElement;

public abstract class Mobile extends Element implements IMobile {
    /**
     * The x.
     */
    private Point   position;
    private Point 	positionBefore;

    /** The alive. */
    protected Boolean alive;
    
    protected Boolean open = false;

    /** The road. */
    private ILevel  level;

    /** The board. */
    private IBoard  board;

    public static int score;
    
    protected Boolean win = false;
    

    /**
     * Instantiates a new mobile.
     *
     * @param sprite
     *            the sprite
     * @param road
     *            the road
     * @param permeability
     *            the permeability
     */
    Mobile(final Sprite sprite, final ILevel level, final Permeability permeability) {
        super(sprite, permeability);
        this.setLevel(level);
        this.position = new Point();
    }

    /**
     * Instantiates a new mobile.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     * @param sprite
     *            the sprite
     * @param road
     *            the road
     * @param permeability
     *            the permeability
     */
    protected Mobile(final int x, final int y, final Sprite sprite, final ILevel level, final Permeability permeability) {
        this(sprite, level, permeability);
        this.setX(x);
        this.setY(y);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.IMobile#moveUp()
     */
    @Override
    public void moveUp() {
        this.setY(this.getY() - 1);
        this.setHasMoved();
        if(isCrashed()){
        	moveDown();
        }
        try {
			Test();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }
    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.IMobile#moveLeft()
     */
    @Override
    public void moveLeft() {
        this.setX(this.getX() - 1);
        this.setHasMoved();
        if(isCrashed()){
        	moveRight();
        }
        try {
			Test();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.IMobile#moveDown()
     */
    @Override
    public void moveDown() {
        this.setY(this.getY() + 1);
        this.setHasMoved();
        if(isCrashed()){
        	moveUp();
        }
        try {
			Test();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        }
    

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.IMobile#moveRight()
     */
    @Override
    public void moveRight() {
    	
    	this.setX(this.getX() + 1);
        this.setHasMoved();
        if(isCrashed()){
        	moveLeft();
        }
        try {
			Test();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }


    @Override
    public void moveDownRight() {
        this.setX(this.getX() + 1);
        this.setY(this.getY() + 1);
        this.setHasMoved();
        
    }
    
    @Override
    public void moveDownLeft() {
        this.setX(this.getX() - 1);
        this.setY(this.getY() + 1);
        this.setHasMoved();
    }
    
    @Override
    public void moveUpRight() {
        this.setX(this.getX() + 1);
        this.setY(this.getY() - 1);
        this.setHasMoved();
    }
    
    @Override
    public void moveUpLeft() {
        this.setX(this.getX() - 1);
        this.setY(this.getY() - 1);
        this.setHasMoved();
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.IMobile#doNothing()
     */
    @Override
    public void doNothing() {
        this.setHasMoved();

        if(isMonstre()){
        	System.out.println("Mort");
        }
        
    }
    
    
    @Override
    public void ressucite(){
    	
    this.setX(1);
    this.setY(1);
        this.setHasMoved();


        
    }

    /**
     * Sets the has moved.
     */
    private void setHasMoved() {
        this.getLevel().setMobileHasChanged();
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.IMobile#getX()
     */
    @Override
    public final int getX() {
        return this.getPosition().x;
    }

    /**
     * Sets the x.
     *
     * @param x
     *            the new x
     */
    public final void setX(final int x) {
        this.getPosition().x = x;

        }
    

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.IMobile#getY()
     */
    @Override
    public final int getY() {
        return this.getPosition().y;
    }

    /**
     * Sets the y.
     *
     * @param y
     * 
     */
    public final void setY(final int y) {
        this.getPosition().y = y;

    }

    /**
     * Gets the road.
     *
     * @return the road
     */
    public ILevel getLevel() {
        return this.level;
    }

    /**
     * Sets the road.
     *
     * @param road
     *            the new road
     */
    private void setLevel(final ILevel level) {
        this.level = level;
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.IMobile#isAlive()
     */
    @Override
    public Boolean isAlive() {
        return this.alive;
    }
    
    @Override
    public Boolean isWin() {
        return this.win;
    }

    

    public void youWin() {
    	this.win = true;
    }
    
    public void die(){
    	this.alive = false;
    }
    
    
    public void Open(){
    	
    	this.open=true;
    	
    }
    /**
     * 
     * Dies.
     */
    public void alive() {
    	this.alive = true;
    }
    /**
     * Dies.
     */
    protected void recul() {
        //this.alive = false;
    	moveDown();
        this.setHasMoved();
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.IMobile#isCrashed()
     */
    @Override
    public Boolean isCrashed() {
        return this.getLevel().getOnTheLevelXY(this.getX(), this.getY()).getPermeability() == Permeability.BLOCKING;
    }
    
    @Override
    public Boolean isMonstre() {
        return this.getLevel().getOnTheLevelXY(this.getX(), this.getY()).getPermeability() == Permeability.MONSTER;
    }

    @Override
    public Boolean isPurse() {
        return this.getLevel().getOnTheLevelXY(this.getX(), this.getY()).getPermeability() == Permeability.PURSE;
    }
    
    @Override
    public Boolean isCrystal() {
        return this.getLevel().getOnTheLevelXY(this.getX(), this.getY()).getPermeability() == Permeability.CRYSTAL;
    }
    
    @Override
    public Boolean checkWin() {
        return this.getLevel().getOnTheLevelXY(this.getX(), this.getY()).getPermeability() == Permeability.GATEC;
    
    }
    
    public void Test() throws IOException{
    	


        if(isMonstre()){
        	System.out.println("Mort");
        	die();
        }
        
        if(isPurse()){
        	score += 100;
        	System.out.println("Score = " + score);
        	
        }

        if(isCrystal()){
        	
        	System.out.println("Tu as récupéré la clef ");
        	
        	
        	/*new Element(Gateo.SPRITE, Permeability.GATEC);
          
 
          Gatec.SPRITE.loadImage();*/
          //gatec.setSprite(Gatec.SPRITE);
        	Sprite SPRITE = new Sprite('A', "gate_open.png");
        	SPRITE.loadImage();
        	
        	
           	this.setSprite(SPRITE);
  
        	Open();
        	
        	//Gate.setEtat("OPEN");
        	
        }
        
        if(checkWin()&&open==true){
        	System.out.println("Gagné ");
        	youWin();
        	
        	
        }
        
        if(checkWin()&&open==false){
        	

	       die();
	    }
	    
    }
    
    
    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.IPawn#getPosition()
     */
    /*
     * (non-Javadoc)
     * @see fr.exia.insanevehicles.model.element.mobile.IMobile#getPosition()
     */
    @Override
    public Point getPosition() {
        return this.position;
    }

    /**
     * Sets the position.
     *
     * @param position
     *            the position to set
     */
    public void setPosition(final Point position) {
        this.position = position;
    }

    /**
     * Gets the board.
     *
     * @return the board
     */
    protected IBoard getBoard() {
        return this.board;
    }

}
