package encode.africa.borsawallet.controllers;

import encode.africa.borsawallet.models.AccountStatus;
import encode.africa.borsawallet.models.User;
import encode.africa.borsawallet.models.UserKeys;
import encode.africa.borsawallet.util.AES;
import org.stellar.sdk.KeyPair;

import javax.naming.AuthenticationException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class BorsaApp {
    UserRepo ur;
    UserKeysRepo uk;

    public BorsaApp(UserRepo ur, UserKeysRepo uk) {
        this.ur = ur;
        this.uk = uk;
    }

    // NO KYC PROCESS FOR NOW
    // public boolean KYC(User user){}
    private String secret = "Stellar";
    // username, phoneNo, password, FN/FN/GFN, (KEYPAIR from BORSASTELLAR/encrypted), DOB, amount
    public void createUser(String username, String pass, String name, String fName, String gfName,
                                  Date DOB, String phoneNo, double amount){
        User user = new User(name,fName,gfName,username,pass,DOB,amount,phoneNo);
        if (userExists(user)){
            // create user obj
            user.setStatus(AccountStatus.active);
            KeyPair keys = BorsaStellar.createAccount();
            UserKeys ukeys = new UserKeys(username, phoneNo, encrypt(keys.getSecretSeed().toString()));
            ur.save(user);
            uk.save(ukeys);
        }else {
            throw new RuntimeException("User already exists");
        }
    }

    public boolean userExists(User user){


        return false;
    }

    private String encrypt(String data){
        return AES.encrypt(data, secret);
    }
    private String decrypt(String cypher){
        return AES.decrypt(cypher,secret);
    }

    public User getUserData(){
        return null;
    }

    public void login(){

    }

    public void sendETBT(){

    }

    public double getBalance(){
        return 0;
    }

    public void offRamp(){

    }

}
