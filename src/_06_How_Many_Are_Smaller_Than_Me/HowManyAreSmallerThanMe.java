package _06_How_Many_Are_Smaller_Than_Me;

import java.util.Iterator;

import _03_Intro_to_Binary_Trees.Node;
import _05_Intro_to_AVL_Trees.AVLNode;
import _05_Intro_to_AVL_Trees.AVLTree;

public class HowManyAreSmallerThanMe {

    /*
     * Given an AVLTree filled with the random numbers from 1 to 20, and a
     * single number within the AVL Tree, figure out how many numbers in the
     * AVLTree are smaller than the provided number and return the result.
     * 
     * You may want to create a helper method to search through the AVLTree and
     * count iteratively or recursively.
     */

    public int howManyAreSmallerThanMe(AVLTree<Integer> avlTree, int me) {
    	AVLNode<Integer> temp = new AVLNode<Integer>(0);
		temp = avlTree.getRoot();
		int counter = 0;
    	//if (me <= avlTree.getRoot().getValue()) {
			//Search left
    		//temp = temp.getLeft();
    		
	//	}
    	//else if (me > avlTree.getRoot().getValue()) {
			//Search right
    		//counter += 1;
    		// Find a way to determine whether or not a value is smaller, if it is, then test both directions to get the values
		//}
    	for (int i = 0; i<me; i++) {
    		if(avlTree.search(i)!=null) {
    			counter+=1;
    		}
			
		}
    	return counter;
    }

}
