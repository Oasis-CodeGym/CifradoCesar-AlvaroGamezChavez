package src.cipher;

public class CaesarCipher {

  // Alphabet
  //private static final String ALPHABET = "our alphabet will be here";
//  private static final char[] ALPHABET = {'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з',
//      'и','к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
//      'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '};
  private static final char[] ALPHABET = {'a','á','à','ä','â','b','c','ç','d','e','é','è','ë','ê','f','g','h','i','í','ì','ï','î','j','k','l','m','n','ñ','o','ó','ò','ö','ô','p','q',
      'r','s','t','u','v','w','x','y','z','A','Á','À','Ä','Â','B','C','Ç','D','E','É','È','Ë','Ê','F','G','H','I','Í','Ì','Ï','Î','J','K','L','M','N','Ñ','O','Ó','Ò','Ö','Ô','P','Q',
      'R','S','T','U','V','W','X','Y','Z',' ','.',',','!','¿',';',':','-','_','+','=','*','/','%','&','@','#','$','^','`','~','|','\n','\t','1','2','3','4','5','6','7','8','9','0'};


// Methods for encryption, decryption, brute force, statistical analysis

  public void encrypt(String inputFile, String outputFile, int key) {
    // Implement encryption

  }

  public void decrypt(String inputFile, String outputFile, int key) {
    // Implement decryption
  }

  public void bruteForce(String inputFile, String
      outputFile, String optionalSampleFile) {
    // Implementation of brute force
  }

  public void statisticalAnalysis(String inputFile,
                                  String outputFile, String optionalSampleFile) {
    // Implement statistical analysis
  }

  public static char[] getALPHABET() {
    return ALPHABET;
  }

  // Helper methods: validateInput(), createAlphabet(), shiftCharacter(), readFile(), writeFile()

  public static void main(String[] args) {
    CaesarCipher cipher = new CaesarCipher();
    // Menu logic
    // 1. Encryption
    // 2. Decryption with key
    // 3. Brute force
    // 4. Statistical analysis
    // 0. Exit

    // Example of calling the encryption method:
    // cipher.encrypt("input.txt", "output.txt", 3);;
  }
}

