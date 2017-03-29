
package the_epic_mall.Functioning;

public class Tree
{
static Node root;             // first node of tree


public Tree()                  // constructor
   { root = null; }            // no nodes in tree yet


public void insert(double cd,Property pd)		//insertion method
   {
   Node newNode = new Node();    // make new node
   newNode.secret = cd;           // insert codeword
   newNode.PropertyCode=pd;			//insert property code
   if(root==null)  
   {              // no node in root
      root = newNode;
  }
   else                          // root occupied
      {
      Node current = root;       // start at root
      Node parent;
      while(true)                // (exits internally)
         {
         parent = current;
         if(cd < current.secret)  // go left?
            {
            current = current.leftChild;
            if(current == null)  // if end of the line,
               {                 // insert on left
               parent.leftChild = newNode;
               return;
               }
            }  // end if go left
         else                    // or go right?
            {
            current = current.rightChild;
            if(current == null)  // if end of the line
               {                 // insert on right
               parent.rightChild = newNode;
               return;
               }
            }  // end else go right
         }  // end while
      } //end else root not null
   }  // end insert()
}
/*public Node find(double cd)      // find node with given key
   {                           // (assumes non-empty tree)
	   Node current = root;               // start at root
	   while(current.secret != cd)        // while no match,
	      {
		      if(cd < current.secret)         // go left?
		         current = current.leftChild;
		      else                            // or go right?
		         current = current.rightChild;
		      if(current == null)             // if no child,
		         return null;                 // didn't find it
	      }
	   return current;                    // found it
   }  // end find()

public boolean delete(int key) // delete node with given key
{                           // (assumes non-empty list)
Node current = root;
Node parent = root;
boolean isLeftChild = true;

while(current.secret != key)        // search for node
   {
	   parent = current;
	   if(key < current.secret)         // go left?
	    {
	      isLeftChild = true;
	      current = current.leftChild;
	    }
	   else                            // or go right?
	    {
	      isLeftChild = false;
	      current = current.rightChild;
	    }
	   if(current == null)             // end of the line,
	      return false;                // didn't find it
   }  // end while
// found node to delete Stock
	if(current.PropertyCode.Stock != 0)
		current.PropertyCode.Stock-=1;
	else
	{
		// if no children, simply delete it
		if(current.leftChild==null &&
		                             current.rightChild==null)
		   {
		   if(current == root)             // if root,
		      root = null;                 // tree is empty
		   else if(isLeftChild)
		      parent.leftChild = null;     // disconnect
		   else                            // from parent
		      parent.rightChild = null;
		   }
	
		// if no right child, replace with left subtree
		else if(current.rightChild==null)
		   if(current == root)
		      root = current.leftChild;
		   else if(isLeftChild)
		      parent.leftChild = current.leftChild;
		   else
		      parent.rightChild = current.leftChild;
	
		// if no left child, replace with right subtree
		else if(current.leftChild==null)
		   if(current == root)
		      root = current.rightChild;
		   else if(isLeftChild)
		      parent.leftChild = current.rightChild;
		   else
		      parent.rightChild = current.rightChild;
	
		else  // two children, so replace with inorder successor
		   {
		   // get successor of node to delete (current)
		   Node successor = getSuccessor(current);
	
		   // connect parent of current to successor instead
		   if(current == root)
		      root = successor;
		   else if(isLeftChild)
		      parent.leftChild = successor;
		   else
		      parent.rightChild = successor;
	
		   // connect successor to current's left child
		   successor.leftChild = current.leftChild;
		   }  // end else two children
		// (successor cannot have a left child)
	}//end else stock=0
return true;                                // success
}
//returns node with next-highest value after delNode
//goes to right child, then right child's left descendents
private Node getSuccessor(Node delNode)
{
Node successorParent = delNode;
Node successor = delNode;
Node current = delNode.rightChild;   // go to right child
while(current != null)               // until no more
   {                                 // left children,
   successorParent = successor;
   successor = current;
   current = current.leftChild;      // go to left child
   }
                                     // if successor not
if(successor != delNode.rightChild)  // right child,
   {                                 // make connections
   successorParent.leftChild = successor.rightChild;
   successor.rightChild = delNode.rightChild;
   }
return successor;
}

void preOrder(Node data,double Pd)		//tree traversal
	{
	if(data != null)
	   {
		double matchedData;
		if(data.PropertyCode.var[0] == Pd ||data.PropertyCode.var[1] == Pd ||data.PropertyCode.var[2] == Pd ||data.PropertyCode.var[3] == Pd ||data.PropertyCode.var[4] == Pd
				||data.PropertyCode.var[5] == Pd ||data.PropertyCode.var[6] == Pd ||data.PropertyCode.var[7] == Pd ||data.PropertyCode.var[8] == Pd ||data.PropertyCode.var[9] == Pd
				||data.PropertyCode.var[10] == Pd)
		{
			matchedData=Pd;      //data matched
			System.out.print(data.secret + "\nYes\n");
		}
	   	preOrder(data.leftChild,Pd);
	   	preOrder(data.rightChild,Pd);
	   }
	}
}//end Tree class*/