package com.wp.user;

import com.wp.location.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();

        userRepository.findAll()
                .forEach(users::add);

        return users;
    }

    public Optional<User> getUser(String id) {
        return userRepository.findById(id);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(String id, User user) {
        userRepository.save(user);
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }
    public List<User> getUsersByLocation(String id){
        List<User> users = new ArrayList<>();

        userRepository.findByLocationId(id).forEach(users::add);
        return users;
    }
}
