package CIRCULAR_NON_PRIMITIVE.linkedlist;

import CIRCULAR_NON_PRIMITIVE.node.MarksNode;

public class MyLinkedListMarks {
    MarksNode head;
    //insert
    // dusplay
    //gethead


    public MarksNode getHead()
    {

        return head;
    }
    public void insert(MarksNode node){
        if(head==null){
            head=node;
        }
        else{
            MarksNode current=head;

            while(current.next!=null){

                current=current.next;
            }
            current.next=node;
        }
    }

    public String display(){
        String response="";

        MarksNode temp=head;
        while(temp!=null){
            response=response+temp.data+" ";
            temp=temp.next;
        }



        return response;
    }

}
