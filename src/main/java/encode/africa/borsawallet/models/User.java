package encode.africa.borsawallet.models;

import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


//secret key and delegate usage rights
@Entity
public class User {

    @Id
    Long id;
    @Column(unique=true)
    String username, phoneNumber;

    String firstName, fatherName, gFatherName, pass;
    Date DOB;
    AccountStatus status;
    double amount;

    public User() {}
    public User(String firstName, String fatherName, String gFatherName, String username, String pass,
                Date DOB, double amount, String phoneNumber) {
        this.firstName = firstName;
        this.fatherName = fatherName;
        this.gFatherName = gFatherName;
        this.username = username;
        this.pass = pass;
        this.DOB = DOB;
        this.amount = amount;
        this.phoneNumber = phoneNumber;
        this.status = AccountStatus.paused;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getgFatherName() {
        return gFatherName;
    }

    public void setgFatherName(String gFatherName) {
        this.gFatherName = gFatherName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public AccountStatus getStatus() {
        return status;
    }

    public void setStatus(AccountStatus status) {
        this.status = status;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
