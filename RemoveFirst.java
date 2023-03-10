package datastructures.LinkedList;

public class LinkedList7 
{
	private Node head;
    private Node tail;
    private int length;
    
    class Node 
    {
        int value;
        Node next;

        Node(int value)
        {
            this.value = value;
        }
    }
    
	public LinkedList7(int value) 
	{
		Node newNode = new Node(value);
		head = newNode;
		tail = newNode;
		length = 1;
	}
	
	public void printList()
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.println(temp.value);
			temp = temp.next;
		}
	}
	
	public void getHead() 
	{
        if (head == null) 
        {
            System.out.println("Head: null");
        } 
        else 
        {
            System.out.println("Head: " + head.value);
        }
    }

    public void getTail() 
    {
        if (head == null) 
        {
            System.out.println("Tail: null");
        } 
        else 
        {
            System.out.println("Tail: " + tail.value);
        }
    }

    public void getLength() 
    {
        System.out.println("Length: " + length);
    }

    public void append(int value) 
    {
        Node newNode = new Node(value);
        if (length == 0) 
        {
            head = newNode;
            tail = newNode;
        } 
        else
        {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

	public Node removeFirst()
	{
		if (length == 0) return null;
		Node temp = head;
		head = head.next;
		temp.next = null;
		length-- ;
		if (length == 0)
		{
			tail = null;
		}
		return temp;
	}

}
