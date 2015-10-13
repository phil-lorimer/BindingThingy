package Enemy;

public class Boss extends Enemy{
	private double hitRate;
	private int b_bossType;

	public Boss() {
		this.b_bossType = (int)Math.floor(Math.random()*5);
		bossType(b_bossType);
	}
	private void bossType(int n_bossType){
		double hR;
		switch (n_bossType){
		case 0:
			hR = 0.25;
			break;
		case 1:
			hR = 0.5;
			break;
		case 2:
			hR = 0.75;
			break;
		case 3:
			hR = 1.0;
		}
		this.hitRate = hR;
	}
	
	public void setHealth(int n_health) {
		this.health = n_health;
	}

	public int getHealth(){
		return this.health;
	}

	public int updateHealth(int u_health) {
		this.health += u_health;
	}
	
	public void setDamage(int n_dmg) {
		this.damage = n_dmg*((int)(Math.random()*hitRate));
	}

	public int getDamage(){
		return this.damage;
	}
}
