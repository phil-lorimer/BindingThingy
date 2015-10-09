package Enemy;

public class MobEnemy extends Enemy {
	
	public MobEnemy(int difficulty){
		this.diff = difficulty;
		this.health = setHealth(diff);
		this.damage = setdamage(diff);
	}
	
	private int setHealth(int d){
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
		return h;
	}
	
	private int setdamage(int d){
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
		return dmg;
	}
	
	public int getHealth(){
		return this.health;
	}
	
	public int getdamage(){
		return this.damage;
	}
}
