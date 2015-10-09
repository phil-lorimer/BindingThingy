import javax.swing.JOptionPane;

import Room.BossRoom;
import Room.Room;
import Room.StartRoom;
public final class GameRunner {

	public static void main(String[] args) {
		String floorSize = JOptionPane.showInputDialog("pick a floor size: 'medium' or 'large'");
		Floor current = new Floor(floorSize);
		Player p1 = new Player();
		System.out.println("Name: " + p1.getName() + " Health: " + p1.getCurrentHealth() + "/" + p1.getTotalHealth() + " Money: " + p1.getMoney());
			for (int i = 0; i<current.getDimensions(); i++){
				System.out.print("|");
				for (int j = 0; j< current.getDimensions(); j++){
					if (current.map[i][j] instanceof StartRoom){
						System.out.print("  S  |");
					}
					else if (current.map[i][j] instanceof BossRoom){
						System.out.print("  B  |");
					}
					else if(current.map[i][j] instanceof Room){
						System.out.print("  *  |");
					}
					else{
						System.out.print("  O  |");
					}
				}
				System.out.println();
			}
			System.out.println();
	}

}
