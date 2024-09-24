package src.validations;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Validator {
  public boolean isValidKey(int key, char[] alphabet) {
//    Key check
//    int validKey = alphabet.length;
//    if(key <= validKey)
//      return true;
//
//    return false;
//    return key <= validKey;
    return key <= alphabet.length;
  }

  public boolean isFileExists(String filePath) throws IOException {
//    if(Files.notExists(Path.of(filePath)))//false es que si encontró archivo, interensante
//      return false;
//
//    return true;
    return !Files.notExists(Path.of(filePath));
  }
}