package com.haomory.myCRUD.controllers;

import com.haomory.myCRUD.model.User;
import com.haomory.myCRUD.service.UserServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/u/")
@AllArgsConstructor
public class MainController {
    private final UserServiceImpl userService;

    @GetMapping("/all")
    public List<User> allUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }

    @PostMapping("/put")
    public User createUser(@RequestBody User user) {
        return userService.addUpdateUser(user);
    }

    @GetMapping("/d/{id}")
    public void deleteUser(@PathVariable(name = "id") Long id) {
        userService.deleteUser(id);
    }

}
