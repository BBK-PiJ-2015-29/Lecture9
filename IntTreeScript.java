public class IntTreeScript {
	public static void main(String[] args) {
		IntTreeScript myScript = new IntTreeScript();
		myScript.launch();
	}
	
	public void launch() {
		IntegerTreeNode mid = new IntegerTreeNode(6);
		
		mid.add(8);
		mid.add(9);
		mid.add(13);
		mid.add(123);
		mid.add(1);
		mid.add(-2);
		mid.add(-25);
		
		System.out.println("Maximum value in the tree: " + mid.getMax());
		System.out.println("Minimum value in the tree: " + mid.getMin());
		
		boolean opLoop = true;
		while (opLoop) {
			System.out.println("Please input the integer to search for:");
			System.out.print("> ");
			String str = System.console().readLine();
			if (str.toUpperCase().equals("EXIT")) {
				System.exit(0);
			}
			int input = Integer.parseInt(str);
			
			if (mid.contains(input)) {
				System.out.println("The number "+ input + " is in the tree");
			}
			else {
				System.out.println("The number " + input +" is not in the tree");
			}	
		}
		
		
		
	}
}