


public class Encrypt {

   private String plainText;
   private int shiftValue;


   public Encrypt(String plainText, int shiftValue){
        this.plainText = plainText;
        this.shiftValue = shiftValue;

   }


    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {

        if ((this.plainText != null) && ((!this.plainText.equals("")) && (this.plainText.matches("^[a-zA-Z]*$"))))
        {
           this.plainText = plainText;
        }

    }

    public int getShiftValue() {
        return shiftValue;
    }

    public void setShiftValue( int shiftValue) {


        if(shiftValue < 0 || shiftValue > 25)
        {

            this.shiftValue =shiftValue;
        }

    }
}
