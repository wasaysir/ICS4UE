
public class TestBinaryTree {
	
	public static void main(String[] args) {
		
		MyBinaryTree TestTree = new MyBinaryTree();
		
		StudentInfo someStudent;
		
		//Adds 10 students to TestTree
		someStudent = (new StudentInfo(5, "Abraham", "Lincoln"));
		TestTree.addToTree(TestTree.root, someStudent);
		
		someStudent = (new StudentInfo(8, "Donald", "Trump"));
		TestTree.addToTree(TestTree.root, someStudent);

		someStudent = (new StudentInfo(3, "George", "Washington"));
		TestTree.addToTree(TestTree.root, someStudent);

		someStudent = (new StudentInfo(4, "Harry", "Truman"));
		TestTree.addToTree(TestTree.root, someStudent);

		someStudent = (new StudentInfo(2, "Richard", "Nixon"));
		TestTree.addToTree(TestTree.root, someStudent);

		someStudent = (new StudentInfo(1, "Barack", "Obama"));
		TestTree.addToTree(TestTree.root, someStudent);

		someStudent = (new StudentInfo(9, "Joseph", "Biden"));
		TestTree.addToTree(TestTree.root, someStudent);

		someStudent = (new StudentInfo(6, "Ronald", "Reagan"));
		TestTree.addToTree(TestTree.root, someStudent);

		someStudent = (new StudentInfo(7, "George", "Bush"));
		TestTree.addToTree(TestTree.root, someStudent);

		someStudent = (new StudentInfo(0, "Bill", "Clinton"));
		TestTree.addToTree(TestTree.root, someStudent);
		
		//Prints PreOrder
		System.out.println("Printing Tree via Preorder traversal");
		TestTree.preorder(TestTree.root);
		
		//Prints InOrder
		System.out.println("Printing Tree via Inorder traversal");
		TestTree.inorder(TestTree.root);
		
		//Prints PostOrder
		System.out.println("Printing Tree via PostOrder traversal");
		TestTree.postorder(TestTree.root);

		/*
		//Balances Tree
		TestTree.balance(TestTree);
		
		//Prints Preorder and then Inorder to ensure they are the same.
		System.out.println("Printing Tree via Preorder traversal");
		TestTree.preorder(TestTree.root);
		
		System.out.println("Printing Tree via Inorder traversal");
		TestTree.inorder(TestTree.root);
		*/
		
	}
	
}
