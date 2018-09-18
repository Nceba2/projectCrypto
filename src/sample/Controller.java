package sample;

import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;

import java.io.File;
import java.io.*;

public class Controller {
    @FXML private TextArea Input_Infor;
    @FXML private PasswordField CKey;

    @FXML protected void handleSubmitButtonAction(ActionEvent event) throws IOException {

        /**the key and input information will come from the UI components **/
        String key = CKey.getText().toString();
        String inputInformation = Input_Infor.getText().toString();

        /**file on this snippet is where input information is stored and prepared to be encrypted or decrypted **/
        File inputFile = new File("document.txt");
        FileWriter fw = new FileWriter(inputFile);
        fw.write(inputInformation);
        fw.close();
        File encryptedFile = new File("document1.encrypted");/**the file where encrypted information will go**/
        File decryptedFile = new File("document1.decrypted");/**the file where decrypted information will go**/

        /**The following snippet will try to encrypt and decrypt the document's information into the new files created **/
        try {
            CryptoEncryptDecrypt.encrypt(key, inputFile, encryptedFile);
            CryptoEncryptDecrypt.decrypt(key, encryptedFile, decryptedFile);
        } catch (CryptoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } /** **/

        System.out.println("Your Key is: " + key);
        System.out.println("Your incryption information is: " + inputInformation);
        System.out.println("app code working");

    }
}
