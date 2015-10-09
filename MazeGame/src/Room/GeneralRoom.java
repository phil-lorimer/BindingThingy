package Room;
import java.util.ArrayList;

import Enemy.Enemy;
import Enemy.MobEnemy;

public class GeneralRoom extends Room{
	private int difficulty;
	private final int MAX = 3;
	private final int MIN = 1;
	private ArrayList<Enemy> roomPopulation;
	int numEnemies;
	
	public GeneralRoom() {
		difficulty = MIN + (int)(Math.random()*MAX);
		this.roomPopulation = new ArrayList<Enemy>();
		switch (difficulty){
		case 1: 
			for (int i = 0; i< 6; i++){
				roomPopulation.add(new MobEnemy(difficulty));
			}
			numEnemies = roomPopulation.size();
			break;
		case 2: 
			for (int i = 0; i< 4; i++){
				roomPopulation.add(new MobEnemy(difficulty));
			}
			numEnemies = roomPopulation.size();
			break;
		case 3: 
			for (int i = 0; i< 2; i++){
				roomPopulation.add(new MobEnemy(difficulty));
			}
			numEnemies = roomPopulation.size();
			break;
		}
	}
	public void getAbove(){}
	public void getBelow(){}
	public void getLeft(){}
	public void getRight(){}
}
