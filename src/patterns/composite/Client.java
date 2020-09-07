package patterns.composite;

public class Client {

	public static void main(String[] args) {
		Component l1 = new Leaf("Longbottom");
		Component l2 = new Leaf("Nissan");
		Component l3 = new Leaf("Maple");
		Component l4 = new Leaf("T.J.");
		
		Component tree = new Composite();
		tree.add(l1);
		tree.add(l2);
		tree.add(l3);
		tree.add(l4);
		
		tree.operation();
		
	}
}
