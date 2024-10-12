package src.file;

import src.cipher.Cipher;
import src.validations.Validator;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.file.FileStore;
import java.nio.file.Files;               //Files:Métodos estáticos para trabajar con archivos y directorios
import java.nio.file.Path;                //Path:Ruta a un fichero o directorio.
import java.nio.file.Paths;
import  java.nio.charset.StandardCharsets;//Charset: Codificación de caracteres utilizada al leer/escribir ficheros de texto.

public class FileManager {
  public FileManager(){};

  Validator validator = new Validator();

  public String readFile(String filePath) throws IOException {
    // File reading logic
    if(!validator.isFileExists(filePath))
      throw new IOException("No se encontró el archivo, favor de revisar");

    //cargar archivo
    //https://codegym.cc/quests/lectures/es.cgu.module1.lecture42
    try(
        RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "rw");
        FileChannel fileChannel = randomAccessFile.getChannel();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Channels.newInputStream(fileChannel), StandardCharsets.UTF_8))
    ){//Según tengo entendido se cierra solo, no hace falta cerrar nada
      StringBuilder loadText = new StringBuilder();
      String line;

      while ((line = bufferedReader.readLine()) != null){
        loadText.append(line);
      }
      //con el texto extraido a enciptarlo

      System.out.println(loadText);
      return loadText.toString();
    }catch (FileNotFoundException fnfe){//excepción cuando no hay archivo encontrado
      fnfe.printStackTrace();
    }catch (IOException ioe){//excepción para escritura de archivo
      ioe.printStackTrace();
    }
    finally {
      System.out.println("test");
    }

    return null;
  }
  public void writeFile(String content, String filePath) {
    // Logic for writing a file
  }
}
