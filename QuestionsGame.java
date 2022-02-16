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

	public void read(String filename) throws FileNotFoundException
	{
		f = new Scanner(new File(filename));
		
		while(f.hasNext())
			root = read( f.nextLine(), root );
	}
	
	private Node read(String o, Node t) {
		if(o.equals("Q:") || o.equals("A:")) {
			isQuestion = o.equals("Q:"); 
			return t;
		}
		
		if(isQuestion) {
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
		} else {
			
		}
	}
	
	
	
	public void write(String filename)
	{
		
	}
	
	public void askQuestions()
	{
		
	}
	
	public boolean yesTo(String prompt)
	{
		boolean s = false;
		
		while(s != true) {
			System.out.println(prompt);
			s = (in.next() == "y");
		}
		
		return s;
	}
	
	private class Node
	{
		String data;
		Node left;
		Node right;

		public Node( String q, Node l, Node r)
		{
			data = q;
			left = l;
			right = r;
		}
			
		public String toString()
		{
			return "" + data + " " + left + " " + right;
		}
	}
}

