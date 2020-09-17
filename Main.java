import java.util.Scanner;
import java.util.HashMap;

public class Main
{
  public static void main(String[] args)
  {
    HashMap<String,String> vocabulary = new HashMap<String,String>();
    Scanner input = new Scanner(System.in);
    vocabulary.put("heck", "yeah");
    String word;

    while(true)
    {
      System.out.println();
      System.out.print("Enter Vocabulary Word: ");
      word = input.nextLine();



      if(vocabulary.get(word) != null) //if word already exists
      {
        //[heck] Current Definition: "yeah"
        System.out.println("[" + word + "] Current Definition: \"" + vocabulary.get(word) + "\"");
        //ToDo: Add edit option
      }
      else //if word does not already exist
      {
        System.out.print("Enter Definition: ");
        String def = input.nextLine();

        vocabulary.put(word, def);
        System.out.println();
        System.out.println(vocabulary);
      }
    }
  }
}

//at some point ~ create shortcut or whatever to
// [~/Desktop/Code/Vocab] $ javac Main.java
// java Main 
