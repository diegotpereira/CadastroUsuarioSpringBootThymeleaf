package br.com.java.Services;

import br.com.java.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserServices {

    List<User> findAll();
    void save(User user);
    User getById(int id);
    List<User> getByName(String name);
    List<User> getBySurname(String surname);

    void deleteById(int id);

}
