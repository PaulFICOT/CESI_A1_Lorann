package main;

import model.IModel;
import model.Model;
import view.ViewFacade;

public abstract class Main {
	public static void main(final String[] args) {
    	final Model model = new Model();
    	final ViewFacade view = new ViewFacade(model);
    }
}
