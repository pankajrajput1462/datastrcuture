package collections.binarytree;

import java.util.Scanner;

/* Class BinaryTree */
public class BinaryTree {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/* Creating object of BT */
		BT bt = new BT();
		/* Perform tree operations */
		System.out.println("Binary Tree Test\n");
		char ch;
		do {
			System.out.println("\nBinary Tree Operations\n");
			System.out.println("1. insert ");
			System.out.println("2. search");
			System.out.println("3. count nodes");
			System.out.println("4. check empty");
			System.out.println("5. hieght");
			System.out.println("6. print level order");

			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter integer element to insert");
				bt.insert(scan.nextInt());
				break;
			case 2:
				System.out.println("Enter integer element to search");
				System.out.println("Search result : " + bt.search(scan.nextInt()));
				break;
			case 3:
				System.out.println("Nodes = " + bt.countNodes());
				break;
			case 4:
				System.out.println("Empty status = " + bt.isEmpty());
				break;
			case 5:
				System.out.println("Height of Tree: "+bt.height());
				break;
			case 6:
				System.out.println("Level Order traversal: "+bt.levelOrderTraversal());
				break;
			default:
				System.out.println("Wrong Entry \n ");
				break;
			}
			/* Display tree */
			
			System.out.print("\nPost order : ");
			bt.postOrder();
			System.out.print("\nPre order : ");
			bt.preorder();
			System.out.print("\nIn order : ");
			bt.inorder();

			System.out.println("\n\nDo you want to continue (Type y or n) \n");
			ch = scan.next().charAt(0);
		} while (ch == 'Y' || ch == 'y');
	}
}