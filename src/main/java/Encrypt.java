public class Encrypt {
   private char alphabet;
   private String plainText;
   private int shiftValue;


   public Encrypt(char alphabet, String plainText, int shiftValue){

       this.setAlphabet(alphabet);
       this.setShiftValue(shiftValue);
       this.setPlainText(plainText);
   }

    public char getAlphabet() {
        return alphabet;
    }

    public void setAlphabet(char alphabet) {
        this.alphabet = alphabet;
    }

    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public int getShiftValue() {
        return shiftValue;
    }

    public void setShiftValue(int shiftValue) {
        this.shiftValue = shiftValue;
    }
}
