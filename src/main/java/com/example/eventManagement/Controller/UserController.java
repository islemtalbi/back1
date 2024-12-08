package com.example.eventManagement.Controller;

import com.example.eventManagement.Entites.User;
import com.example.eventManagement.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/users")

public class UserController {
    @Autowired
    private UserService userService;
    private List<User> users = new ArrayList<>();
    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable int id) {
        return users.stream().filter(user -> user.getId() == id).findFirst().orElse(null);
    }
    @PostMapping
    public User createUser(@RequestBody User user) {
        users.add(user);
        return user;
    }
    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User updatedUser) {
        User user = getUserById(id);
        if (user != null) {
            user.setFirstName(updatedUser.getFirstName());
            user.setLastName(updatedUser.getLastName());
            user.setEmail(updatedUser.getEmail());
            user.setPassword(updatedUser.getPassword());
        }
        return user;
    }
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        users.removeIf(user -> user.getId() == id);
        return "Utilisateur supprimé avec succès";
    }







}
