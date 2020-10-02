package Room;

public abstract class Room {
	Room above;
	Room below;
	Room left;
	Room right;

	abstract Room() {
	}
	abstract void setAbove(Room aboveRoom);
	abstract void setBelow(Room belowRoom);
	abstract void setLeft(Room leftRoom);
	abstract void setRight(Room rightRoom);
	abstract void getAbove();
	abstract void getBelow();
	abstract void getLeft();
	abstract void getRight();
}
