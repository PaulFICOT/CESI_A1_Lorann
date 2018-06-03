package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.imageio.ImageIO;

public class RainbowSpell extends Mobile implements IElement {
	private int x;
	private int y;
	private char c;
	boolean spelled = false;
	private IModel model;
	BufferedImage image;
	boolean wall;
	boolean lorann;
	Permeability checkPerm;
	List<IMobile> Armobile;

	Permeability perm = Permeability.SPELL;

	public RainbowSpell(int x, int y, char c, IModel model) {

		spelled = false;
		
		this.model = model;
		try {
			this.Armobile = this.model.getArmobile();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Armobile.add(this);
		this.x = x;
		this.y = y;
		this.c = c;

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

	
	// Bufferring of the different images of the RainbowSpell
	
	public BufferedImage Image1() throws IOException {
		BufferedImage image = ImageIO.read(new File("C:\\\\Users\\\\vince\\\\git\\\\Loran\\\\fireball_1.png"));
		return image;
	}

	public BufferedImage Image2() throws IOException {
		BufferedImage image = ImageIO.read(new File("C:\\\\Users\\\\vince\\\\git\\\\Loran\\\\fireball_2.png"));
		return image;
	}

	public BufferedImage Image3() throws IOException {
		BufferedImage image = ImageIO.read(new File("C:\\\\Users\\\\vince\\\\git\\\\Loran\\\\fireball_3.png"));
		return image;
	}

	public BufferedImage Image4() throws IOException {
		BufferedImage image = ImageIO.read(new File("C:\\\\Users\\\\vince\\\\git\\\\Loran\\\\fireball_4.png"));
		return image;
	}

	public BufferedImage Image5() throws IOException {
		BufferedImage image = ImageIO.read(new File("C:\\\\Users\\\\vince\\\\git\\\\Loran\\\\fireball_5.png"));
		return image;
	}

	public BufferedImage Image() throws IOException {
		// TODO Auto-generated method stub
		return image;
	}

	public Permeability getPerm() {
		// TODO Auto-generated method stub
		return this.perm;
	}

	public void launchSpell(char c) {
		// TODO Auto-generated method stub

	}

	public void move(char c) {
		// TODO Auto-generated method stub

	}

	//Behavior of the spell depending of the direction of the attack
	
	public void moveL() {
		
		if (this.wall == false) {
			if (this.model.checkBump(this.getX() + 1, this.getY()) == Permeability.MONSTER) {
				// kill monster
			} else if (this.model.checkBump(this.getX() + 1, this.getY()) == Permeability.CHARACTER) {
				Armobile.remove(this);
			} else if (this.model.checkBump(this.getX() + 1, this.getY()) == Permeability.PENETRABLE) {
				this.setX(this.getX() + 1);
			} else if (this.model.checkBump(this.getX() + 1, this.getY()) == Permeability.BLOCKING) {
				this.wall = true;
				this.setX(this.getX() - 1);

			} else if (this.model.checkBump(this.getX() + 1, this.getY()) == Permeability.COLLECTABLE) {
				this.setX(this.getX() + 1);
				this.wall = true;
			}
		}

		else if (this.wall == true) {
			if (this.model.checkBump(this.getX() + 1, this.getY()) == Permeability.MONSTER) {
				// kill monster
			} else if (this.model.checkBump(this.getX() - 1, this.getY()) == Permeability.CHARACTER) {
				Armobile.remove(this);
			} else if (this.model.checkBump(this.getX() - 1, this.getY()) == Permeability.PENETRABLE) {
				this.setX(this.getX() - 1);
			} else if (this.model.checkBump(this.getX() - 1, this.getY()) == Permeability.BLOCKING) {
				this.wall = false;
				this.setX(this.getX() + 1);

			} else if (this.model.checkBump(this.getX() - 1, this.getY()) == Permeability.COLLECTABLE) {
				this.setX(this.getX() + 1);
				this.wall = false;
			}
		}
	}

	public void moveU() {
		
		if (this.wall == false) {
			if (this.model.checkBump(this.getX(), this.getY() + 1) == Permeability.MONSTER) {
				// kill monster
			} else if (this.model.checkBump(this.getX(), this.getY() + 1) == Permeability.CHARACTER) {
				Armobile.remove(this);
			} else if (this.model.checkBump(this.getX(), this.getY() + 1) == Permeability.PENETRABLE) {
				this.setY(this.getY() + 1);
			} else if (this.model.checkBump(this.getX(), this.getY() + 1) == Permeability.BLOCKING) {
				this.wall = true;
				this.setY(this.getY() - 1);

			} else if (this.model.checkBump(this.getX(), this.getY() + 1) == Permeability.COLLECTABLE) {
				this.setY(this.getY() - 1);
				this.wall = true;
			}
		}

		else if (this.wall == true) {
			if (this.model.checkBump(this.getX(), this.getY() + 1) == Permeability.MONSTER) {
				// kill monster
			} else if (this.model.checkBump(this.getX(), this.getY() - 1) == Permeability.CHARACTER) {
				Armobile.remove(this);
			} else if (this.model.checkBump(this.getX(), this.getY() - 1) == Permeability.PENETRABLE) {
				this.setY(this.getY() - 1);
			} else if (this.model.checkBump(this.getX(), this.getY() - 1) == Permeability.BLOCKING) {
				this.wall = false;
				this.setY(this.getY() + 1);

			} else if (this.model.checkBump(this.getX(), this.getY() - 1) == Permeability.COLLECTABLE) {
				this.setY(this.getY() + 1);
				this.wall = false;
			}
		}
	}

	public void moveR() {
		if (this.wall == false) {
			if (this.model.checkBump(this.getX() - 1, this.getY()) == Permeability.MONSTER) {
				// kill monster
			} else if (this.model.checkBump(this.getX() - 1, this.getY()) == Permeability.CHARACTER) {
				spelled = false;
				Armobile.remove(this);
			} else if (this.model.checkBump(this.getX() - 1, this.getY()) == Permeability.PENETRABLE) {
				this.setX(this.getX() - 1);
			} else if (this.model.checkBump(this.getX() - 1, this.getY()) == Permeability.BLOCKING) {
				this.wall = true;
				this.setX(this.getX() + 1);
			} else if (this.model.checkBump(this.getX() - 1, this.getY()) == Permeability.COLLECTABLE) {
				this.setX(this.getX() + 1);
				this.wall = true;
			}
		}

		else if (this.wall == true) {
			if (this.model.checkBump(this.getX() - 1, this.getY()) == Permeability.MONSTER) { //+1 became -1
				// kill monster
			} else if (this.model.checkBump(this.getX() + 1, this.getY()) == Permeability.CHARACTER) {
				Armobile.remove(this);
			} else if (this.model.checkBump(this.getX() + 1, this.getY()) == Permeability.PENETRABLE) {
				this.setX(this.getX() + 1);
			} else if (this.model.checkBump(this.getX() + 1, this.getY()) == Permeability.BLOCKING) {
				this.wall = false;
				this.setX(this.getX() - 1);

			} else if (this.model.checkBump(this.getX() + 1, this.getY()) == Permeability.COLLECTABLE) {
				this.setX(this.getX() - 1);
				this.wall = false;
			}
		}
	}

	public void moveD() {

		if (this.wall == false) {
			if (this.model.checkBump(this.getX(), this.getY() - 1) == Permeability.MONSTER) {
				// kill monster
			} else if (this.model.checkBump(this.getX(), this.getY() - 1) == Permeability.CHARACTER) {
				Armobile.remove(this);
			} else if (this.model.checkBump(this.getX(), this.getY() - 1) == Permeability.PENETRABLE) {
				this.setY(this.getY() - 1);
			} else if (this.model.checkBump(this.getX(), this.getY() - 1) == Permeability.BLOCKING) {
				this.wall = true;
				this.setY(this.getY() + 1);

			} else if (this.model.checkBump(this.getX(), this.getY() - 1) == Permeability.COLLECTABLE) {
				this.setY(this.getY() + 1);
				this.wall = true;
			}
		}

		else if (this.wall == true) {
			if (this.model.checkBump(this.getX(), this.getY() - 1) == Permeability.MONSTER) {//+1 became -1
				// kill monster
			} else if (this.model.checkBump(this.getX(), this.getY() + 1) == Permeability.CHARACTER) {
				Armobile.remove(this);
			} else if (this.model.checkBump(this.getX(), this.getY() + 1) == Permeability.PENETRABLE) {
				this.setY(this.getY() + 1);
			} else if (this.model.checkBump(this.getX(), this.getY() + 1) == Permeability.BLOCKING) {
				this.wall = false;
				this.setY(this.getY() - 1);

			} else if (this.model.checkBump(this.getX(), this.getY() + 1) == Permeability.COLLECTABLE) {
				this.setY(this.getY() - 1);
				this.wall = false;
			}
		}
	}

	public void move() {
		if (this.spelled == false) {
			
			switch (c) {

			case 'R':
			
				try {
					image = Image1();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				moveR();
				break;

			case 'L':
				try {
					image = Image2();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				moveL();
				break;
			case 'U':
				try {
					image = Image3();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				moveU();
				break;

			case 'D':
				try {
					image = Image4();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				moveD();
				break;
			}

		} else{}
		// TODO Auto-generated method stub

	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<IElement> getArimages() {
		// TODO Auto-generated method stub
		return null;
}
}
