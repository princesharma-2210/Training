class CircularLinkedList{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next= null;
        }
    }
    public static Node head;
    void add_front(int data){
        Node newNode= new Node(data);
        if(head==null){
            head= newNode;
            newNode.next=head;
        }
        else{
            Node temp= head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next= newNode;
            newNode.next=head;
                head= newNode;
            }
        }
        void print(){
            
                if (head == null) {
                    System.out.println("List is empty");
                    return;
                }
                Node temp = head;
                do {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                } while (temp != head);
                System.out.println();
            }
            
    public static void main(String[] args){
        CircularLinkedList cll= new CircularLinkedList();
        cll.add_front(10);
        cll.add_front(30);
        cll.add_front(50);
        cll.print();
    }
}