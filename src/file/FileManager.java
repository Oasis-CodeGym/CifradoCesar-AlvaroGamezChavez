package src.file;

import src.validations.Validator;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import  java.nio.charset.StandardCharsets;

public class FileManager {
  public FileManager(){};

  Validator validator = new Validator();

  public String readFile(String filePath) throws IOException {
    if(!validator.isFileExists(filePath))
      throw new IOException("No se encontró el archivo, favor de revisar");

    try(
        RandomAccessFile randomAccessFile = new RandomAccessFile(filePath, "rw");
        FileChannel fileChannel = randomAccessFile.getChannel();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Channels.newInputStream(fileChannel), StandardCharsets.UTF_8))
    ){
      StringBuilder loadText = new StringBuilder();
      String line;

      while ((line = bufferedReader.readLine()) != null){
        loadText.append(line);
      }

      System.out.println(loadText);
      return loadText.toString();
    }catch (FileNotFoundException fnfe){
      fnfe.printStackTrace();
    }catch (IOException ioe){
      ioe.printStackTrace();
    }

    return null;
  }
  public void writeFile(String content, String filePath) throws IOException {
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
      System.out.print(e.getMessage());
    }
  }
}
