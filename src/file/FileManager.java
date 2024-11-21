package src.file;

import src.validations.Validator;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
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

      System.out.println(loadText);
      return loadText.toString();
    }catch (FileNotFoundException fnfe){//excepción cuando no hay archivo encontrado
      fnfe.printStackTrace();
    }catch (IOException ioe){//excepción para escritura de archivo
      ioe.printStackTrace();
    }

    return null;
  }
  public void writeFile(String content, String filePath) throws IOException {
    // Logic for writing a file //https://codegym.cc/quests/lectures/es.cgu.module1.lecture42
    if(!validator.isFileExists(filePath)){
      //throw new FileAlreadyExistsException("El archivo existe");
    }

    try(
        RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "rw");
        FileChannel fileChannel = randomAccessFile.getChannel();
    ){
      ByteBuffer byteBuffer = ByteBuffer.allocate(content.getBytes().length);
      byteBuffer.put(content.getBytes());
      byteBuffer.flip();
      fileChannel.write(byteBuffer);
    } catch (FileNotFoundException fnfe) {
      System.out.println(fnfe.getMessage());;
    } catch (IOException e) {
      System.out.print(e);
    }
  }
}
