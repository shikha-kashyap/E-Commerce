package com.shikha.E_Commerce.example.serviceExample;

import com.shikha.E_Commerce.entity.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(int userId);

    User save(User user);

    User update(int id, User user);

    void deleteUserById(int id);
}
