package fichier.readers;

public interface InterfaceFileReader {
  void readFile(String path);

  void showContent();

  void reverseContent();

  void palindromeContent();
}