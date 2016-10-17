package com.rwoods.discipleconnect.controller;

import com.rwoods.discipleconnect.model.User;
import com.rwoods.discipleconnect.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;

@RestController
public class UserController {
    private UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        super();
        this.setUserRepository(userRepository);
    }

    @PostConstruct
    public void initData() {
        userRepository.deleteAll();
        User user1 = new User.UserBuilder("rdwoods", "Rahman",
                "Woods", "7345166952", "M", "rdwoods1@gmail.com",
                "Toledo Church of Christ", "Toledo", "OH")
                .build();

        User user2 = new User.UserBuilder("rdwoods", "Rahman",
                "Woods", "7345166952", "M", "rdwoods1@gmail.com",
                "Toledo Church of Christ", "Toledo", "OH")
                .build();

        User user3 = new User.UserBuilder("rdwoods", "Rahman",
                "Woods", "7345166952", "M", "rdwoods1@gmail.com",
                "Toledo Church of Christ", "Toledo", "OH")
                .build();

        userRepository.save(user1);
        userRepository.save(user2);
        userRepository.save(user3);
    }

    @RequestMapping("/users")
    public List<User> users() {
        return userRepository.findAll();
    }

    @RequestMapping(value = "/user/{UserId}")
    public User getUser(@PathVariable("UserId") String userId) {
        return userRepository.findUserById(userId);
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}