package linkedList;

public class ReverseLinkedList {
	
	static Node head;
	
	static class Node{
	int data;
	Node next = null;
	
	Node(int d){
		
		data =d;
		next=null;
	}
		
		
	}
	
	public void push(int new_data){
		
		Node new_node = new Node(new_data);	
		new_node.next = head;
		head = new_node;
	}
	public void printList(){
		Node printNode = head;
		
		while(printNode!=null){
			System.out.print(printNode.data + " ");
			printNode = printNode.next;
			
		}
		
		
	}
	
	public void append(int new_data){
		Node new_node = new Node(new_data);		
		if(head==null){
			head = new Node(new_data);
			return;
		}
		new_node.next=null;
		
		Node last = head;
		
		while(last.next!=null){
			
			last=last.next;
		}
		last.next =new_node;			
	}
	
 Node reverseList(){
	 Node prev = null;
		Node current = head;
		Node next = null;
			
		
		while(current!=null){
			next=current.next;
			current.next = prev;
			prev =current;
			current=next;
		}
		return prev;
		
	}

	
	public static void main(String[] args) {
		ReverseLinkedList linkedList = new ReverseLinkedList();
		linkedList.push(10);
		linkedList.push(9);
		linkedList.push(8);
		linkedList.append(7);
		linkedList.append(6);
		System.out.println("before reverse");
		linkedList.printList();
		head =linkedList.reverseList();
		System.out.println("\nAfter reverse");
		linkedList.printList();
	}
	
}
