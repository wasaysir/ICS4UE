import java.util.ArrayList;

public class MyBinaryTree {
	
	public StudentInfo root;
	public int numInTree;
	
	public MyBinaryTree(){ //Initializes empty Binary Tree
		root = null;
		numInTree = 0;
	}
	
	public MyBinaryTree(StudentInfo rootStudent){ //Initializes Binary Tree with root
		root = rootStudent;
		numInTree = 1;
	}
	
	public void addToTree(StudentInfo currentRoot, StudentInfo itemToAdd) {
		if(numInTree == 0) { //Sets the root node for the tree
			root = itemToAdd;
			numInTree++;
		} else if(currentRoot == null) { //Sets node in this location if its null
			currentRoot = itemToAdd;
			numInTree++;
			return;
		} else if(currentRoot.studentNumber > itemToAdd.studentNumber) {
			if(currentRoot.left == null) { //Sets node on left side if less than current root and left child is empty
				currentRoot.left = itemToAdd; 
				numInTree++;
				return;
			}
			else{
				addToTree(currentRoot.left, itemToAdd); //If left child is not empty, recursively calls to itself
			}
		} else if(currentRoot.studentNumber < itemToAdd.studentNumber) {
			if(currentRoot.right == null) { //Sets node on right side if greater than current root and right child is empty
				currentRoot.right = itemToAdd;
				numInTree++;
				return;
			}
			else{
				addToTree(currentRoot.right, itemToAdd); //If right child is not empty, recursively calls to itself
			}
		}
	}
	
	public void preorder(StudentInfo currentRoot) {
		if(numInTree == 0) { //Edge case of no nodes in tree
			System.out.println("No items in the tree to traverse");
		}
		if(currentRoot == null) { //Returns when node is empty to avoid NPE
			return;
		}
		
		//Prints current node then checks left subtree then checks right subtree
		processNode(currentRoot);
		preorder(currentRoot.left);
		preorder(currentRoot.right);
	}
	
	public void inorder(StudentInfo currentRoot) {
		if(numInTree == 0) { //Edge case of no nodes in tree
			System.out.println("No items in the tree to traverse");
		}
		if(currentRoot == null) { //Returns when node is empty to avoid NPE
			return;
		}
		
		//Checks left subtree then prints current node then checks right subtree
		//Prints nodes in order
		inorder(currentRoot.left);
		processNode(currentRoot);
		inorder(currentRoot.right);
	}

	public void postorder(StudentInfo currentRoot) {
		if(numInTree == 0) { //Edge case of no nodes in tree
			System.out.println("No items in the tree to traverse");
		}
		if(currentRoot == null) { //Returns when node is empty to avoid NPE
			return;
		}
		
		//Checks left subtree then checks right subtree then prints current node
		postorder(currentRoot.left);
		postorder(currentRoot.right);
		processNode(currentRoot);
	}
	
	public void processNode(StudentInfo currentRoot) {
		System.out.println(currentRoot.studentNumber + ","); //Abstracted code to process node
	}
	
	public ArrayList<StudentInfo> arrayInOrder(StudentInfo currentRoot){
		//Creates an ArrayList of elements in binary tree in order
		
		if(numInTree == 0) { //Edge case of no nodes in binary tree
			System.out.println("No items in the tree to traverse");
		}
		
		ArrayList<StudentInfo> returnArray = new ArrayList<StudentInfo>(); //Initializes Array
		
		if(currentRoot.left != null) { //If left child of current node is not empty, it calls arrayInOrder to left child and adds elements to returnArray.
			returnArray.addAll(arrayInOrder(currentRoot.left));
		}  
		
		returnArray.add(currentRoot); //Adds current root to returnArray
		
		if(currentRoot.right != null) { //If right child of current node is not empty, it calls arrayInOrder to right child and adds elements to returnArray.
			returnArray.addAll(arrayInOrder(currentRoot.right));
		}
		
		return returnArray;
		
	}
	
	public MyBinaryTree balance(MyBinaryTree currentTree) {
		//Main method to balance a binary tree to become a complete tree
		
		ArrayList<StudentInfo> ListOfNodes = arrayInOrder(currentTree.root); //Creates inOrder array of nodes in tree
		MyBinaryTree balancedTree = new MyBinaryTree();
		balancedTree.balanceSteps(balancedTree, ListOfNodes, 0, currentTree.numInTree - 1); //Calls on a recursive function to balance the tree
		
		return balancedTree;
	}
	
	public void balanceSteps(MyBinaryTree tree, ArrayList<StudentInfo> array, int start, int end){
		int size = end - start + 1; //Determines size of scope 
		if (size <= 0) { //Prevents ArrayIndexOutOfBoundsError
			return;
		}
		int middle = size / 2 + start;
		array.get(middle);
		tree.addToTree(tree.root, array.get(middle)); //Adds middle value and puts it at beginning of the tree
		tree.balanceSteps(tree, array, start, middle - 1); //Calls on balancing values < middle
		tree.balanceSteps(tree, array, middle + 1, end); //Calls on balancing values > middle
	}
}
