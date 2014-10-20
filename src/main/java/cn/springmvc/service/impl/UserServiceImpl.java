package cn.springmvc.service.impl;

import cn.springmvc.dao.UserDAO;
import cn.springmvc.model.User;
import cn.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: nathanchen Date: 15/10/2014 Time: 2:44 PM Description:
 */
@Service
public class UserServiceImpl implements UserService
{
    @Autowired
    private UserDAO userDao;

    @Override
    public int insertUser (User user)
    {
        return userDao.insertUser(user);
    }
}
