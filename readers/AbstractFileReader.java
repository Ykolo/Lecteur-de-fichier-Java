package fichier.readers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public abstract class AbstractFileReader implements InterfaceFileReader {
  protected String content = "";

  @Override
  public void readFile(String path) {
    try {
      File file = new File(path);
      FileInputStream in = new FileInputStream(file);
      int i = in.read();
      while (i != -1) {
        content += (char) i;
        i = in.read();
      }
      in.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void showContent() {
    System.out.println(content);
  }

  @Override
  public void reverseContent() {
    String[] lines = content.split("\n");
    for (int i = lines.length - 1; i >= 0; i--) {
      System.out.println(lines[i]);
    }
  }

  @Override
  public void palindromeContent() {
    String reversed = new StringBuilder(content).reverse().toString();
    System.out.println(reversed);
  }

  public boolean compareFiles(String path1, String path2) {
    try {
      File f1 = new File(path1);
      File f2 = new File(path2);
      FileInputStream in1 = new FileInputStream(f1);
      FileInputStream in2 = new FileInputStream(f2);

      int byte1, byte2;
      do {
        byte1 = in1.read();
        byte2 = in2.read();
        if (byte1 != byte2) {
          in1.close();
          in2.close();
          return false;
        }
      } while (byte1 != -1 && byte2 != -1);

      in1.close();
      in2.close();
      return true;
    } catch (IOException e) {
      e.printStackTrace();
      return false;
    }
  }
}
