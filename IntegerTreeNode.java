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
		
		return "[" + prettyPrint() + "]";
		
	}
	public String prettyPrint() {
		String output = "";
		output = output + this.value;
		
		if (this.left == null) {
			output = output.concat(" L[]");
			
			
		}else {
			output = output.concat(" L[");
			output = output.concat(this.left.prettyPrint() + "]");
			
			
		}
		if (this.right == null) {
				output = output.concat(" R[]");
			
		}else {
			output = output.concat(" R[");
			output = output.concat(this.right.prettyPrint()+ "]");
		}
		
		return output;
	}
	
	public String toStringSimple() {
		String output = "";
		output = output + this.value;
		
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
	
	
	public int depth() {
		if ((this.left == null) && (this.right == null)) {
			return 0;
		}
		else {
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
	//remove method - second attempt
	
	public boolean remove (int toBeDeleted) {
		// toBeDeleted is the root
			
		int temp;
		if (this.value == toBeDeleted) {
			if (right != null) {
				temp = right.getMin();
				previousNode(getMin()).left = null;
				this.value = temp;
				return true;
			}
			else if (this.left != null) {
				temp = left.getMax();
				previousNode(getMax()).right = null;
				this.value = temp;
				return true;
			}
			else {
				System.out.println("Target int not found");
				return false;
			}
		}
		else {
			if ((toBeDeleted > this.value) && (this.right != null)) {
				right.remove(toBeDeleted);
			}
			else if ((this.left != null)) {
				left.remove(toBeDeleted);
			}
		}
		
		return false;
	}
	
	//find the node before the minimum
	
	public IntegerTreeNode previousNode(int value) {
	
		if (this.right != null && this.left != null) {
			if ((this.right.value == value) || (this.left.value == value)) {
				return this;
			}
			else if (value < this.value) {
				return this.left.previousNode(value);			
			}
			else {
				return this.right.previousNode(value);
			}
		}
		return this;
	}

	//remove method - first attempt
	/*
	public boolean remove(int toBeDeleted) {
		IntegerTreeNode temp;
		if (this.right.value == toBeDeleted) {
			if (this.right.left != null) {
				if(this.right.left.right != null){
					this.right.left.right = this.right.right;
				}
				this.right = this.right.left;
				return true;
			}
			else {
				if (this.right.right.left != null) {
					this.right.right.left = this.right.left;
				}
				this.right = this.right.right;
				return true;
			}
		}
		else if (this.left.value == toBeDeleted) {
			if (this.left.right != null) {
				if (this.left.right.left != null) {
					this.left.right.left = this.left.left;
				}
				this.left = this.left.right;
				return true;
			}
			else {
				if (this.left.left.right != null) {
					this.left.left.right = this.left.right;
				}
				this.left = this.left.left;
				return true;
			}
		}
		else {
			if (toBeDeleted > this.value) {
				return this.right.remove(toBeDeleted);
			}
			else {
				return this.left.remove(toBeDeleted);
			}
		}
	}*/
}