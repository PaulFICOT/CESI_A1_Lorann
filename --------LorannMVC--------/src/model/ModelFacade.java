package model;

import java.io.IOException;

import contract.model.ILevel;
import contract.model.IMobile;
import contract.model.IModelFacade;
import model.element.mobile.Gate;
import model.element.mobile.Lorann;


public class ModelFacade implements IModelFacade {

	   /** The road. */
    private ILevel  level;

    /** The my vehicle. */
    private IMobile lorann;
    
    private IMobile gatec;
    
    /**
     * Instantiates a new model.
     *
     * @param fileName
     *            the file name
     *            
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public ModelFacade(final String fileName) throws IOException {
        this.setLevel(new Level(fileName));
        this.setLorann(new Lorann(1, 1, this.getLevel()));
        this.setGatec(new Gate(10, 5, this.getLevel()));
        this.getLorann().getSprite().loadImage();
        this.getGatec().getSprite().loadImage();
    }
    
    /**
     * get level
     * @return level
     */
    @Override
    public final ILevel getLevel() {
        return this.level;
    }

    /**
     * Sets the level.
     *
     * @param level
     * 
     */
    private void setLevel(final ILevel level) {
        this.level = level;
    }

    /**
     * get lorann
     * 
     *@return lorann
     */
    @Override
    public final IMobile getLorann() {
        return this.lorann;
    }

    /**
     * Sets lorann.
     *
     * @param lorann
     *
     */
    private void setLorann(final IMobile lorann) {
        this.lorann = lorann;
    }

    private void setGatec(final IMobile gatec) {
        this.gatec = gatec;
    }

	@Override
	public IMobile getGatec() {
		// TODO Auto-generated method stub
		return this.gatec;
	}

}
