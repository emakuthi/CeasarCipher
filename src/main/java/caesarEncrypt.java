public class caesarEncrypt {

    public String encrypt(String plainText, int shift){
        if(shift>26){
            shift = shift%26;
        }else if(shift<0){
            shift =(shift%26)+26;
        }
        String cipherText ="";
        int length = plainText.length();
        for(int i = 0; i<length; i++){
            char alphabet = plainText.charAt(i);
            if(Character.isLetter(alphabet)){
                if(Character.isLowerCase(alphabet)){
                    char c =(char)(alphabet+shift);
                    if(c>'z'){
                        cipherText+=(char)(alphabet-(26-shift));

                    }else{
                        cipherText+=c;
                    }
                }
                else if(Character.isUpperCase(alphabet)){
                    char c =(char)(alphabet+shift);
                    if(c>'Z'){
                        cipherText +=(char)(alphabet-(26-shift));
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
