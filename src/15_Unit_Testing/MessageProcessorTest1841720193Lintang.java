package unittest;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Lintang Kusuma Adjie
 */
public class MessageProcessorTest1841720193Lintang {

    MessageProcessor1841720193Lintang mProcessor;

    public MessageProcessorTest1841720193Lintang() {
        mProcessor = new MessageProcessor1841720193Lintang();
        mProcessor.setSenderLintang("Ronaldo");
        mProcessor.setRecipientLintang("Rafael");
        mProcessor.setMessageLintang("Whats up bro?");
    }

    @Test
    public void testShowMessageLintang() {
        String expectedResult = "Hai Rafael, you have message from Ronaldo. \nThe message as follows : Whats up bro?";
        Assert.assertEquals(expectedResult, mProcessor.messageFormatLintang());
    }
}
