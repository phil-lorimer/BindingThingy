package Enemy;

public class MobEnemy extends Enemy {
	private int health;
	private int damage;
	private int diff;
	
	public MobEnemy(int difficulty){
		this.diff = difficulty;
		setHealth(diff);
		setdamage(diff);
	}
	

	public void setHealth(int d){
		int h = 0;
		switch (d){
		case 1:
			h = 2;
			break;
		case 2:
			h = 3;
			break;
		case 3:
			h = 6;
			break;
		}
		this.health = h;
	}
	
	
	private void setdamage(int d){
		int dmg = 0;
		switch (d){
		case 1:
			dmg = 1;
			break;
		case 2:
			dmg = 2;
			break;
		case 3:
			dmg = 3;
			break;
		}
		this.damage = dmg;
	}
	
	public void updateHealth(int u_Health) {
		this.health += u_Health;//much better than continuously setting enemy health
	}
	
	@Override
	public int getHealth(){
		return this.health;
	}
	
	public int getdamage(){
		return this.damage;
	}
}
