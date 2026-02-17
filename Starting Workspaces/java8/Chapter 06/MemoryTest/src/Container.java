
public class Container {
	private String initial = "A";
	private int myInt = 10;
	
	public String getInitial() {
		return initial;
	}
	
	public void setInitial(String initial) {
		this.initial = initial;
	}

	public int getMyInt() {
		return myInt;
	}

	public void setMyInt(int myInt) {
		this.myInt = myInt;
	}

	@Override
	public String toString() {
		return "Container{" +
				"initial='" + initial + '\'' +
				", myInt=" + myInt +
				'}';
	}
}
