package com.wp.user;

import com.wp.location.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value="/users")
    public List<User> getAllUsers() {

        return userService.getAllUsers();
    }
    @RequestMapping(value = "/users/{id}")
    public Optional<User> getUser(@PathVariable String id){
        return userService.getUser(id);
    }
    @RequestMapping(value="/users", method = RequestMethod.POST)
    public void addUser(@RequestBody User user) {
        userService.addUser(user);
    }

}
