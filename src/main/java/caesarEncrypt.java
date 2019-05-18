public class caesarEncrypt {

    public String encrypt(String plainText, int shift){
        ShiftKey myshift = new ShiftKey(shift);

        String cipherText ="";
        int length = plainText.length();
        for(int i = 0; i<length; i++){
            char alphabet = plainText.charAt(i);
            if(Character.isLetter(alphabet)){
                if(Character.isLowerCase(alphabet)){
                    char c =(char)(alphabet+myshift.getShift());
                    if(c>'z'){
                        cipherText+=(char)(alphabet-(26-myshift.getShift()));

                    }else{
                        cipherText+=c;
                    }
                }
                else if(Character.isUpperCase(alphabet)){
                    char c =(char)(alphabet+shift);
                    if(c>'Z'){
                        cipherText +=(char)(alphabet-(26-myshift.getShift()));
                    }
                    else{
                        cipherText+=c;
                    }
                }
            }else{
                cipherText+=alphabet;
            }
        }
        return  cipherText;
    }
}
