package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

import javax.imageio.ImageIO;

public class Monster2 extends Mobile{

	Timer timer = new Timer();

	private int x;
	private int y;
	private IModel model;

	Permeability perm = Permeability.MONSTER;

	private List<IMobile> Armobile = new ArrayList<IMobile>();
	private List<IElement> Arimages = new ArrayList<IElement>();

	public Monster2(int x, int y, IModel model) throws SQLException {
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
		BufferedImage monster_1 = ImageIO.read(new File("src/main/resources/sprite/monster_2.png"));
		return monster_1;
	}

	public Permeability getPerm() {
		return this.perm;
	}


public void move() {}

public void launchSpell(char c) {
	// TODO Auto-generated method stub

}
	public void move(char c) throws IOException, SQLException {
		// TODO Auto-generated method stub

	}

	public String getName() {
		// TODO Auto-generated method stub
		return "monster2";
}
}
