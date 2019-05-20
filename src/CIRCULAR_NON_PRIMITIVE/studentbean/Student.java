package CIRCULAR_NON_PRIMITIVE.studentbean;

import CIRCULAR_NON_PRIMITIVE.linkedlist.MyLinkedListMarks;

public class Student {

    public int rollno;
    public int rank;
    public String name;
    public MyLinkedListMarks markslist;

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", rank=" + rank +
                ", name='" + name + '\'' +
                ", markslist=" + markslist.display() +
                '}';
    }
}
