//package my.learning.linkedlist;
//
//public class LinkedList {
//
//  Node head;
//
//  class Node {
//    Integer data;
//    Node next;
//    public Integer getData() {
//      return data;
//    }
//    public void setData(Integer data) {
//      this.data = data;
//    }
//    public Node getNext() {
//      return next;
//    }
//    public void setNext(Node next) {
//      this.next = next;
//    }
//    public Node(Integer data , Node next) {
//      this.data = data;
//      this.next = next;
//    }
//  }
//
//  public void printList() {
//    Node curr = head;
//    while (curr != null) {
//      System.out.println(curr.data);
//      curr = curr.next;
//    }
//
//  }
//
//  public Node insertAtHead(int data) {
//
//        Node node=null;
//        node.next = head;
//        head = node;
//    return head;
//  }
//
//  public Node insertAtTail(int data) {
//    Node node = null;
//    if (head == null) {
//      head = new Node();
//      return head;
//    }
//    Node curr = head;
//    while (curr.next != null) {
//      curr = curr.next;
//    }
//    curr.next = node;
//    return head;
//
//  }
//
//  public int getLength() {
//    int length = 0;
//    Node curr = head;
//    if (curr == null) {
//      return 0;
//    }
//    while (curr != null) {
//      curr = curr.next;
//      length++;
//    }
//
//    return length;
//
//  }
//
//  public Node insertSpecificPostion(int data, int position) {
//    Node node = new Node();
//    int length = getLength();
//    if (position <= length) {
//      if (position == 0) {
//        node.next = head;
//        head = node;
//        return head;
//      }
//      Node curr = head;
//      int curposi = 0;
//      while (curposi != position - 2) {
//        curr = curr.next;
//        curposi++;
//      }
//      node.next = curr.next;
//      curr.next = node;
//
//    }
//    return head;
//  }
//
//  public Node insertAfterPostion(int data, int position) {
//    Node node = new Node();
//    int length = getLength();
//    if (position <= length) {
//      if (position == 0) {
//        node.next = head;
//        head = node;
//        return head;
//      }
//      Node curr = head;
//      int curposi = 0;
//      while (curposi != position - 1) {
//        curr = curr.next;
//        curposi++;
//      }
//      node.next = curr.next;
//      curr.next = node;
//
//    }
//    return head;
//  }
//
//  public Node deleteAfterPostion(int position) {
//    int length = getLength();
//    if (position <= length) {
//      if (position == 0) {
//        head.next = head;
//        return head;
//      }
//      Node curr = head;
//      int curposi = 0;
//      while (curposi != position - 1) {
//        curr = curr.next;
//        curposi++;
//      }
//      curr.next = curr.next.next;
//    }
//    return head;
//  }
//
//  public Node deleteSpecficPostion(int position) {
//    int length = getLength();
//    if (position <= length) {
//      if (position == 0) {
//        head.next = head;
//        return head;
//      }
//      Node curr = head;
//      int curposi = 0;
//      while (curposi != position - 2) {
//        curr = curr.next;
//        curposi++;
//      }
//      curr.next = curr.next.next;
//    }
//    return head;
//  }
//
//  public void printReverse(Node head) {
//    if (head.next != null)
//      printReverse(head.next);
//    System.out.println(head.data);
//  }
//
//  Node reverse() {
//    Node prev = null;
//    Node current = head;
//    // Node next = null;
//    while (current != null) {
//      Node next = current.next;
//      current.next = prev;
//      prev = current;
//      current = next;
//    }
//    head = prev;
//    return head;
//  }
//
//  public Node getNodeValue(int pos) {
//    
//    Node p1 = head;
//    
//    Node p2 = head;
//    
//    while (pos > 0) {
//      p2 = p2.next;
//      pos--;
//    }
//    while (p2 != null) {
//      p1 = p1.next;
//      p2 = p2.next;
//    }
//   p1=p1.next;
//
//    return head;
//    
//  }
//
//  public static void main(String[] args) {
//
//    LinkedList ll = new LinkedList();
//    //ll.insertAtHead(10);
//    //ll.insertAtHead(11);
//    ll.insertAtTail(1);
//    ll.insertAtTail(2);
//    ll.insertAtTail(3);
//    ll.insertAtTail(4);
//    ll.insertAtTail(5);
////    ll.insertSpecificPostion(15, 2);
////    ll.insertAfterPostion(4, 3);
//    ll.printList();
//    // System.out.println("before===>");
//    // ll.printList();
//    // ll.deleteSpecficPostion(2);
//    // Node head = ll.deleteAfterPostion(3);
//    // System.out.println("after===>");
//    // ll.printList();
//    // ll.printReverse(head);
//    // ll.reverse();
//   System.out.println(ll.getNodeValue(3)); ;
//    ll.printList();
//
//  }
//
//}
