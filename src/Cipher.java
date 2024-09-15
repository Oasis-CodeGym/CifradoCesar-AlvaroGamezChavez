package src;

public class Cipher {
  private static final char[] ALPHABET = {'а', 'б', 'в', 'г', 'д', 'е', 'ж', 'з',
      'и','к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ',
      'ъ', 'ы', 'ь', 'э', 'я', '.', ',', '«', '»', '"', '\'', ':', '!', '?', ' '};

  private char[] alphabet;
  public Cipher(char[] alphabet) {
    System.out.println("tes");
    this.alphabet = alphabet;
  }
  public String encrypt(String text, int shift) {
    // Encryption logic
    return text;
  }
  public String decrypt(String encryptedText, int shift) {
    // Decryption logic
    return encryptedText;
  }
}
