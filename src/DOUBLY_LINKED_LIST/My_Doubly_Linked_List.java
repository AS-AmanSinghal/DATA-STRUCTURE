package DOUBLY_LINKED_LIST;

class Node
{
    int data;
    Node next;
    Node previous;
}

public class My_Doubly_Linked_List {
    private Node head;
    //int size;//optional
    //insert at last
    private void insert(Node node){
        if(isEmpty()){
            head=node;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            node.previous=temp;
            temp.next=node;
        }
    }

    private boolean isEmpty() {
        boolean response=false;
        if(head==null){
            response=true;
        }
        return response;
    }

    private void display(){
        System.out.println("Doubly linkedlist");
        Node temp=head;
        System.out.print("null<--->");
        while(temp!=null) {
            System.out.print(temp.data+"<--->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    private void delete(){
        if(!isEmpty()) {


            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp=temp.previous;
            temp.next=null;
        }

    }
    //first occurence
    private boolean search(Node node){
        boolean response=false;
        if(!isEmpty()){
            Node temp=head;
            while(temp!=null){
                if(temp.data==node.data){
                    response=true;
                    break;
                }
                temp=temp.next;
            }

        }
        return response;
    }

    public static void main(String[] args) {
        Node n1=new Node();
        n1.data=1000;
        n1.next=new Node();
        n1.next.data=500;
        n1.next.previous=n1;
        My_Doubly_Linked_List obj=new My_Doubly_Linked_List();
        obj.insert(n1);

        obj.display();
        obj.delete();
        obj.display();

    }

}
