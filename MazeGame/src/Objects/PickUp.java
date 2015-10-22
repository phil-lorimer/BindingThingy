package Objects;

import Runner.GameRunner;

public class PickUp extends Item {
	private final int MIN_TYPE = 0;
	private final int MAX_TYPE = 2;
	private final int MIN_COINS = 1;
	private final int MAX_COINS = 10;
	private int type;
	public PickUp() {
		type = MIN_TYPE + (int)(Math.random()*MAX_TYPE);
		switch(type){
			case 0: 
				int numCoins = MIN_COINS + (int)(Math.random()*MAX_COINS); 
				GameRunner.player.updateMoney(numCoins);
				break;
			case 1: 
				GameRunner.getPlayer().heal(1);
				break;
			case 2: 
				GameRunner.getPlayer().heal(2);
				break;
		}
	}

}
