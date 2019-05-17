
import org.junit.Test;
import static org.junit.Assert.*;
public class caesarEncryptTest {
    @Test
    public void encrypt_word() {
        caesarEncrypt obj =new caesarEncrypt();
        String output = "fmwjt";
        assertEquals(output,obj.encrypt("elvis", 1));
    }
}