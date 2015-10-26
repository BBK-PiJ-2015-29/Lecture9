public class IntegerTreeNode {
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;

	public IntegerTreeNode(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	// getters and setters
	public int getValue() {
		return this.value;		
	}
	public void setValue(int value) {
		this.value = value;
	}
	public IntegerTreeNode getLeft() {
		return this.left;		
	}
	public void setLeft(IntegerTreeNode left) {
		this.left = left;
	}
	public IntegerTreeNode getRight() {
		return this.right;		
	}
	public void setRight(IntegerTreeNode right) {
		this.right = right;
	}
	
	// add method
	public void add(int newValue) {
		if(newValue > this.value) {
			if(this.right == null) {
				this.right = new IntegerTreeNode(newValue);
			}
			else {
				this.right.add(newValue);
			}
		} 
		else {
			if(this.left == null) {
				this.left = new IntegerTreeNode(newValue);
			}
			else {
				this.left.add(newValue);
			}
		}
	}
	
	// contains method
	public boolean contains(int input) {
		if (input == this.value) {
			return true;
		}
		else if(input > this.value) {
			if(this.right == null) {
				return false;
			}
			else {
				return this.right.contains(input);
			}		
		}
		else {
			if(this.left == null) {
				return false;
			}
			else {
				return this.left.contains(input);
			}
		}
	}
	
	//getMax and getMin methods
	
	public int getMax() {
		if (this.right == null) {
			return this.value;
		}
		else {
			return this.right.getMax();
		}
	}
	
	public int getMin() {
		if (this.left == null) {
			return this.value;
		}
		else {
			return this.left.getMin();
		}
	}
}