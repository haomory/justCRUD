package com.haomory.myCRUD.service.impl;

import com.haomory.myCRUD.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    User addUpdateUser(User user);
    void deleteUser(Long id);
    Optional<User> getUser(Long id);
    List<User> getAllUsers();
}
