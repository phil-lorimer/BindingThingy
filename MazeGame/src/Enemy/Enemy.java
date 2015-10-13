package Enemy;

public abstract class Enemy {
	private int health;
	private int damage;
	private int diff;

	public Enemy() {

	}

	public void setHealth(int n_Health) {
		this.health = n_Health;
	}

	public int getHealth() {
		return this.health;
	}

	public void updateHealth(int u_Health) {
		this.health += u_Health;//much better than continuously setting enemy health
	}

	public void setDamage(int n_dmg) {
		this.damage = n_dmg;
	}

	public int getDamage() {
		return this.damage;
	}

	public void setDiff(int n_diff) {
		this.diff = n_diff;
	}

	public int getDiff() {
		return this.diff;
	}
}
