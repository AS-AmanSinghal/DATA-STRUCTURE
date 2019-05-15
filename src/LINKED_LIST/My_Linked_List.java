package LINKED_LIST;
class Node
{
    int data;
    Node next;
}

public class My_Linked_List
{
    Node head;
    int size;

    //inserting a new node at the end
    void insert(Node newNode)
    {
        System.out.println("INSERT NEW NODE "+newNode.data);
        if (head==null)
        {
            head=newNode;
        }
        else
        {
            Node temp=head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=newNode;
        }
    }
    //
//    //function to display linklist
    void display()
    {
        System.out.println("MY LINKLIST:- ");
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"---> ");
            temp=temp.next;
        }
        System.out.println("null");
    }

    void insertAtBeginning(Node newNode)
    {
        System.out.println("INSERTING NEW NODE AT BEGINNING "+newNode.data);
        newNode.next=head;
        head=newNode;
    }

    //deleting a at the end of the node

    void delete()
    {
        if(head==null)
        {
            System.out.println("EMPTY LIST");
        }
        else
        {
            Node current=head;
            Node previous=null;
            while(current.next!=null)
            {
                previous=current;
                current=current.next;
            }
            System.out.println("DELETING LAST NODE "+current.data);
            previous.next=null;
        }
    }

    //deleting from beginning

    void deleteFromBegining()
    {
        if(head!=null)
        {
            System.out.println("DELETING AT THE BEGINNING "+head.data);
            head=head.next;
        }
    }
    public static void main(String[] args) {
        My_Linked_List linklist=new My_Linked_List();
        Node newnode=new Node();
        newnode.data=10;
        newnode.next=null;

        Node n1=new Node();
        n1.data=454;
        n1.next=null;

        Node n2=new Node();
        n2.data=345;
        n2.next=null;

        Node n3=new Node();
        n3.data=987;
        n3.next=null;

        linklist.insert(newnode);
        linklist.insert(n1);
        linklist.insert(n2);
        linklist.insert(n3);
        linklist.display();

        Node n4=new Node();
        n4.data=98765;
        n4.next=null;
        linklist.insertAtBeginning(n4);
        linklist.display();

        linklist.delete();
        linklist.display();

        linklist.deleteFromBegining();
        linklist.display();
    }
}
