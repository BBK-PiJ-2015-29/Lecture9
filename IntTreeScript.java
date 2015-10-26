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
		
		System.out.println("Please input the integer to search for:");
		System.out.print("> ");
		String str = System.console().readLine();
		int input = Integer.parseInt(str);
		
		if (mid.contains(input)) {
			System.out.println("The number "+ input + " is in the tree");
		}
		else {
			System.out.println("The number " + input +" is not in the tree");
		}
	}
}