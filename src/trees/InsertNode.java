package trees;

import java.util.LinkedList;
import java.util.Queue;

class Inode{
	int data;
	Inode left,right;
	public Inode(int value){
		data= value;
		left=right=null;
	}
	
}
public class InsertNode {

	Inode root;
	
	//recur
	public void insert(Inode node,int data){
		if(node == null){
		node = new Inode(data);}
		else{
			insertHelp(node,data);
		}
		
	}

	private void insertHelp(Inode node, int data) {
		
		if(node.left==null){
			node.left = new Inode(data);
			
		}else{
			insertHelp(node.left,data);
	}
		if(node.right==null){
			node.right = new Inode(data);
		}else 
			insertHelp(node.right,data);
	
	}
	
	//itera
	
	public Inode insertNode(Inode node,int data){
		
		if(node==null)
			return node;
		
		Queue<Inode> q = new LinkedList<>();
		q.add(node);
		while(!q.isEmpty()){
			Inode temp =q.poll();
			if(temp!=null){
				if(temp.left!=null){
					q.add(temp.left);}
				else{
					temp.left = new Inode(data);
					return node;
				}
				if(temp.right!=null){
					q.add(temp.right);
					}
				else{
					temp.right = new Inode(data);
					return node;
				}
			}
			
			
		}
		return node;
			
		
	}
}
