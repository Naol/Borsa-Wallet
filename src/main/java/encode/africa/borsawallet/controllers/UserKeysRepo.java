package encode.africa.borsawallet.controllers;

import encode.africa.borsawallet.models.User;
import encode.africa.borsawallet.models.UserKeys;
import org.springframework.data.repository.CrudRepository;

public interface UserKeysRepo extends CrudRepository<UserKeys, Long> {

//    List<Customer> findByLastName(String lastName);
    String findSecretKey(String key);


}