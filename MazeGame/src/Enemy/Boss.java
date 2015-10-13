package Enemy;

public class Boss extends Enemy{
	private double hitRate;
	private int b_bossType;
	private int b_health;
	private int b_damage;

	public Boss() {
		this.b_bossType = (int)Math.floor(Math.random()*5);
		bossType(b_bossType);
	}
	private void bossType(int n_bossType){
		double hR;
		switch (n_bossType){
		case 0:
			this.setHealth(10);
			hR = 0.25;
			break;
		case 1:
			this.setHealth(10);
			hR = 0.5;
			break;
		case 2:
			this.setHealth(10);
			hR = 0.75;
			break;
		case 3:
			this.setHealth(10);
			hR = 1.0;
			break;
		default:
			hR = 0;
		}
		this.hitRate = hR;
	}
	
	public void setHealth(int n_health) {
		this.b_health = n_health;
	}

	public int getHealth(){
		return this.b_health;
	}

	public void updateHealth(int u_health) {
		this.b_health += u_health;
	}
	
	public void setDamage(int n_dmg) {
		this.b_damage = n_dmg*((int)(Math.random()*hitRate));
	}

	public int getDamage(){
		return this.b_damage;
	}
}
