package linkedList;

public class FindLoop {
	
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
	    head=new_node;
	}
	
	public void findLoop(){
		
		Node slow_pointer =head;
		Node fast_pointer = head;
		
		while(slow_pointer!=null && fast_pointer!=null && fast_pointer.next!=null){
			
			fast_pointer=fast_pointer.next.next;
			slow_pointer=slow_pointer.next;
			if(slow_pointer==fast_pointer){
				System.out.println("foundLoop");
				return;
			}
		}
	}
	
	public static void main(String[] args) {
		
		FindLoop middle = new FindLoop();

		middle.add(1);
		middle.add(2);
		middle.add(3);
		middle.add(1);
		middle.add(2);
		middle.add(3);
		
		middle.head.next.next.next.next.next.next = middle.head;
		middle.findLoop();
}
	
}
