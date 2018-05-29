package view;

import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controller.IController;
import model.IModel;

public class View extends JFrame implements KeyListener {

	private View view;
	private IModel model;
	private IController controller;
	
	public View(IModel model) throws HeadlessException{
		this.buildView(model);
	}
	


	public View(final IModel model, final GraphicsConfiguration gc) {
		super(gc);
		this.buildView(model);
	}
	
	public View(final IModel model, final String title, final GraphicsConfiguration gc) {
		super(title, gc);
		this.buildView(model);
	} 

	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		//this.getController().orderPerform(View.keyCodeToControllerOrder(e.getKeyCode()));
		try {
			this.getController().orderPerform(ViewFacade.keyCodeToControllerOrder(e.getKeyCode()));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	private void buildView(final IModel model) {
		this.setModel(model);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.addKeyListener(this);
		this.setContentPane(new Panel(this));
		this.setTitle("LorannProject | Dhennin Briaux Maniez Ficot");
		this.setSize(640, 384);
		this.setBackground(Color.BLACK);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	private void setModel(IModel model) {
		// TODO Auto-generated method stub
		this.model = model;
	}

	public void printMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	public IModel getModel() {
		return this.model; //Retourner le modèle quand celui ci sera implémenté
	}
	
	public IController getController() {
		return this.controller;
	}

	public void setController(IController controller2) {
		// TODO Auto-generated method stub
		this.view.setController(controller);
	}
}
