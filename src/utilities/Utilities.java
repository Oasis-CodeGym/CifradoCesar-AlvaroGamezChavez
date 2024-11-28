package src.utilities;

import src.file.FileManager;
import src.validations.Validator;

import java.io.IOException;

public class Utilities {
  Validator validator = new Validator();

  public static void createPropertiesFile(int scrolling) throws IOException {
    FileManager fileManager = new FileManager();

    int scroll = scrolling + (int)(Math.random() * 35) + 1;
    String originalFileName = "encrytedFile.txt";
    String encryptedFile = "encypt.txt";
    String pathFilePropierties = "../newFiles";

    String sendToFileValues = String.valueOf(scrolling) +
                              "\n\n" + originalFileName +
                              "\n\n" + encryptedFile;

    fileManager.writeFile(sendToFileValues, pathFilePropierties);
  }

  public static boolean readPropertiesFile(){
    return false;
  }

  public static void twoJumps(){
    for (byte i = 0; i <= 2; i++){
      System.out.println("");
    }
  }

  public void createJavDoc(){
    System.out.println("Usa el ide para crear la documentación >:(");
  }

}
