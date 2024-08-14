package com.example.demo.service;
import com.example.demo.model.User;
import java.util.List;
import java.util.Optional;
public interface UserService {
    User createUser(User user);
    Optional<User> getUserById(Long id);
    List<User> getAllUsers();
    User updateUser(Long id, User user);
    void deleteUser(Long id);
}
