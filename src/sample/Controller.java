package sample;
import javafx.event.*;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import java.io.File;

public class Controller {
    @FXML private Text actiontarget;

    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        //actiontarget.setText("encypt pressed");

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
        }

    }

}
