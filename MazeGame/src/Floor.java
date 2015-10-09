import Room.BossRoom;
import Room.GeneralRoom;
import Room.Room;
import Room.StartRoom;


public class Floor {
	Room[][] map;
	private int dimension;
	public Floor(String size) {
		boolean hasStart = false;
		boolean[][] floorPlan = null;
		if(size.equals("medium")){
			map = new Room[5][5];
			floorPlan = new boolean[5][5];
			dimension = 5;
			floorPlan = generate();
			
		}
		else if(size.equals("large")){
			map = new Room[7][7];
			floorPlan = new boolean[7][7];
			dimension = 7;
			floorPlan = generate();
		}
		int roomCount = 0;
		for (int x = 0; x< dimension; x++){
			for (int y = 0; y< dimension; y++){
				if(floorPlan[x][y]==true && hasStart == false){
					map[x][y] = new StartRoom();
					hasStart = true;
					roomCount++;
				}
				else if(floorPlan[x][y]==true && roomCount == 5){
					map[x][y] = new BossRoom();
					roomCount++;
				}
				else if(floorPlan[x][y]==true){
					map[x][y] = new GeneralRoom();
					roomCount++;
				}
			}
		}
		if(roomCount <= 5){
			for (int x = 0; x< dimension; x++){
				for (int y = 0; y< dimension; y++){
					if (x == 0 && y == dimension - 1){
						map[x+1][y] = new BossRoom();
						x= dimension;
						y = dimension;
					}
					else if (x == dimension - 1 && y == dimension - 1){
						map[x-1][y] = new BossRoom();
						x= dimension;
						y = dimension;
					}
					else if (x == dimension -1 && y == 0){
						map[x][y+1] = new BossRoom();
						x= dimension;
						y = dimension;
					}
					else if (x == 0){
						map[x+1][y] = new BossRoom();
						x= dimension;
						y = dimension;
					}
					else if (x == dimension-1){
						map[x][y+1] = new BossRoom();
						x= dimension;
						y = dimension;
					}
					else if (y == 0){
						map[x][y+1] = new BossRoom();
						x= dimension;
						y = dimension;
					}
					else if (y == dimension-1){
						map[x][y-1] = new BossRoom();
						x= dimension;
						y = dimension;
					}
					else{
						map[x+1][y] = new BossRoom();
						x= dimension;
						y = dimension;
					}
				}
			}
		}
	}
	public int getDimensions(){
		return dimension;
	}
	private boolean[][] generate() {
		boolean[][] plan = new boolean[dimension][dimension];
		final int MAX = dimension;
		final int MIN = 1;
		int rooms = 0;
		int willGenerate;
		for(int i = 0; i<dimension; i++){
			for(int j = 0; j< dimension; j++){
				willGenerate = MIN + (int)(Math.random()*MAX);
				if((willGenerate == 1) || (willGenerate == 3) || (willGenerate == 5) || (willGenerate == 7)){
					if(rooms == 0) {
						rooms++;
						plan[i][j] = true;
					}
					else if (i == 0 && j == dimension - 1){
						if(plan[i][j-1] == false && plan[i+1][j] == false){
							plan[i][j]= false;
						}
						else plan[i][j] = true;
					}
					else if (i == dimension - 1 && j == dimension - 1){
						if(plan[i][j-1] == false && plan[i-1][j] == false){
							plan[i][j]= false;
						}
						else plan[i][j] = true;
					}
					else if (i == dimension -1 && j == 0){
						if(plan[i][j+1] == false && plan[i-1][j] == false){
							plan[i][j]= false;
						}
						else plan[i][j] = true;
					}
					else if (i == 0){
						if(plan[i][j-1] == false && plan[i][j+1] == false && plan[i+1][j] == false){
							plan[i][j]= false;
						}
						else plan[i][j] = true;
					}
					else if (i == dimension-1){
						if(plan[i][j-1] == false && plan[i][j+1] == false && plan[i-1][j] == false){
							plan[i][j]= false;
						}
						else plan[i][j] = true;
					}
					else if (j == 0){
						if(plan[i-1][j] == false && plan[i+1][j] == false && plan[i][j+1] == false){
							plan[i][j]= false;
						}
						else plan[i][j] = true;
					}
					else if (j == dimension-1){
						if(plan[i-1][j] == false && plan[i+1][j] == false && plan[i][j-1] == false){
							plan[i][j]= false;
						}
						else plan[i][j] = true;
					}
					else{
						if(plan[i-1][j] == false && plan[i+1][j] == false && plan[i][j-1] == false && plan[i][j+1] == false){
							plan[i][j]= false;
						}
						else plan[i][j] = true;
					}
				}
			}
		}
		return plan;
	}

}
