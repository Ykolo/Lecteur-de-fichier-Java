package fichier;

import fichier.readers.CsvReader;
import fichier.readers.JsonReader;
import fichier.readers.TxtReader;

public class FileReader {
  public static void main(String[] args) {
    System.out.println("========== TEST TXT ==========");
    TxtReader txtReader = new TxtReader();
    txtReader.readFile("files/test.txt");

    System.out.println("\n=== À l'endroit ===");
    txtReader.showContent();

    System.out.println("\n=== À l'envers (lignes) ===");
    txtReader.reverseContent();

    System.out.println("\n=== Palindromique (caractères) ===");
    txtReader.palindromeContent();

    System.out.println("\n\n========== TEST CSV ==========");
    CsvReader csvReader = new CsvReader();
    csvReader.readFile("files/test.csv");

    System.out.println("\n=== À l'endroit ===");
    csvReader.showContent();

    System.out.println("\n=== À l'envers (lignes) ===");
    csvReader.reverseContent();

    System.out.println("\n=== Palindromique (caractères) ===");
    csvReader.palindromeContent();

    System.out.println("\n\n========== TEST JSON ==========");
    JsonReader jsonReader = new JsonReader();
    jsonReader.readFile("files/test.json");

    System.out.println("\n=== À l'endroit ===");
    jsonReader.showContent();

    System.out.println("\n=== À l'envers (lignes) ===");
    jsonReader.reverseContent();

    System.out.println("\n=== Palindromique (caractères) ===");
    jsonReader.palindromeContent();

    System.out.println("\n\n========== COMPARAISON ==========");
    boolean same = txtReader.compareFiles("files/test.txt", "files/test.csv");
    System.out.println("test.txt == test.csv : " + same);

    boolean same2 = csvReader.compareFiles("files/test.csv", "files/test.csv");
    System.out.println("test.csv == test.csv : " + same2);
  }
}
