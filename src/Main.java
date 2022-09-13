import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();

    main.go();
  }

  public void go(){
    readFromFile();

  }

  public void readFromFile(){
    try {
      File postNumbers = new File("C:\\Users\\Gamer\\Documents\\Postnummer\\Postnumre og byer");
      Scanner sc = new Scanner(postNumbers);

      while (sc.hasNext()){
        String contentOfFile = sc.nextLine();
        System.out.println(contentOfFile);
      }
    }
    catch (FileNotFoundException e){
      System.out.println("File not found");
    }
  }

  public void map(){
    HashMap<String, String> postMap = new HashMap<>();
  }
}
