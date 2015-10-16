import java.awt.event.KeyEvent;
import java.util.HashMap;

import javax.swing.JOptionPane;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Room.BossRoom;
import Room.Room;
import Room.StartRoom;

public final class GameRunner/* extends JFrame */{

	private static final HashMap<String, Integer> mapSizes; 
	public static Player p1;
	static {
		mapSizes = new HashMap<String, Integer>();
		mapSizes.put("Small", KeyEvent.VK_S);
		mapSizes.put("Medium", KeyEvent.VK_M);
		mapSizes.put("Large", KeyEvent.VK_L);
	}

	public GameRunner() {
		init();
	}

	public static void main(String[] args) {

	/*EventQueue.invokeLater(new Runnable() {
	**	@Override
	**	public void run() {
	**		final GameRunner game = new GameRunner();
	**		game.setVisible(true);
	**	}
	**});*/

		String floorSize = JOptionPane.showInputDialog("Pick a floor size: 'small,' 'medium,' or 'large'");
		Floor current = new Floor(floorSize);
		p1 = new Player(current);
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
	
	public static Player getPlayer(){
		return p1;
	}

	private void init () {
		/*
		//JFrame game = new JFrame();
		setTitle("BindingThingy v.0.0.1");
		setSize(90, 60);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		final Container container = this.getContentPane();
		container.setLayout(new BoxLayout(container, BoxLayout, Y_AXIS));

		final JPanel floorSizePanel = new JPanel();
		JLabel instr = new JLabel("Pick a floor size: 'small,' 'medium,' or 'large'")
		container.add(floorSizePanel);

		for(final String mapSize : mapSizes) {
			final JButton sizeButton = new JButton(mapSize);
			sizeButton.addActionListener(new  ActionListener() {
				@Override
				public void actionPerformed(final ActionEvent e) {
					floorSize = mapSize;
				}
			});
			sizeButton.setMnemonic(mapSizes.get(mapSize));
			*/
		}
	}


