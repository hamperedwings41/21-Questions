import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class RunFaster {
	public static void main(String[] args) throws FileNotFoundException {
        Scanner file = new Scanner(new File("Questions.txt"));

       QuestionsGame test = new QuestionsGame();
       
      while(file.hasNext());
      	System.out.println(file.next());
    }

}
