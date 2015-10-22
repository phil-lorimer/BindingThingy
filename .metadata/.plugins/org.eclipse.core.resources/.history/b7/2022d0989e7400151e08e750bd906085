import java.util.ArrayList;

import javax.swing.JOptionPane;
import Objects.*;

public class Player {
	private int totalHealth;
	private int currentHealth;
	private int money;
	private int damage;
	private String name;
	private ArrayList<Item> inventory;
	private Floor curr;
	public Player(Floor current) {
		this.name = JOptionPane.showInputDialog("What is your name?");
		this.inventory = new ArrayList<>();
		this.totalHealth = 10;
		this.currentHealth = 10;
		this.money = 0;
		this.damage = 2;
		this.curr = current;
	}
	public int getTotalHealth(){
		return totalHealth;
	}
	public int getCurrentHealth(){
		return currentHealth;
	}
	public void updateMoney(int n_coins){
		this.money += n_coins;
	}
	public void updateDamage(int n_dmg){
		this.damage += n_dmg;
	}
	public void increaseHealth(int t_health, boolean heal){
		this.totalHealth += t_health;
		if(heal == true){
			this.currentHealth = totalHealth;
		}
	}
	public void heal(int h_health){
		this.currentHealth += h_health;
		if(this.currentHealth > this.totalHealth){
			this.currentHealth = this.totalHealth;
		}
	}
	public int getMoney(){
		return money;
	}
	public int getDamage(){
		return damage;
	}
	public String getName(){
		return name;
	}
	public String getInventoryItems(){
		return inventory.toString();
	}
	public ArrayList<Item> getInventory(){
		return inventory;
	}
}
