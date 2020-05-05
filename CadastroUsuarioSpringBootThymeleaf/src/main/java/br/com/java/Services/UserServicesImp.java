package br.com.java.Services;

import br.com.java.Entity.User;
import br.com.java.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class UserServicesImp implements UserServices {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {

        List<User> users = new ArrayList<>();

        for (User user : userRepository.findAll()) {

            users.add(user);
        }
        return users;
    }

    @Override
    public void save(User user) {
        userRepository.save(user);
    }
    
    @Override
    public User getById(int id) {
        User user;

        user = userRepository.getOne(id);

        return user;
    }

    @Override
    public List<User> getByName(String name) {

        List<User> user;

        user = userRepository.findUsersByName(name);

        return user;
    }

    @Override
    public List<User> getBySurname(String surname) {
        return userRepository.findByLastName(surname);
    }




    @Override
    public void deleteById(int id) {

        userRepository.deleteById(id);

    }
}