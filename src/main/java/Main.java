import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Input the plaintext message : ");

        String plaintext = sc.nextLine();

        System.out.println(" Enter the value by which each character in the plaintext message gets shifted : ");

        int shift = sc.nextInt();

        Encrypt encrypt = new Encrypt(plaintext, shift);

        encrypt.setShiftValue(shift);

        encrypt.setPlainText(plaintext);

        StringBuilder ciphertext = new StringBuilder();

        for(int i=0; i < encrypt.getPlainText().length();i++)
        {
            // Shift one character at a time
            char alphabet = encrypt.getPlainText().charAt(i);

            // if alphabet lies between a and z
            if((alphabet >= 'a' && alphabet <= 'z') || (alphabet >= 'A' && alphabet <= 'Z'))
            {
                // shift alphabet
                alphabet = (char) (alphabet + encrypt.getShiftValue());
            }
            // if shift alphabet greater than 'z'
            if(alphabet > 'z') {
                // reshift to starting position
                alphabet = (char) (alphabet+'a'-'z'-1);
            }
            // if shift alphabet greater than 'Z'
            else if(alphabet > 'Z' && alphabet < 'a') {
                //reshift to starting position
                alphabet = (char) (alphabet+'A'-'Z'-1);
            }
            ciphertext.append(alphabet);
        }
        System.out.println(" ciphertext : " + ciphertext.toString());
    }
}