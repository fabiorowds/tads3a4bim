package exercise2;

public class Item {

	private int value;
	private int limit;
	
	public Item(int value, int limit) {
		super();
		this.value = value;
		this.limit = limit;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
	@Override
	public String toString() {
		return "Item [value=" + value + ", limit=" + limit + "]";
	}

	
	
}
