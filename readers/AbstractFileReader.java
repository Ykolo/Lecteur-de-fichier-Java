package fichier.readers;

import java.io.File;
import java.util.Scanner;

public abstract class AbstractFileReader implements InterfaceFileReader {
  protected String content = "";

  @Override
  public void readFile(String path) {
    System.out.println("Reading file at path: " + path);
    Scanner scanner = new Scanner(System.in);
    File file = new File(path);

    scanner.close();
  }

  @Override
  public void showContent() {
    System.out.println("Le contenue du fichier:");
    System.out.println(content);
  }

  @Override
  public void reverseContent() {
    System.out.println("Le contenu du fichier a été inversé:");
  }

  @Override
  public void palindromeContent() {
    System.out.println("Le contenu du fichier est un palindrome:");
  }
}
