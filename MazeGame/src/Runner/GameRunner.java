package Runner;

import java.awt.event.KeyEvent;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BoxLayout;

import java.awt.EventQueue;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import Room.BossRoom;
import Room.Room;
import Room.StartRoom;

public final class GameRunner extends JFrame {

	private static final long serialVersionUID = 1L;

	private static final HashMap<String, Integer> mapSizes; 
	/*private*/public static Player player;
	private String floorSize;

	static {
		mapSizes = new HashMap<String, Integer>();
		mapSizes.put("Small", KeyEvent.VK_S);
		mapSizes.put("Medium", KeyEvent.VK_M);
		mapSizes.put("Large", KeyEvent.VK_L);
	}

	public GameRunner() {
		floorSize = "Small";
		init();
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
	
			public void run() {
				final GameRunner game = new GameRunner();
				game.setVisible(true);
			}
		} );

		//String floorSize = JOptionPane.showInputDialog("Pick a floor size: 'small,' 'medium,' or 'large'");
		//createGame(floorSize);
	}
	
	public static Player getPlayer() {
		return player;
	}

	private void init () {
		//JFrame game = new JFrame();

		setTitle("BindingThingy v.0.0.1");
		setSize(300, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		final Container container = this.getContentPane();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS)); //BoxLayout, Y_AXIS));

		final JPanel floorSizePanel = new JPanel();
		final JLabel instr = new JLabel("Pick a floor size: 'small,' 'medium,' or 'large'");
		floorSizePanel.add(instr);
		container.add(floorSizePanel);

		final JPanel buttonPanel = new JPanel();
		for(final String mapSize : mapSizes.keySet()) {
			final JButton sizeButton = new JButton(mapSize);
			sizeButton.addActionListener(new  ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					setFloorSize(mapSize);
					createGame(floorSize);//call the method that creates the game (for you Shawn)
				}
			} );
			sizeButton.setMnemonic(mapSizes.get(mapSize));
			buttonPanel.add(sizeButton);
		}
			container.add(buttonPanel);			
	}

	protected void setFloorSize(String mapSize) {
		this.floorSize = mapSize;		
	}

	private void createGame(String floorSize) {
		Floor current = new Floor(floorSize);
		
		player = new Player(current);
		System.out.println("Name: " + player.getName() + " Health: " + player.getCurrentHealth() + "/" + player.getTotalHealth() + " Money: " + player.getMoney());
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


