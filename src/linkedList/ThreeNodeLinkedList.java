package linkedList;

public class ThreeNodeLinkedList {
	
	Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		Node(int d){
			data =d;
			next = null;
			
		}
		
	}
	
	public void printList(){
		 Node n = head;
		 while(n!=null){
			 
			 System.out.println(n.data);
			 n=n.next;
			 
		 }
		
	}
	
	public static void main(String[] args) {
		
		ThreeNodeLinkedList list = new ThreeNodeLinkedList();
		
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		list.head.next = second;
		second.next= third;
		list.printList();
		}

}
