import java.util.*;
// This is a starter file for QuestionsGame.
//
// You should delete this comment and replace it with your class
// header comment.

public class QuestionsGame {
    
	Node root;
	
	public QuestionsGame()
	{
		root = null;
	}

	public void read( String filename)
	{
		
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
