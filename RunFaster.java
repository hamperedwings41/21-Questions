import java.io.*;
import java.util.Scanner;

public class RunFaster {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("questions.txt"));
		
		QuestionsGame test = new QuestionsGame();
		
		while(file.hasNext())
			System.out.println(file.next());
		
		test.read("questions.txt");
	}
}
