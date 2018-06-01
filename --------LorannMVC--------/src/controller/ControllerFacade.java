package controller;

import java.io.IOException;

import contract.controller.IControllerFacade;
import contract.controller.IOrderPerformer;
import contract.model.IModelFacade;
import contract.view.IViewFacade;

public class ControllerFacade implements IControllerFacade, IOrderPerformer {

	
	
    /** The Constant speed of the thread. */
    private static final int speed = 100;

    /** The view. */
    private IViewFacade view;

    /** The model. */
    private IModelFacade model;

    /** The stack order. */
    private UserOrder stackOrder;
    
    private int i = 1;
	
    
    /**
     * Instantiates a new Lorann controller.
     *
     * @param view
     *            the view
     * @param model
     *            the model
     */
	public ControllerFacade(final IViewFacade view, final IModelFacade model) {
		this.setView(view);
	    this.setModel(model);
	    this.clearStackOrder();
	}

	/**
	 * Drive the game, player movement and threading
	 */
	@Override
	public void play() throws InterruptedException {
		
		
		while (getModel().getLorann().isWin()==false){
			getModel().getLorann().alive();
			
			if(this.getModel().getLorann().isAlive()) {
		
            Thread.sleep(speed);
            switch (this.getStackOrder()) {
                case RIGHT:
                    this.getModel().getLorann().moveRight();
                    break;
                case LEFT:
                    this.getModel().getLorann().moveLeft();
                    break;
                case UP:
                    this.getModel().getLorann().moveUp();
                    break;
                case DOWN:
                    this.getModel().getLorann().moveDown();
                    break;
                case DOWNRIGHT:
                    this.getModel().getLorann().moveDownRight();
                    break;
                case UPRIGHT:
                    this.getModel().getLorann().moveUpRight();
                    break;
                case DOWNLEFT:
                    this.getModel().getLorann().moveDownLeft();
                    break;
                case UPLEFT:
                    this.getModel().getLorann().moveUpLeft();
                    break;
              /*  case SHOOT:
                    this.getModel().getLorann().doNothing(i);
                    break;*/
                case NOP:
            	switch(i){
            		
            		
            		case 1:
            			this.getModel().getLorann().doNothingUp(); 
            		break;
            		
            		case 2:
            			this.getModel().getLorann().doNothingUR(); 
            		break;
            		
            		case 3:
            			this.getModel().getLorann().doNothingRight(); 
            		break;
            		
            		case 4:
            			this.getModel().getLorann().doNothingDR();
            		break;
            		
            		case 5:
            			this.getModel().getLorann().doNothingDown(); 
            		break;
            		
            		case 6:
            			this.getModel().getLorann().doNothingDL(); 
            		break;
            		
            		case 7:
            			this.getModel().getLorann().doNothingLeft(); 
            		break;
            		
            		case 8:
            			this.getModel().getLorann().doNothingUL(); i=0;
            		break;
            		
            		
            		
            		
            		}

            		i++;

            	}
            	

			}          
                    
			if(!this.getModel().getLorann().isAlive()){
			
				
            this.getView().displayMessage("  GAME OVER  \n  Ressucité : " );
            this.getModel().getLorann().ressucite();
                     
            //this.getView().followMyVehicle();
        }
			
 

	          this.clearStackOrder();
      
		}
        this.getView().displayMessage(" TU AS GAGNE " );
	}
	
    /**
     * Write the UserOrder in the stack of order (stackOrder)
     */
	@Override
	public void orderPerform(UserOrder userOrder) throws IOException {
		this.setStackOrder(userOrder);
	}
	
    /**
     * Gets the view.
     *
     * @return the view
     */
    private IViewFacade getView() {
        return this.view;
    }
    
    /**
     * Sets the view.
     *
     * @param view
     *            the view to set
     */
    private void setView(final IViewFacade view) {
        this.view = view;
    }
    
    /**
     * Gets the model.
     *
     * @return the model
     */
    private IModelFacade getModel() {
        return this.model;
    }
    
    /**
     * Sets the model.
     *
     * @param model
     *            the model to set
     */
    private void setModel(final IModelFacade model) {
        this.model = model;
    }
    
    /**
     * Gets the stack order.
     *
     * @return the stack order
     */
    private UserOrder getStackOrder() {
        return this.stackOrder;
    }

    /**
     * Sets the stack order.
     *
     * @param stackOrder
     *            the new stack order
     */
    private void setStackOrder(final UserOrder stackOrder) {
        this.stackOrder = stackOrder;
    }

    /**
     * Clear stack order.
     */
    private void clearStackOrder() {
        this.stackOrder = UserOrder.NOP;
    }

   /**
    * Get the order to perform
    */
    @Override
    public IOrderPerformer getOrderPeformer() {
        return this;
    }

}
