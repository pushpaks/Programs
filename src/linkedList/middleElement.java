package linkedList;

public class middleElement {

	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data =d;
			next = null;		
		}
		
	}
	
	public void add(int d){
		Node new_node = new Node(d);
	
		new_node.next=head;
		head = new_node;
		
	}
	
public void getMiddleElement(){
	
	Node twoPointer =head;
	Node onePointer = head;
	
	while(twoPointer!=null && twoPointer.next!=null){
		
		twoPointer=twoPointer.next.next;
		onePointer=onePointer.next;
	}
	System.out.println("Middle element"+onePointer.data);
	
}

public static void main(String[] args) {
	
middleElement middle = new middleElement();

middle.add(1);
middle.add(2);
middle.add(3);

middle.getMiddleElement();
}

	
}
