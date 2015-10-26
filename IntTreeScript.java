public class IntTreeScript {
	public static void main(String[] args) {
		IntTreeScript myScript = new IntTreeScript();
		myScript.launch();
	}
	
	public void launch() {
		IntegerTreeNode root = new IntegerTreeNode(6);
		
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
		root.add(123);
		root.add(1);
		root.add(-2);
		root.add(-25);
		
		
	
		String str1;
		int int1; 
		
		boolean opLoop = true;
		while (opLoop) {
			System.out.println("What would you like to do?");
			System.out.println("1 - add an element to the tree?");
			System.out.println("2 - check if the tree contains an integer");
			System.out.println("3 - print the tree as a string showing whole tree");
			System.out.println("4 - print the tree as a string showing only branches with value");
			System.out.println("5 - determine the depth of the tree");
			System.out.println("0 - exit");
			System.out.print("> ");
			str1 = System.console().readLine();
			int1 = Integer.parseInt(str1);
			
			switch (int1) {
				case 1: 
					System.out.println("Input value of the int to be added:");
					System.out.print("> ");
					str1 = System.console().readLine();
					int1 = Integer.parseInt(str1);
					root.add(int1);
					break;
				
				case 2: 
					System.out.println("Input value of the int to be checked:");
					System.out.print("> ");
					str1 = System.console().readLine();
					int1 = Integer.parseInt(str1);
					if (root.contains(int1)) {
						System.out.println("The number "+ int1 + " is in the tree");
					}
					else {
						System.out.println("The number " + int1 +" is not in the tree");
					}
					break;
				
				case 3:
					System.out.println(root.toString());
					break;
					
				case 4:
					System.out.println(root.toStringSimple());
	
					break;
					
				case 5:
					System.out.println("The depth of the tree is: " + root.depth());
				
					break;
				
				case 0: 
					System.exit(0);
					break;
				default:
					System.out.println("That's not a valid input");
					break;
					
			}
					
		}
	}
	
	/*private void testAdd(IntegerTreeNode root , int value){
		root.add(value);
		System.out.println(root.toString());
		System.out.println(root.toStringSimple());
		System.out.println("Maximum value in the tree: " + root.getMax());
		System.out.println("Minimum value in the tree: " + root.getMin());
		
	}*/
}