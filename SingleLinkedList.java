class SingleLinkedList{
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next= null;
        }
    }
    public static Node head;

    void addfirst(int data){
        // Node temp= head;
        Node newNode= new Node(data);
        if(head==null){
            head= newNode;
        }
        else{
            newNode.next= head;
            head= newNode;
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
    public static void main(String[] args){
        System.out.println("Single Linked List");
        SingleLinkedList list1= new SingleLinkedList();
        list1.addfirst(10);
        list1.addfirst(23);
        list1.print();


    }

}