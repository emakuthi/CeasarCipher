public class ceasarDecrypt {   //decryption class

    public String decrypt(String plainText, int shift){  //decryption method

        ShiftKey myshift = new ShiftKey(shift);  //Instantiating ann instance of the class ShiftKey.java

        String cipherText ="";
        int length = plainText.length();
        for(int i = 0; i<length; i++){        // loop through every character in the plain text as input
            char alphabet = plainText.charAt(i);
            if(Character.isLetter(alphabet)){
                if(Character.isLowerCase(alphabet)){     // making sure that the input can be of lower case
                    char c =(char)(alphabet-myshift.getShift());
                    if(c<'a'){
                        cipherText+=(char)(alphabet+(26-myshift.getShift()));   // looping the last letter of alphabet back to first letter

                    }else{
                        cipherText+=c;
                    }
                }
                else if(Character.isUpperCase(alphabet)){    //making sure that the input can be of upper case
                    char c =(char)(alphabet-myshift.getShift());
                    if(c<'A'){
                        cipherText +=(char)(alphabet+(26-myshift.getShift()));    // looping the last letter of alphabet back to first letter
                    }
                    else{
                        cipherText+=c;
                    }
                }
            }else{
                cipherText+=alphabet;
            }
        }
        return  cipherText;  // returns the decrypted text
    }
}
