#include <iostream>
using namespace std;

struct Node{
    int data;
    Node* next;
};
class linkedlist{
    Node* head;
    public:

    linkedlist(): head(NULL) {}

    void push_back(int newElement){
        Node* newNode = new Node();
        newNode->data= newElement;
        newNode->next=NULL;
        if(head==NULL){
            head= newNode;
        }
        else{
            Node* temp=head;
            while(temp->next!=NULL){
                temp= temp->next;
            }
            temp->next= newNode;
        }
        
    }
    void display() {
        if (!head) {
            cout << "List is empty." << endl;
            return;
        }

        Node* temp = head;
        while (temp) {
            cout << temp->data << " -> "; 
            temp = temp->next;
        }
    }
    int main() {
        linkedlist list1;
        list1.push_back(10);
        list1.push_back(20);
        list1.push_back(30);
        
        list1.display();
        return 0;
    }
    
};