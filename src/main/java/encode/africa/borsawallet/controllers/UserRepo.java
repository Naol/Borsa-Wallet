package encode.africa.borsawallet.controllers;

import encode.africa.borsawallet.models.AccountStatus;
import encode.africa.borsawallet.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo  extends CrudRepository<User, Long> {

//    List<Customer> findByLastName(String lastName);
    User findByPNo(String uname, String pass);
    User findUserAmount(String phoneNum);


}