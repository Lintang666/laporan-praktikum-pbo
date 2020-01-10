package unittest;

/**
 *
 * @author Lintang Kusuma Adjie
 */
public class MessageProcessor1841720193Lintang {

    private String mSender, mRecipient, mMessage;

    public String getMessageLintang() {
        return mMessage;
    }

    public String getRecipientLintang() {
        return mRecipient;
    }

    public String getSenderLintang() {
        return mSender;
    }

    public void setMessageLintang(String mMessage) {
        this.mMessage = mMessage;
    }

    public void setRecipientLintang(String mRecipient) {
        this.mRecipient = mRecipient;
    }

    public void setSenderLintang(String mSender) {
        this.mSender = mSender;
    }

    public String messageFormatLintang() {
        String message = String.format("Hai %s, you have message from %s. \nThe message as follows : %s",
                this.mRecipient, this.mSender, this.mMessage);
        return message;
    }
    
    public void showMessageLintang() {
        System.out.println(messageFormatLintang());
    }
}
