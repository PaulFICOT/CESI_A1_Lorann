package model;

import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

import javax.imageio.ImageIO;

import controller.ControllerOrder;

public class Lorann extends Mobile{
	private int x;
	private int y;
	private IModel model;
	private int exitX;
	private int exitY;
	public boolean spelled = false;
	int score = 0;
	char c;
	int lvl;
	Permeability perm = Permeability.CHARACTER;
	List<IElement> Arimages = new ArrayList<IElement>();
	List<IMobile> Armobile = new ArrayList<IMobile>();
	BufferedImage image;

	public Lorann(int x, int y, IModel model) throws SQLException {
		this.model = model;
		this.Arimages = this.model.getArimages();
		this.Armobile = this.model.getArmobile();
		this.x = x;
		this.y = y;

		try {
			this.image = ImageIO.read(new File("C:\\Users\\vince\\git\\Loran\\lorann_b.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void move(char c) throws IOException, SQLException {

		switch (c) {

		// move Right
		case 'R':
			this.image = ImageR();
			this.c = c;

			for (IElement obj : this.Arimages) {
				if ((obj.getX() == this.getX() + 1) && (obj.getY() == this.getY())) {
					if (obj.getPerm() == Permeability.PENETRABLE) {
						this.setX(getX() + 1);
						break;
					} else if (obj.getPerm() == Permeability.COLLECTABLE) {
						if (obj.getName() == "crystal") {
							for (IElement obj2 : this.Arimages) {
								if (obj2.getName() == "doorC") {
									DoorO doorO = new DoorO(obj2.getX(), obj2.getY());
									this.exitX = obj2.getX();
									this.exitY = obj2.getY();
									Arimages.set(Arimages.indexOf(obj2), doorO);
								}
							}
						}
						this.score = score + 100;
						System.out.println("Le score est de " +score);
						this.setX(getX() + 1);
						IElement black = new Black(obj.getX(), obj.getY());
						Arimages.set(Arimages.indexOf(obj), black);
						break;
					}
				}
			}
			break;
		// move Left
		case 'L':
			this.image = ImageL();
			this.c = c;

			for (IElement obj : this.Arimages) {
				if ((obj.getX() == this.getX() - 1) && (obj.getY() == this.getY())) {
					if (obj.getPerm() == Permeability.PENETRABLE) {
						this.setX(getX() - 1);
						break;
					} else if (obj.getPerm() == Permeability.COLLECTABLE) {
						if (obj.getName() == "crystal") {
							for (IElement obj2 : this.Arimages) {
								if (obj2.getName() == "doorC") {
									DoorO doorO = new DoorO(obj2.getX(), obj2.getY());
									this.exitX = obj2.getX();
									this.exitY = obj2.getY();
									Arimages.set(Arimages.indexOf(obj2),doorO);
								}
							}
						}
						this.score++;
						this.setX(getX() - 1);
						IElement black = (IElement) new Black(obj.getX(), obj.getY());
						Arimages.set(Arimages.indexOf(obj), black);
						break;
					} 
				}
			}
			break;

		// move Up
		case 'U':
			this.image = ImageU();
			this.c = c;

			for (IElement obj : this.Arimages) {
				if ((obj.getY() == this.getY() - 1) && (obj.getX() == this.getX())) {
					if (obj.getPerm() == Permeability.PENETRABLE) {
						this.setY(getY() - 1);
						break;
					} else if (obj.getPerm() == Permeability.COLLECTABLE) {
						if (obj.getName() == "crystal") {
							for (IElement obj2 : this.Arimages) {
								if (obj2.getName() == "doorC") {
									DoorO doorO = new DoorO(obj2.getX(), obj2.getY());
									this.exitX = obj2.getX();
									this.exitY = obj2.getY();
									Arimages.set(Arimages.indexOf(obj2), doorO);
								}
							}
						}
						this.score++;
						this.setY(getY() - 1);
						IElement black = (IElement) new Black(obj.getX(), obj.getY());
						Arimages.set(Arimages.indexOf(obj), black);
						break;
					}

				}
			}
			break;

		// move Down
		case 'D':
			this.image = ImageD();
			this.c = c;

			for (IElement obj : this.Arimages) {
				if ((obj.getY() == this.getY() + 1) && (obj.getX() == this.getX())) {
					if (obj.getPerm() == Permeability.PENETRABLE) {
						this.setY(getY() + 1);
						break;
					} else if (obj.getPerm() == Permeability.COLLECTABLE) {
						if (obj.getName() == "crystal") {
							for (IElement obj2 : this.Arimages) {
								if (obj2.getName() == "doorC") {
									DoorO doorO = new DoorO(obj2.getX(), obj2.getY());
									this.exitX = obj2.getX();
									this.exitY = obj2.getY();
									Arimages.set(Arimages.indexOf(obj2),doorO);
								}
							}
						}
						this.score++;
						this.setY(getY() + 1);
						IElement black = (IElement) new Black(obj.getX(), obj.getY());
						Arimages.set(Arimages.indexOf(obj), black);
						break;
					}

				}
			}
			break;
		}
		if ((this.x == this.exitX) && (this.y == this.exitY)) {
			this.lvl = this.model.getLvl();
			if(lvl<=5) {
			lvl++;
			this.model.createMap(lvl);
			System.out.println("END");
			}
			
		}
		if(this.model.checkBump(this.getX(), this.getY()) == Permeability.MONSTER){
			this.model.createMap(this.model.getLvl());
			//System.out.println("Monstre");
		}

	}

	public BufferedImage ImageD() throws IOException {
		image = ImageIO.read(new File("C:\\\\Users\\\\vince\\\\git\\\\Loran\\\\lorann_b.png"));
		return image;
	}

	public BufferedImage ImageDl() throws IOException {
		image = ImageIO.read(new File("C:\\\\Users\\\\vince\\\\git\\\\Loran\\\\lorann_bl.png"));
		return image;
	}

	public BufferedImage ImageDr() throws IOException {
		image = ImageIO.read(new File("C:\\\\Users\\\\vince\\\\git\\\\Loran\\\\lorann_br.png"));
		return image;
	}

	public BufferedImage ImageL() throws IOException {
		image = ImageIO.read(new File("C:\\\\Users\\\\vince\\\\git\\\\Loran\\\\lorann_l.png"));
		return image;
	}

	public BufferedImage ImageR() throws IOException {
		image = ImageIO.read(new File("C:\\\\Users\\\\vince\\\\git\\\\Loran\\\\lorann_r.png"));
		return image;
	}

	public BufferedImage ImageU() throws IOException {
		image = ImageIO.read(new File("C:\\\\Users\\\\vince\\\\git\\\\Loran\\\\lorann_u.png"));
		return image;
	}

	public BufferedImage ImageUl() throws IOException {
		image = ImageIO.read(new File("C:\\\\Users\\\\vince\\\\git\\\\Loran\\\\lorann_ul.png"));
		return image;
	}

	public BufferedImage ImageUr() throws IOException {
		image = ImageIO.read(new File("C:\\\\Users\\\\vince\\\\git\\\\Loran\\\\lorann_ur.png"));
		return image;
	}

	public BufferedImage Image() throws IOException {
		return image;

	}

	public Permeability getPerm() {
		return this.perm;
	}

	public void launchSpell(char c) throws SQLException {
		if(spelled  == false) {
		RainbowSpell spell = new RainbowSpell(this.getX(), this.getY(), this.c, this.model);
		spelled = true;
		}
	}

	public void getMessage() {
		// TODO Auto-generated method stub

	}

	public Observable getObservable() {
		// TODO Auto-generated method stub
		return null;
	}

	public void getMap1() throws SQLException {
		// TODO Auto-generated method stub
	}

	public void control() {
		// TODO Auto-generated method stub

	}

	public void orderPerform(ControllerOrder controllerOrder) throws IOException, SQLException {
		// TODO Auto-generated method stub

	}

	public void printMessage(String message) {
		// TODO Auto-generated method stub

	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	public List<IMobile> getArmobile() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<IElement> getArimages() {
		// TODO Auto-generated method stub
		return null;
	}

	public void move() {
		// TODO Auto-generated method stub

	}

	public String getName() {
		// TODO Auto-generated method stub
		return "lorann";
	}

}
