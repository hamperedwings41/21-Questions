import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.*;
// This is a starter file for QuestionsGame.
//
// You should delete this comment and replace it with your class
// header comment.

	class QuestionsGame {
    
	Node root;
	Scanner in;
	
	Scanner s;
	Scanner f;
	
	
	boolean yesTo;
	
	public QuestionsGame()
	{
		root = null;
		in = new Scanner(System.in);
	}

	public void read( String console) throws FileNotFoundException
	{
		s = new Scanner(System.in);
		f = new Scanner(new File(console));
		while(in.hasNext())
			root = read( f.nextLine(), root);
	}
	
	public Node read(String o, Node t)
	{
		while(in.hasNext())
			{
			if(o.equals("Q:")) {
				}
				if( t == null)
				{
					t = new Node (in.next(), null, null);
				}
				else if (t.data.compareTo(o) > 0) {
					t.left = read(in.next() , t.left);
				}
				else if(t.data.compareTo(o) < 0) {
					t.right = read(in.next(), t.right);
			}
			return t;
			}
			if(o.equals("A:"))
			{
				if(t.left==null)
					t.left =  new Node (in.next(), null, null);
				if(t.left != null)
					t.right =  new Node (in.next(), null, null);
			}
		return t;
	}

		public static void write(String[] args) throws IOException
	    {

	        PrintWriter save = new PrintWriter("save.txt"); 

	        save.close();
	    }
	
	public void askQuestions(Node t)
	{
		if(yesTo)
			System.out.println(t.right.data);
		System.out.println(t.left.data);
	}
	
	public boolean yesTo(String prompt)
	{
		while(in.hasNext())
		{
			if(s.next() == "Y")
			{
				yesTo = true;
				return true;
			}
			yesTo = false;	
			return false;
		}
		return false;
	}
	
		private class Node
		{
			Comparable data;
			Node left;
			Node right;

			public Node( Comparable v, Node l, Node r)
			{
				data = v;
				left = l;
				right = r;
			}
			
			public String toString()
			{
				return "" + data + " " + left + " " + right;
			}
		}
}
