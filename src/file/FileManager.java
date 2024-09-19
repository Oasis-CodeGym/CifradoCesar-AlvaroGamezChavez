package src.file;

import java.io.EOFException;
import java.io.IOException;
import java.nio.file.Files;                 // Files: Proporciona métodos estáticos para trabajar con ficheros y directorios (leer, escribir, copiar, borrar, etc.).
import java.nio.file.Path;                  //Path: Representa la ruta a un fichero o directorio.
import java.nio.file.Paths;
import  java.nio.charset.StandardCharsets;  // Charset: Representa la codificación de caracteres utilizada al leer/escribir ficheros de texto.

public class FileManager {
  public String readFile(String filePath) {
    // File reading logic
    Path path = Paths.get(filePath);
    try {
      byte[] byteFile = Files.readAllBytes(path);

//    if(path.)
    }catch (IOException e){
      System.out.println(e.getMessage());
    }
    return null;
  }
  public void writeFile(String content, String filePath) {
    // Logic for writing a file
  }
}
