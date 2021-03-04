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
			if(currentRoot.right == null) {
				currentRoot.right = itemToAdd;
				numInTree++;
				return;
			}
			else{
				addToTree(currentRoot.right, itemToAdd);
			}
		}
	}
	
	public void preorder(StudentInfo currentRoot) {
		if(numInTree == 0) {
			System.out.println("No items in the tree to traverse");
		}
		if(currentRoot == null) {
			return;
		}
		processNode(currentRoot);
		preorder(currentRoot.left);
		preorder(currentRoot.right);
	}
	
	public void inorder(StudentInfo currentRoot) {
		if(numInTree == 0) {
			System.out.println("No items in the tree to traverse");
		}
		if(currentRoot == null) {
			return;
		}
		inorder(currentRoot.left);
		processNode(currentRoot);
		inorder(currentRoot.right);
	}

	public void postorder(StudentInfo currentRoot) {
		if(numInTree == 0) {
			System.out.println("No items in the tree to traverse");
		}
		if(currentRoot == null) {
			return;
		}
		postorder(currentRoot.left);
		postorder(currentRoot.right);
		processNode(currentRoot);
	}
	
	public void processNode(StudentInfo currentRoot) {
		System.out.println(currentRoot.studentNumber + ",");
	}
	
	public ArrayList<StudentInfo> arrayInOrder(StudentInfo currentRoot){
		if(numInTree == 0) {
			System.out.println("No items in the tree to traverse");
		}
		ArrayList<StudentInfo> returnArray = new ArrayList<StudentInfo>();
		
		if(currentRoot.left != null) {
			returnArray.addAll(arrayInOrder(currentRoot.left));
		}  
		
		returnArray.add(currentRoot);
		
		if(currentRoot.right != null) {
			returnArray.addAll(arrayInOrder(currentRoot.right));
		}
		
		return returnArray;
		
	}
	
	public MyBinaryTree balance(MyBinaryTree currentTree) {
		ArrayList<StudentInfo> ListOfNodes = arrayInOrder(currentTree.root);
		MyBinaryTree balancedTree = new MyBinaryTree();
		balancedTree.balanceSteps(balancedTree, ListOfNodes, 0, currentTree.numInTree - 1);
		
		return balancedTree;
	}
	
	public void balanceSteps(MyBinaryTree tree, ArrayList<StudentInfo> array, int start, int end){
		int size = end - start + 1;
		if (size <= 0) {
			return;
		}
		int middle = size / 2 + start;
		array.get(middle);
		tree.addToTree(tree.root, array.get(middle));
		tree.balanceSteps(tree, array, start, middle - 1);
		tree.balanceSteps(tree, array, middle + 1, end);
	}
}
