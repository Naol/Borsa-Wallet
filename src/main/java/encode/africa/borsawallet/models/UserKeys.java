package encode.africa.borsawallet.models;

import javax.persistence.*;

// Store a hash of user username+phonenumber => encypted(sKey)
@Entity
public class UserKeys {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Column(unique = true)
    private String key ,sKey;

    public UserKeys(String uname, String pNo, String sKey) {
        String key = uname + pNo;
        this.key = hash(key);
        this.sKey = sKey;
    }

    public UserKeys() {}

    private String hash(String key) {
        return org.apache.commons.codec.digest.DigestUtils.sha256Hex(key);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getsKey() {
        return sKey;
    }

    public void setsKey(String sKey) {
        this.sKey = sKey;
    }
}
