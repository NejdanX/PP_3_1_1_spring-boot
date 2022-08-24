package ru.javamentor.springmvcwithboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.javamentor.springmvcwithboot.dao.UserDao;
import ru.javamentor.springmvcwithboot.model.User;


import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    UserDao userDao;

    @Autowired
    protected UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }

    @Transactional
    @Override
    public void deleteUser(long id) {
        userDao.deleteUser(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    @Override
    public User findUserById(long id) {
         return userDao.findUserById(id);
    }
}