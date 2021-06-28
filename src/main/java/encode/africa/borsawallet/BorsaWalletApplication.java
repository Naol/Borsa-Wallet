package encode.africa.borsawallet;

import encode.africa.borsawallet.controllers.BorsaStellar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.stellar.sdk.KeyPair;

@SpringBootApplication
public class BorsaWalletApplication {


    public static void main(String[] args) {
        SpringApplication.run(BorsaWalletApplication.class, args);
//        BorsaStellar b= new BorsaStellar();
//        KeyPair pair = KeyPair.random();
//        System.out.println(new String(pair.getSecretSeed()));
//        System.out.println(pair.getAccountId());
    }

}
