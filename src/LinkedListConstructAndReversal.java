import java.util.Random;

class Node {
	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
		next = null;
	}
}

public class LinkedListConstructAndReversal {
	
	public static void main(String[] args)
	{
         Node head = printNode();
         Node rev = reverseNode(head);
         StringBuilder sb = new StringBuilder();
         sb.append(rev.data);
         while(rev != null)
         {
        	 rev = rev.next;
        	 if (rev != null)
             {
                 sb.append("-->");
                 sb.append(rev.data);
             }
         }
         System.out.println("Reversed Linkedlist: " + sb.toString());
         System.out.print("\n");
         
         Node head1 = printNode();
         int m = 3;
         int n = 9;
         Node rev1 = reverseNodeBetweenNodeMNodeN(head1,m,n);
         StringBuilder sb1 = new StringBuilder();
         sb1.append(rev1.data);
         while(rev1 != null)
         {
        	 rev1 = rev1.next;
        	 if (rev1 != null)
             {
                 sb1.append("-->");
                 sb1.append(rev1.data);
             }
         }
         System.out.println("Reversed Linkedlist b/w " +m + " & " + n + ": " + sb1.toString());
	}
	
	
	public static Node printNode()
    {
        Random rand = new Random();
        Node head = new Node(rand.nextInt(100));
        Node node = head;
        StringBuilder sb = new StringBuilder();
        sb.append(node.data);
        for (int i = 1; i < 10; i++)
        {
            node.next = new Node(rand.nextInt(100));
            node = node.next;
            if (node != null)
            {
                sb.append("-->");
                sb.append(node.data);
            }
        }
        System.out.println(sb.toString());
        return head;
    }
	
	
	public static Node reverseNode(Node head)
	{
		Node prev = null;
		Node curr = head;
		while(curr != null)
		{
			Node tmp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = tmp;
		}
		return prev;
	}
	
	
	public static Node reverseNodeBetweenNodeMNodeN(Node head, int m , int n)
	{
		if(head == null) return null;
		Node dummy = new Node(0);
		dummy.next = head;
		Node prev = dummy;
		
		for(int i=1;i<m;i++)
		{
			prev = prev.next;
		}
		Node start = prev;
		prev = prev.next;
		Node curr = prev;

		for(int i=1;i<=n-m;i++)
		{
			prev = prev.next;
		}
		prev = prev.next;
		Node tail = prev;
		
		while(curr != tail)
		{
			Node tmp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = tmp;
		}
		start.next = prev;
		return dummy.next;
	}

}
