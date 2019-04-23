package sample;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;

/**the following class is for encryption and decryption of documents**/
public class CryptoEncryptDecrypt {
    private static final String ALGORITHM = "AES";
    private static final String TRANSFORMATION = "AES";

    /**the following code snippet is set all information needed to encrypt**/
    public static void encrypt(String key, File inputFile, File outputFile) throws CryptoException {
        doCrypt(Cipher.ENCRYPT_MODE, key, inputFile, outputFile);
    }

    /**the following code snippet is set all information needed to decrypt**/
    public static void decrypt(String key, File inputFile, File outputFile) throws CryptoException {
        doCrypt(Cipher.DECRYPT_MODE, key, inputFile, outputFile);
    }

    /**the following snippet does all the encrypting and decrypting processes
     * it comprises of try and and catch statements to help handle all possible exceptions in the code**/
    private static void doCrypt(int cipherMode, String key, File inputFile, File outputFile) throws CryptoException {
        try {
            Key privateKey = new SecretKeySpec(key.getBytes(), ALGORITHM);
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(cipherMode, privateKey);

            FileInputStream inputStream = new FileInputStream(inputFile);
            byte[] inputBytes = new byte[(int) inputFile.length()];
            inputStream.read(inputBytes);

            byte[] outputBytes = cipher.doFinal(inputBytes);

            FileOutputStream outputStream = new FileOutputStream(outputFile);
            outputStream.write(outputBytes);

            inputStream.close();
            outputStream.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        }
    }
}