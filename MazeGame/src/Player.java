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
	public Player() {
		name = JOptionPane.showInputDialog("What is your name?");
		inventory = new ArrayList<>();
		totalHealth = 10;
		currentHealth = 10;
		money = 0;
		damage = 2;
	}
	public int getTotalHealth(){
		return totalHealth;
	}
	public int getCurrentHealth(){
		return currentHealth;
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
