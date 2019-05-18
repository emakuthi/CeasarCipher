import java.util.*;
public class Main {
    public static void main(String args[]) { // the main method where the program starts its execution
        Scanner scan = new Scanner(System.in); // initializing the scanner class
        System.out.println("Please Enter a Plain Text: ");

        String text = scan.nextLine();

        System.out.println("Please Enter a number between 1 to 25: ");

        int shiftKey = scan.nextInt();

        caesarEncrypt myEncrypter= new caesarEncrypt(); // instantiating the encrypt method from ceasarencryption class

        String cipher =myEncrypter.encrypt(text, shiftKey);
        System.out.println("The Encrypted Text is: " +cipher); // displays the encrypted text in the con console

        ceasarDecrypt myDecrypter =new ceasarDecrypt();  // instantiating the encrypt method from ceasardecryption class

        String decrypted = myDecrypter.decrypt(cipher, shiftKey);

        System.out.println("The Decrypted Text is: "+ decrypted);// displays the decrypted text in the con console
    }
}