package view;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import model.IElement;
import model.IMobile;

public class Panel extends JPanel implements Observer, ActionListener, IView {
	private View view;
	Image img[] = new Image[23];
	
	Timer timer = new Timer(200, this);
	public List<IElement> Image = new ArrayList<IElement>();
	public List<IMobile> Mobile = new ArrayList<IMobile>();
	
	
	
	// Servira a afficher la map private IElement[][] map; 
	
	public Panel(View view) {
		timer.start();
		this.setView(view);
		view.getModel();
	}
	
	/*private View getView() {
		return view;
	}*/
	
	private void setView(View view) {
		// TODO Auto-generated method stub
		this.view = view;
	}
	
	
	public void update(IElement[][] map) {
		// TODO Auto-generated method stub
		
	}
	
	public void paintComponant(Graphics graphics) throws IOException {
		
		int pixel = 32;
		
		try {
			Image = this.view.getModel().getImages();
			Mobile = this.view.getModel().getMobile();
		}catch(SQLException e){
			e.printStackTrace();
		}
		for(IElement obj : Image) {
			
			int x = obj.getX();
			int y = obj.getY();
			
		}
		
		for(IMobile obj : Mobile) {
			
			int x = obj.getX();
			int y = obj.getY();
			graphics.drawImage(obj.Image(), x * pixel, y * pixel, this);
		}
		
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		this.repaint();
	}
	
	public void LoadImage() {
		img[0] = new ImageIcon("sprite/bone.png").getImage();
		img[1] = new ImageIcon("sprite/crystal_ball.png").getImage();
		img[2] = new ImageIcon("sprite/fireball_1.png").getImage();
		img[3] = new ImageIcon("sprite/fireball_2.png").getImage();
		img[4] = new ImageIcon("sprite/fireball_3.png").getImage();
		img[5] = new ImageIcon("sprite/fireball_4.png").getImage();
		img[6] = new ImageIcon("sprite/fireball_5.png").getImage();
		img[7] = new ImageIcon("sprite/gate_closed.png").getImage();
		img[8] = new ImageIcon("sprite/gate_open.png").getImage();
		img[9] = new ImageIcon("sprite/horizontal_bone.png").getImage();
		img[10] = new ImageIcon("sprite/lorann_b.png").getImage();
		img[11] = new ImageIcon("sprite/lorann_bl.png").getImage();
		img[12] = new ImageIcon("sprite/lorann_br.png").getImage();
		img[13] = new ImageIcon("sprite/lorann_l.png").getImage();
		img[14] = new ImageIcon("sprite/lorann_r.png").getImage();
		img[15] = new ImageIcon("sprite/lorann_u.png").getImage();
		img[16] = new ImageIcon("sprite/lorann_ul.png").getImage();
		img[17] = new ImageIcon("sprite/lorann_ur.png").getImage();
		img[18] = new ImageIcon("sprite/monster_1.png").getImage();
		img[19] = new ImageIcon("sprite/monster_2.png").getImage();
		img[20] = new ImageIcon("sprite/monster_3.png").getImage();
		img[21] = new ImageIcon("sprite/monster_4.png").getImage();
		img[22] = new ImageIcon("sprite/purse.png").getImage();
		img[23] = new ImageIcon("sprite/vertical_bone.png").getImage();
	}

	@Override
	public List<IMobile> getMobile() {
		// TODO Auto-generated method stub
		return Mobile;
	}

	@Override
	public List<IElement> getImages() {
		// TODO Auto-generated method stub
		return Image;
	}
	
	public void addMobile(IMobile mobile) {
		this.Mobile.add(mobile);
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		for(IMobile obj : this.Mobile) {
			
			obj.move();
			repaint();
			
		}
		
	}

}
