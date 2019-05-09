package com.bnuz.service;

import com.bnuz.domain.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    List<User> getAllByName(String name);

    void save(User user);

    void saveSelective(User user);

    void update(User user);

    void updateSelective(User user);

    void delete(User user);
}
