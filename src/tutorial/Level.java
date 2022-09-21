package tutorial;

public enum Level {
	
	//We have 3 constants we can reference from this enum
	HIGH(3),
	MEDIUM(2),
	LOW(1);
	
	private int lvlNum;
	
	//constructor
	private Level(int num) {
		this.lvlNum=num;
	}
	
	public int getLvl() {
		return this.lvlNum;
	}
	
	public void setLvl(int num) {
		this.lvlNum=num;
	}
}
