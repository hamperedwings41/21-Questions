import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;
// This is a starter file for QuestionsGame.
//
// You should delete this comment and replace it with your class
// header comment.

	class QuestionsGame {
    
	Node root;
	Scanner in;
	
	
	Scanner f;
	
	
	boolean isQuestion;
	
	public QuestionsGame()
	{
		root = null;
		in = new Scanner(System.in);
	}

	public void read( String console) throws FileNotFoundException
	{
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
			if(o.equals("A:"))
			{
				String a = in.next();
				if(t.left==null)
					t.left = new Node (a , null);
			}
		}
		return t;
	}
	
	public void write( PrintStream printStream)
	{
		
	}
	
	public void askQuestions( String filename)
	{
		
	}
	
	public boolean yesTo(String prompt)
	{
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
