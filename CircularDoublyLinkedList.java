public class CircularDoublyLinkedList {
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data= data;
            this.next= null;
            this.prev=null;
        }

    }
    public static Node head;

    public void add_first(int data){
        Node newNode= new Node(data);
        if(head==null){
            head= newNode;
            newNode.next=head;
            newNode.prev=head;
        }
        else{
            Node temp= head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
            newNode.next=head;
            head.prev= newNode;
            head=newNode;
        }
    }
    public void add_last(int data){
        Node newNode= new Node(data);
        if(head==null){
            head= newNode;
            newNode.next=head;
            newNode.prev=head;
        }
        else{
            Node temp= head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
            newNode.next=head;
            head.prev= newNode;
            // newNode= head;
        }
    }
    void print(){
        Node temp= head;
        if(temp==null){
            System.out.print("List is Empty");
        }
        else{
            do{
                System.out.print(temp.data+" ");
                temp=temp.next;
            }while(temp!=head); 
            
        }
    }
    public static void main(String[] args){
        CircularDoublyLinkedList cdll= new CircularDoublyLinkedList();
        cdll.add_first(10);
        cdll.add_first(30);
        cdll.add_first(50);
        cdll.add_last(20);
        cdll.print();
    }
}
