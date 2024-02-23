package _05_Intro_to_AVL_Trees;

import _03_Intro_to_Binary_Trees.BinaryTree;

public class AVLTreeDemo {

    /*
     * An AVLTree is a special BinaryTree that is capable of balancing itself.
     * With a regular binary tree, depending on the elements inserted, you might
     * have a root with one very long right branch and one very long left branch
     * with nothing else in between.
     * 
     * 1.) Read through the AVLNode and AVLTree. Notice that the methods are
     * similar to those in BinaryTree with two important distinctions:
     * 
     * a) Each Node has a balance factor that keeps track of how many levels
     * "down" it is relative to the rest of the tree.
     * 
     * b) There are "rotate" helper methods used when a given node gets too
     * unbalanced(> 1 level out of sync with the rest of the tree) to rotate
     * branches back into place.
     * 
     * 2.) Create a BinaryTree and an AVLTree.
     * 
     * 3.) Insert the same values into both trees and observe how they differ
     * using the print method. Make sure the values you pick unbalance the
     * binary tree.
     * 
     * 4.) Try removing elements from both and see how they change using one of
     * the print methods.
     */

    public static void main(String[] args) {
    	BinaryTree<Integer> bTree = new BinaryTree<>();
    	AVLTree<Integer> avTree = new AVLTree<>();
    	bTree.insert(50);
    	bTree.insert(100);
    	bTree.insert(75);
    	bTree.insert(150);
    	bTree.insert(125);
    	bTree.insert(175);
    	bTree.insert(180);
    	bTree.insert(170);
    	bTree.printVertical();
    	avTree.insert(50);
    	avTree.insert(100);
    	avTree.insert(75);
    	avTree.insert(150);
    	avTree.insert(125);
    	avTree.insert(175);
    	avTree.insert(180);
    	avTree.insert(170);
    	//avTree.getRoot().setRight(avTree.getRoot().getRight());
    	avTree.printVertical();
    }

}
