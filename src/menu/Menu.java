package src.menu;

/*import org.w3c.dom.ls.LSOutput;
import src.cipher.CaesarCipher;*/
import src.cipher.Cipher;
import src.file.FileManager;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

  public static void options(){
    Scanner teclado = new Scanner(System.in);
    FileManager fileManager = new FileManager();
    Cipher cipher = new Cipher();

    String encryptedText = null;
    String decryptedText = null;
    String option = "";
    String filePath = "";
    String text = "";
    int keyNumber = 0;

    while(!option.equals("x")) {
      System.out.println("Selecionar una opción para empezar el proceso");
      System.out.println("A.- Cargar Archivo");
      System.out.println("B.- Leer desde teclado (ingresar texto/encriptar/desencriptar)");
      System.out.println("C.- Encriptar contenido y Crear archivo con contenido encriptado");
      System.out.println("D.- Desencriptar archivo");
      /* System.out.println("E.- Desencriptar archivo con fuerza bruta");
      System.out.println("F.- Desencriptar archivo con análisis estadístico");*/
      System.out.println("X.- Salir");
      option = teclado.nextLine().toLowerCase();

      switch (option) {
        case "a" -> {
          System.out.println("Ingresar ruta del archivo");
          filePath = teclado.nextLine();
          System.out.println("Ingresar número clave");
          keyNumber = teclado.nextByte();

          try {
            cipher.encrypt(fileManager.readFile(filePath), keyNumber);

          } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
          } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
          }

        }
        case "b" -> {
          System.out.println("Ingresar texto a cifrar");
          text = teclado.nextLine();
          System.out.println("Ingresar número clave");
          keyNumber = teclado.nextInt();

          try {
            encryptedText = cipher.encrypt(text, keyNumber);
            decryptedText = cipher.decrypt(encryptedText, keyNumber);
            System.out.println(encryptedText);
            System.out.println(decryptedText);
          } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
          }
        }
        case "c" -> {
          System.out.println("Encriptar archivo");
          try {
            String content = fileManager.readFile(filePath);
            cipher.encrypt(content, keyNumber);
            fileManager.writeFile(content,"encrytedFile.txt");
          } catch (Exception e) {
            throw new RuntimeException(e);
          }
        }
        case "d" -> {
          System.out.println("Crear archivo desencriptado");
          try {

            fileManager.readFile("encrypt.txt");
            decryptedText = cipher.decrypt(text, keyNumber);
            fileManager.writeFile(decryptedText, "decryptedFile.txt");
          } catch (Exception e) {
            System.out.println(e.getMessage());
          }
        }
        /*case "e" -> System.out.println("Desensecriptar archivo");
        case "f" -> System.out.println("Desensecriptar por fuerza bruta");*/
        case "x" -> System.out.println("baigon");
        default -> System.out.println("Solo letras de la 'A' a la 'F', 'X' para salir");
      }

    }

    System.out.println("Fin del programa Baigon");
  }
}
