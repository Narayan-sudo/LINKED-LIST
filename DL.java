public class DL {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public static void addFirst(int data) {
        size++;
        Node temp = new Node(data);
        if(head==null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head.prev = temp;
            head = temp;

        }
     
    }
    public static void addLast(int data) {
        size++;
        Node temp = new Node(data);
        if(head==null) {
            head=tail=temp;
            return;
        } else {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }

    public static void addMiddle(int data, int i) {
        size++;
        Node temp = new Node(data);
        if(head == null) {
            head = tail = temp;
            return;
        } else {
            Node x = head;
            int y = 0;
            while(y != i-1) {
                x = x.next;
                y++;
            }
            temp.next = x.next;
            temp.prev = x;
            x.next.prev = temp;
            x.next = temp;
        }
    }
    public static void printListForward() {
        if(head==null) {
            System.out.println("your list is empty....");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+ " " + ">/<"+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void printListBackward() {
        if(head==null) {
            System.out.println("your list is empty....");
            return;
        }
        Node temp = tail;
        while(temp != null) {
            System.out.print(temp.data+ " " + ">/<"+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void main(String args[]) {
        DL list = new DL();
        list.addFirst(67);
        list.addFirst(90);
        list.addFirst(57);
        list.addFirst(47);
        list.addFirst(60);
        list.addLast(101);
        list.addMiddle(564,2);
        list.printListForward();
        list.printListBackward();
        System.out.println("the size of your list is : "+list.size);

    }
    
}
