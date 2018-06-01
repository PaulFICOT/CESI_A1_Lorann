package contract.model;

import java.awt.Point;

import fr.exia.showboard.IPawn;

public interface IMobile extends IPawn, IElement {

    /**
     * Move up.
     */
    void moveUp();

    /**
     * Move left.
     */
    void moveLeft();

    /**
     * Move down.
     */
    void moveDown();

    /**
     * Move right.
     */
    void moveRight();

    /**
     * Do nothing.
     */
    void doNothingDown();
    
    void doNothingRight();
    
    void doNothingLeft();
    
    void doNothingUp();
    
    void doNothingUR();
    
    void doNothingUL();
    
    void doNothingDR();
    
    void doNothingDL();
    
    void doNothing();
    

    /**
     * Gets the x.
     *
     * @return the x
     */
    @Override
    int getX();

    /**
     * Gets the y.
     *
     * @return the y
     */
    @Override
    int getY();

    /**
     * Checks if is alive.
     *
     * @return the alive
     */
    Boolean isAlive();

    /**
     * Checks if the car crashed.
     *
     * @return the boolean
     */
    Boolean isCrashed();

    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.IPawn#getPosition()
     */
    @Override
    Point getPosition();

	void moveUpLeft();
	void moveDownLeft();
	void moveUpRight();
	void moveDownRight();

	void alive();

	Boolean isMonstre();

	Boolean isPurse();

	void ressucite();

	Boolean isCrystal();

	Boolean checkWin();

	Boolean isWin();


}
