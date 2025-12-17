//AYUSH NARAYAN OJHA
// CSE'B' 88
public class LinnkedList {
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data=data;
            this.next=null;
        }
    }

    public static void deleteMiddle(int i) {
        if(i==0) {
            deleteFirst();
            
        } else if(i==size) {
            deleteLast();
        } else
         if(head==null) {
            System.out.println("the List is empty");
            return;
        } else if(head.next==null) {
            System.out.println("your data deleted sucessfully :- "+ head.data);
            head=tail=null;
            size--;
            return;
        }
        int idx=0; 
        Node temp=head;
        while(idx<i-1) {
            temp=temp.next;
            idx++;

        }
        System.out.println("your data deleted from the index;");
        temp.next=temp.next.next;

        size--;

    }

    public static void addMiddle(int data,int i) {
       if(i==0) {
        addFirst(data);
        return;
       } else if(i==size) {
        addLast(data);
        return;
       }
       Node newNode = new Node(data);
       Node temp=head;
       int idx=0;
       while(idx<i-1) {
        temp=temp.next;
        idx++;
       }
       newNode.next=temp.next;
       temp.next=newNode;
       size++;
    }

    public static void deleteLast() {
        if(head==null) {
            System.out.println("the List is empty");
            return;
        } else if(head.next==null) {
            System.out.println("your data deleted sucessfully from the last :- "+ head.data);
            head=tail=null;
            size--;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null) {
            temp=temp.next;
            
            }
            System.out.println("the data deleted sucessfully from the last :- "+ tail.data);
            tail=temp;
            temp.next=null;
            size--;
            return;

        }

    
    public static void deleteFirst() {
        if(head==null) {
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        head=temp.next;
        size--;
        System.out.println("the node was deleted from starting, and the value was:- "+  temp.data);
    }
    public static void addFirst(int data) {
        Node newNode=new Node(data);
        if(head==null) {
            head=tail=newNode;
            size++;
            return;
        }
        newNode.next=head;
        head=newNode;
        size++;
    }
    public static void addLast(int data) {
        Node newNode=new Node(data);
        if(head==null) {
            head=newNode;
            size++;
            return;
        }
        tail.next=newNode;
        tail=newNode;
        size++;
    }
    public static void printLL() {
        if(head==null) {
            System.out.println("ll is empty");
        }
        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public static void main(String args[]){
        LinnkedList ll=new LinnkedList();
        ll.addFirst(10);
        ll.addLast(29);
        ll.addLast(30);
        ll.addFirst(11);
        ll.addLast(45);
        ll.addMiddle(234, 3);
        ll.deleteMiddle(2); 
        // ll.deleteLast();
        // ll.deleteFirst();
        ll.printLL();
        System.out.println(ll.size);

    }
    
}
