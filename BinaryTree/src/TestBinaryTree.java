
public class TestBinaryTree {
	
	public static void main(String[] args) {
		
		MyBinaryTree TestTree = new MyBinaryTree();
		
		StudentInfo someStudent;
		
		
		someStudent = (new StudentInfo(5, "Abraham", "Lincoln"));
		TestTree.addToTree(TestTree.root, someStudent);
		
		someStudent = (new StudentInfo(8, "Abraham", "Lincoln"));
		TestTree.addToTree(TestTree.root, someStudent);

		someStudent = (new StudentInfo(3, "Abraham", "Lincoln"));
		TestTree.addToTree(TestTree.root, someStudent);

		someStudent = (new StudentInfo(4, "Abraham", "Lincoln"));
		TestTree.addToTree(TestTree.root, someStudent);

		someStudent = (new StudentInfo(2, "Abraham", "Lincoln"));
		TestTree.addToTree(TestTree.root, someStudent);

		someStudent = (new StudentInfo(1, "Abraham", "Lincoln"));
		TestTree.addToTree(TestTree.root, someStudent);

		someStudent = (new StudentInfo(9, "Abraham", "Lincoln"));
		TestTree.addToTree(TestTree.root, someStudent);

		someStudent = (new StudentInfo(6, "Abraham", "Lincoln"));
		TestTree.addToTree(TestTree.root, someStudent);

		someStudent = (new StudentInfo(7, "Abraham", "Lincoln"));
		TestTree.addToTree(TestTree.root, someStudent);

		someStudent = (new StudentInfo(0, "Abraham", "Lincoln"));
		TestTree.addToTree(TestTree.root, someStudent);
		
		
		
		TestTree.preorder(TestTree.root);
		System.out.println("Done");
		
		TestTree.inorder(TestTree.root);
		System.out.println("Done");
		
		TestTree.postorder(TestTree.root);
		System.out.println("Done");

		TestTree.balance(TestTree);
		TestTree.preorder(TestTree.root);
		
	}
	
}
