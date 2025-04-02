 class DoublyLinkedList {
    class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data= data;
            this.prev=null;
            this.next=null;
        }
    }
    public static Node head;
    void addCoachAtStart(int data){
        Node newNode= new Node(data);
        Node temp= head;
        if(head==null){
            head= newNode;
        }
        else{
            // head.prev=newNode;
            // head= head.prev;
            newNode.next= head;
            head= newNode;
        }

    }
    void pushBackCoach(int data){
        Node newNode= new Node(data);
        // Node temp=head;
        if(head== null){
            head= newNode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;

        }
    }
    void print(){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list1= new DoublyLinkedList();
        list1.addCoachAtStart(10);
        list1.addCoachAtStart(20);
        list1.addCoachAtStart(30);
        list1.addCoachAtStart(40);
        list1.pushBackCoach(5);
        list1.print();

    }
}
 