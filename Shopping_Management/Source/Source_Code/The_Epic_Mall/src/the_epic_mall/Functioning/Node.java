
package the_epic_mall.Functioning;

class Node							//class Node
{
public double secret;
Property PropertyCode;
public Node leftChild;         	  // this node's left child
public Node rightChild;       	 // this node's right child

public void displayNode()      // display node
   {
   System.out.print("{");
   System.out.print(secret+", ");
   System.out.println("}\n");
   }
}  // end class Node