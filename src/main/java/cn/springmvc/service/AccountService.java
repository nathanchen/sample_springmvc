package cn.springmvc.service;

import cn.springmvc.model.database.Account;
import org.springframework.validation.Errors;

/**
 * User: nathanchen Date: 19/10/2014 Time: 10:23 PM Description:
 */
public interface AccountService
{
    public int registerAccount(Account account, Errors errors);

    public Account findByUsername(String username);
}
