package cn.springmvc.service.impl;

import cn.springmvc.dao.AccountDAO;
import cn.springmvc.model.database.Account;
import cn.springmvc.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

/**
 * User: nathanchen Date: 19/10/2014 Time: 10:24 PM Description:
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService
{
    @Autowired
    private AccountDAO accountDAO;

    @Override
    public int registerAccount (Account account, Errors errors)
    {
        if (findByUsername(account.getUsername()) != null)
        {
            errors.rejectValue("username", "error.duplicate", new String[]{account.getUsername()}, null);
            return 0;
        }
        else
        {
            accountDAO.insertAccount(account);
            return 1;
        }
    }

    @Override
    public Account findByUsername (String username)
    {
        return accountDAO.findByUsername(username);
    }
}
