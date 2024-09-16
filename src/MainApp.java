package src;

import src.cipher.Cipher;
import src.file.FileManager;
import src.force.BruteForce;
import src.statistic.StatisticalAnalyzer;
import src.validations.Validator;

public class MainApp {
  public static void main(String[] args) {
    // Logic for selecting the operating mode, calling the appropriate methods
    FileManager fileManager = new FileManager();
    Cipher cipher = new Cipher("123123".toCharArray());
    Validator validator = new Validator();
    BruteForce bruteForce = new BruteForce();
    StatisticalAnalyzer statisticalAnalyzer = new StatisticalAnalyzer();

  }
}
