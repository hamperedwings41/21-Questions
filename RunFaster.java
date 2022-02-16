import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.*;

public class RunFaster {
	public static void main(String[] args) throws IOException {
        Scanner console = new Scanner(new File("Questions.txt"));

       QuestionsGame test = new QuestionsGame();
       
       System.out.println(console);
       test.read("Questions.txt");
    }

}
