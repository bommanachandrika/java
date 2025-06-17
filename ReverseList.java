class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}
public class ReverseList
{
    public static Node reverse(Node head)
    {
        Node prev=null;
        while(head!=null)
        {
            Node next=head.next;
            head.next=prev;
            prev=head;
            head=next;

        }
        return prev;
    }
    public static void print(Node head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
    System.out.println();
    }
    public static void main(String args[])
    {
        Node head=new Node(1);
        head.next=new Node(2);
        head.next.next=new Node(3);
        
        print(head);
        head=reverse(head);
        System.out.println("print the reverse list:");
        print(head);

    }
}