import datastructure.*;

public class Test {
  public static void main(String[] args) {
    BinarySearchTree<Integer> int_bst = new BinarySearchTree<>();

    int_bst.Insert(10);
    int_bst.Insert(5);
    int_bst.Insert(15);
    int_bst.Insert(7);

    int_bst.InOrderTraversal();

    int_bst.Delete(10);
    int_bst.Insert(4);
    int_bst.Insert(12);
    int_bst.Insert(20);

    int_bst.InOrderTraversal();

    int_bst.Delete(7);
    int_bst.InOrderTraversal();

    int_bst.Delete(4);
    int_bst.InOrderTraversal();
  }
}