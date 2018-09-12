package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

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

import javax.crypto.*;
import java.io.*;
import java.security.*;
import javax.crypto.spec.SecretKeySpec;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);

//        String key = "godsplanisallway";
//        File inputFile = new File("document.txt");
//        File encryptedFile = new File("document1.encrypted");
//        File decryptedFile = new File("document1.decrypted");
//
//        try {
//            CryptoEncryptDecrypt.encrypt(key, inputFile, encryptedFile);
//            CryptoEncryptDecrypt.decrypt(key, encryptedFile, decryptedFile);
//        } catch (CryptoException ex) {
//            System.out.println(ex.getMessage());
//            ex.printStackTrace();
//        }
    }
}