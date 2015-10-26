public class IntTreeScript {
	public static void main(String[] args) {
		IntTreeScript myScript = new IntTreeScript();
		myScript.launch();
	}
	
	public void launch() {
		IntegerTreeNode root = new IntegerTreeNode(6);
		System.out.println("First Test:");
		
		System.out.println(root.toString());
		System.out.println(root.toStringSimple());
		//testAdd(root, 8);
		//testAdd(root, 9);
		//testAdd(root, 13);
		//testAdd(root, 123);
		//testAdd(root, 1);
		//testAdd(root, -2);
		//testAdd(root, -13);
		//testAdd(root, -25);
		root.add(9);
		root.add(13);
		System.out.println("Second Test:");
		System.out.println(root.toString());
		System.out.println(root.toStringSimple());
		root.add(123);
		root.add(1);
		root.add(-2);
		root.add(-25);
		System.out.println("Third Test:");
		System.out.println(root.toString());
		System.out.println(root.toStringSimple());
		
		
		boolean opLoop = true;
		while (opLoop) {
			System.out.println("Please input the integer to search for:");
			System.out.print("> ");
			String str = System.console().readLine();
			if (str.toUpperCase().equals("EXIT")) {
				System.exit(0);
			}
			int input = Integer.parseInt(str);
			
			if (root.contains(input)) {
				System.out.println("The number "+ input + " is in the tree");
			}
			else {
				System.out.println("The number " + input +" is not in the tree");
			}
			System.out.println(root.toString());
			
		}
	
	}
	
	private void testAdd(IntegerTreeNode root , int value){
		root.add(value);
		System.out.println(root.toString());
		System.out.println(root.toStringSimple());
		System.out.println("Maximum value in the tree: " + root.getMax());
		System.out.println("Minimum value in the tree: " + root.getMin());
		
	}
}