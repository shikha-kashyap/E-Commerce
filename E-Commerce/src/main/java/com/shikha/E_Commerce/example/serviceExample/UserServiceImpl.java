package com.shikha.E_Commerce.example.serviceExample;

import com.shikha.E_Commerce.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public List<User> getAllUsers() {
        return List.of();
    }

    @Override
    public User getUserById(int userId) {
        return null;
    }

    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public User update(int id, User user) {
        return null;
    }

    @Override
    public void deleteUserById(int id) {

    }
}
