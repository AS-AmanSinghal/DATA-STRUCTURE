/* write a program to implement list using array to perform insert delete search sort and to display list*/

package LIST_USING_ARRAY;

import java.util.Scanner;

public class LIST_MAIN
{
    //mylist to store elements;
    private int[] mylist;

    //index position to insert and delete
    private int last;

    //create parametizied constructor

    public LIST_MAIN(int[] mylist, int last)
    {
        this.mylist = mylist;
        this.last = last;
    }
    public void insert(int element)
    {
        if(last<mylist.length-1)
        {
            last++;
            mylist[last]=element;
        }
        else
        {
            System.out.println("LIST IS FULL ");
        }
    }
    public void delete()
    {
        if(last>=0)
        {
            mylist[last]=0;
            last--;
        }
    }
    // searching first occurence of given element
    public boolean search(int element)
    {
        boolean response=false;
        for(int i=0;i<last;i++)
        {
            if(mylist[i]==element)
            {
                response=true;
                break;
            }
        }
        return response;
    }

    public void sort()
    {
        for(int i=0;i<last;i++)
        {
            for(int j=0;j<last-1;j++)
            {
                if(mylist[j]>mylist[j+1])
                {
                    int temp=mylist[j];
                    mylist[j]=mylist[j+1];
                    mylist[j+1]=temp;
                }
            }
        }
    }

    public void display()
    {
        System.out.println("MY LIST ELEMENTS ARE:- ");
        for(int i=0;i<=last;i++)
        {
            System.out.print(mylist[i]+",\t");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int size=5;
        int [] mylist1 = new int[size];
        int last=-1;
        LIST_MAIN obj=new LIST_MAIN(mylist1,last);
        obj.display();
        obj.insert(250);
        obj.insert(300);
        obj.display();
    }
}
