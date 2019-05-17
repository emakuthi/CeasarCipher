import org.junit.Test;

import static org.junit.Assert.*;

public class ceasarDecryptTest {

    @Test
    public void decrypt_word() {
        ceasarDecrypt obj =new ceasarDecrypt();
        String output = "elvis";
        assertEquals(output,obj.decrypt("fmwjt", 1));
    }

}