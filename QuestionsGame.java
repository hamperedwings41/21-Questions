import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
// This is a starter file for QuestionsGame.
//
// You should delete this comment and replace it with your class
// header comment.

public class QuestionsGame {
    
	Node root;
	Scanner in;
	
	
	Scanner f;
	
	
	boolean isQuestion;
	
	public QuestionsGame()
	{
		root = null;
		in = new Scanner(System.in);
	}

	public void read( String filename) throws FileNotFoundException
	{
		f = new Scanner(new File(filename));
		while(in.hasNext())
			root = read( f.nextLine(), root);
	}
	
	public Node  read(String o, Node t)
	{
		if(o.equals("Q:") || o.equals("A:")) {
			isQuestion = o.equals("Q:");
			return t;
		}
		if( t == null)
		{
			t = new Node (o, null, null);
		}
		else if (t.data.compareTo(o) > 0) {
			t.left = read(o , t.left);
		}
		else if(t.data.compareTo(o) < 0) {
			t.right = read(o, t.right);
		}
		return t;
	
	}
	
	public void write( String filename)
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
