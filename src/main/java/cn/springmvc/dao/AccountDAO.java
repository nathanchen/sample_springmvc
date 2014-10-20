package cn.springmvc.dao;

import cn.springmvc.model.database.Account;

/**
 * User: nathanchen Date: 19/10/2014 Time: 10:22 PM Description:
 */
public interface AccountDAO
{
    public int insertAccount(Account account);

    public Account findByUsername(String username);
}
