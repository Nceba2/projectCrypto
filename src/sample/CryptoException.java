package sample;

/**this class handles all encryption and decryption exceptions
 * setting all messages throwable**/
public class CryptoException extends Exception {

    public CryptoException() {
    }

    public CryptoException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
