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
	
	// toString method 
	
	public String toString() {
		
		String output = "";
		output = output + "[" + this.value;
		
		if (this.left == null) {
			output = output.concat("L []");
			
			
		}else {
			output = output.concat(" L [");
			output = output.concat(this.left.toString() + "]");
			
			
		}
		if (this.right == null) {
				output = output.concat(" R []]");
			
		}else {
			output = output.concat("R [");
			output = output.concat(this.right.toString()+ "]");
		}
		
		return output;
		
	}
	
	public String toStringSimple() {		
		String output = "[" + this.value;
		
		if (this.left != null) {
			output += " [" + this.left.toStringSimple() + "]";
		}
					
		if (this.right != null) {
				output += " [" + this.right.toStringSimple()+ "]";
		}	
		
		if ((this.left == null) && (this.right == null)) {
		output += "]";
		}
		return output;		
	}	
	
	/*public String toStringSimple() {
		
		String output = "";
		output = output + "[" + this.value;
		
		if (this.left != null) {
			output = output.concat(" [");
			output = output.concat(this.left.toStringSimple() + "]");
		}
					
		if (this.right != null) {
				output = output.concat(" [");
				output = output.concat(this.right.toStringSimple()+ "]");
		}	
		
		if ((this.left == null) && (this.right == null)) {
		output = output.concat("]");
		}
		return output;
		
	}*/
	
	public int depth() {
		if ((this.left == null) && (this.right == null)) {
			return 0;
		}
		else 
		{
			int leftDepth = 0;
			int rightDepth = 0;
			if (this.left != null) {
				leftDepth = 1 + this.left.depth();
			}
			
			if (this.right != null) {
				rightDepth = 1 + this.right.depth();
			}
			
			if(leftDepth > rightDepth)
				return leftDepth;
			else
				return rightDepth;
		}
	}
	
	public boolean remove(IntegerTreeNode toBeDeleted) {
			return false;
	}
}