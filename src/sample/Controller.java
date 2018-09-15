package sample;

import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML private TextArea Input_Infor;
    @FXML private PasswordField CKey;

    @FXML protected void handleSubmitButtonAction(ActionEvent event) {

        System.out.println("Your Key is: " + CKey.getText().toString());
        System.out.println("Your incryption information is: " + Input_Infor.getText().toString());
        System.out.println("app code working");

        /**
        String key = "godsplanisallway";
        File inputFile = new File("document.txt");
        File encryptedFile = new File("document1.encrypted");
        File decryptedFile = new File("document1.decrypted");

        try {
            CryptoEncryptDecrypt.encrypt(key, inputFile, encryptedFile);
            CryptoEncryptDecrypt.decrypt(key, encryptedFile, decryptedFile);
        } catch (CryptoException ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        } **/
    }
}
