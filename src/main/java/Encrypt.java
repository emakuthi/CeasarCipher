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
        if ((this.plainText != null) && ((!this.plainText.equals("")) && (this.plainText.matches("^[a-zA-Z]*$"))))
        {
            this.plainText = plainText;
        }
        else
        {
            throw new IllegalArgumentException("Please Enter a Plain Text");
        }
    }

    public int getShiftValue() {
        return shiftValue;
    }

    public void setShiftValue(int shiftValue) {
        if(this.shiftValue < 0)
        {
            throw new IllegalArgumentException("The shift value is not valid");
        }
        else if(this.shiftValue > 26)
        {
            throw new IllegalArgumentException("The shift value has exceeded the limit ");
        }
        else
        {
            this.shiftValue=shiftValue;
        }
    }
}
