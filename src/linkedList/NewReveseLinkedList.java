package linkedList;
public class NewReveseLinkedList {

	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data =d;
			next = null;
		}
		
	}
		
		public void push(int data){
			
			Node newdata = new Node(data);
			
			newdata.next =head;
			head = newdata;			
			
		}
		
		public Node reverse(){
			Node prev =null;
			Node curr = head;
			Node next = null;
			while(curr!=null){
				next=curr.next;
				curr.next=prev;
				prev=curr;
				curr=next;
			}
			
			return prev;
			
		}
		
		public void printList(){
			Node printNode = head;
			
			while(printNode!=null){
				System.out.print(printNode.data + " ");
				printNode = printNode.next;
				
			}
		}
			
		public static void main(String[] args) {
			NewReveseLinkedList link = new NewReveseLinkedList();
			link.push(9);
			link.push(8);
			link.push(7);
			link.push(6);
			System.out.println("before");
			link.printList();
			head=link.reverse();
			System.out.println("after");
			link.printList();
		}
		
	}
	


