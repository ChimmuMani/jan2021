import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class DynastyProblem {

	static class Node {
	int data;
	Node left, right;
	Node(int data)
	{
	this.data = data;
	this.left = null;
	this.right = null;
	}
	
	}

	Node root;
	public static void main(String[] args) {
		 DynastyProblem dp = new DynastyProblem();
	    int arr[] = { 1, 2, 3, 4, 5, 6 };
	    int target=5;
	    
	   dp.root = dp.insertLevelOrder(arr, dp.root, 0);
	    Set<Integer> sets=dp.levelOrderBottom(dp.root,target);
	   sets.remove(target);
	   System.out.println(sets);

	}
	public static Node insertLevelOrder(int[] arr, Node root,
            int i)
{
if (i < arr.length) {
Node temp = new Node(arr[i]);
root = temp;
root.left = insertLevelOrder(arr, root.left,
2 * i + 1);
root.right = insertLevelOrder(arr, root.right,
2 * i + 2);
}
return root;
}
	
	
	public Set<Integer> levelOrderBottom(Node root,int target) {
	    if(root == null) {return null; }
	    Queue<Node> q = new LinkedList<>();
	    q.offer(root);
	    while(!q.isEmpty()){
	        int qsize = q.size();
	        Set<Integer> temp = new HashSet<>();
	        for(int i=0; i<qsize; i++){
	            Node child = q.poll();
	            temp.add(child.data);
	            if(child.left != null){
	                q.offer(child.left);
	            }
	            if(child.right != null){
	                q.offer(child.right);
	            }
	        }
	        if(temp.contains(target))
	            return temp;
	    }
	    return null;
	}

}
