
public class Main {

	public static void main(String args[]) {
		Main main = new Main();
		main.start();
	}
	
	public void start() {
		String last = "Z";
		int newVal = 20;
		Container container = new Container();
		container.setInitial("C");
		container.setMyInt(newVal);
		System.out.println(container);
		another(container,last, newVal);
	}
	
	public void another(Container initialHolder, String newInitial, int newVal) {
		newInitial.toLowerCase();
		initialHolder.setInitial("B");
		initialHolder.setMyInt(newVal + 10);
		System.out.println(initialHolder);
		Container initial2 = new Container();
		initialHolder=initial2;
		System.out.println(initial2);

//		System.out.println(initialHolder.getInitial());
//		System.out.println(newInitial);
	}
}
