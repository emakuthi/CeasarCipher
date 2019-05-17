import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter a Plain Text: ");

        String text = scan.nextLine();

        System.out.println("Please Enter a number between 1 to 25: ");

        int shiftKey = scan.nextInt();

        caesarEncrypt myEncrypter= new caesarEncrypt();

        String cipher =myEncrypter.encrypt(text, shiftKey);
        System.out.println("The Encrypted Text is: " +cipher);

        ceasarDecrypt myDecrypter =new ceasarDecrypt();

        String decrypted = myDecrypter.decrypt(cipher, shiftKey);

        System.out.println("The Decrypted Text is: "+ decrypted);
    }
}