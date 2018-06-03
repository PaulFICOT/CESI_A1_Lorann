package model;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

public class Monster4 extends Mobile{

	int timerTimeInMilliSeconds = 1500;
	

	private int x;
	private int y;
	private IModel model;

	Permeability perm = Permeability.MONSTER;

	private List<IMobile> Armobile = new ArrayList<IMobile>();
	private List<IElement> Arimages = new ArrayList<IElement>();

	public Monster4(int x, int y, IModel model) throws SQLException {
		this.model = model;
		this.Arimages = this.model.getArimages();
		this.Armobile = this.model.getArmobile();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public BufferedImage Image() throws IOException {
		BufferedImage monster_1 = ImageIO.read(new File("C:\\\\Users\\\\vince\\\\git\\\\Loran\\\\monster_4.png"));
		return monster_1;
	}

	public Permeability getPerm() {
		return this.perm;
	}

public void move() {
	if ((this.Armobile.get(0).getX() < this.x) && (this.Armobile.get(0).getY() < this.y))

		for (IElement obj : this.Arimages) {
			
			if(this.model.checkBump(this.getX()-1, this.getY()-1) == Permeability.PENETRABLE){
					this.setX(getX() - 1);
					this.setY(getY() - 1);
					break;
				
			}
		}

	/*
	 * Upper-right
	 */

	if ((this.Armobile.get(0).getX() > this.x) && (this.Armobile.get(0).getY() < this.y)) {
		for (IElement obj : this.Arimages) {
			if (this.model.checkBump(this.getX()+1, this.getY()-1) == Permeability.PENETRABLE) {
					this.setX(getX() + 1);
					this.setY(getY() - 1);
					break;
				}
			
		}
	}

	/*
	 * Lower-left
	 */

	else if ((this.Armobile.get(0).getX() < this.x) && (this.Armobile.get(0).getY() > this.y)) {

		for (IElement obj : this.Arimages) {
			if (this.model.checkBump(this.getX()-1, this.getY()+1) == Permeability.PENETRABLE) {
					this.setX(getX() - 1);
					this.setY(getY() + 1);
					break;
				
			}
		}
	}

	/*
	 * Lower-right
	 */

	else if ((this.Armobile.get(0).getX() > this.x) && (this.Armobile.get(0).getY() > this.y)) {

		for (IElement obj : this.Arimages) {
			if (this.model.checkBump(this.getX()+1, this.getY()+1) == Permeability.PENETRABLE) {
					this.setX(getX() + 1);
					this.setY(getY() + 1);
					break;
				
			}
		}
	}

	/*
	 * Left
	 */

	else if ((this.Armobile.get(0).getX() < this.x) && (this.Armobile.get(0).getY() == this.y)) {

		for (IElement obj : this.Arimages) {
			if (this.model.checkBump(this.getX()-1, this.getY()) == Permeability.PENETRABLE) {
					this.setX(getX() - 1);
					break;
				}
			
		}
	}

	/*
	 * Right
	 */

	else if ((this.Armobile.get(0).getX() > this.x) && (this.Armobile.get(0).getY() == this.y)) {

		for (IElement obj : this.Arimages) {
			if (this.model.checkBump(this.getX()+1,this.getY()) == Permeability.PENETRABLE) {
					this.setX(getX() + 1);
					break;
				}
			
		}
	}

	/*
	 * Up
	 */

	else if ((this.Armobile.get(0).getX() == this.x) && (this.Armobile.get(0).getY() < this.y)) {

		for (IElement obj : this.Arimages) {
			if (this.model.checkBump(this.getX(), this.getY()-1) == Permeability.PENETRABLE) {
					this.setY(getY() - 1);
					break;
				}
			}
		
	}

	/*
	 * Down
	 */

	else if ((this.Armobile.get(0).getX() == this.x) && (this.Armobile.get(0).getY() > this.y)) {

		for (IElement obj : this.Arimages) {
			if (this.model.checkBump(this.getX(), this.getY()+1) == Permeability.PENETRABLE) {
					this.setY(getY() + 1);
					break;
				}
			}
		}
	

	else {
	}
	if (this.model.checkBump(this.getX(), this.getY()) == Permeability.SPELL) {
		System.out.println("ogv");
		try {
			this.model.getArmobile().remove(this);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public void launchSpell(char c) {
	// TODO Auto-generated method stub

}
	public void move(char c) throws IOException, SQLException {
		// TODO Auto-generated method stub

	}

	public String getName() {
		// TODO Auto-generated method stub
		return "monster4";
	}
}
