package cn.springmvc.model;

import org.hibernate.validator.constraints.Email;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * User: nathanchen Date: 17/10/2014 Time: 10:20 AM Description:
 */
public class AccountForm
{
    private String username, password, confirmPassword, firstName, lastName, email;
    private boolean marketingOk = true;
    private boolean acceptTerms = false;

    @NotNull
    @Size(min = 1, max = 50)
    public String getUsername ()
    {
        return username;
    }

    public void setUsername (String username)
    {
        this.username = username;
    }

    @NotNull
    @Size(min = 6, max = 50)
    public String getPassword ()
    {
        return password;
    }

    public void setPassword (String password)
    {
        this.password = password;
    }

    public String getConfirmPassword ()
    {
        return confirmPassword;
    }

    public void setConfirmPassword (String confirmPassword)
    {
        this.confirmPassword = confirmPassword;
    }

    public String getFirstName ()
    {
        return firstName;
    }

    public void setFirstName (String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName ()
    {
        return lastName;
    }

    public void setLastName (String lastName)
    {
        this.lastName = lastName;
    }

    @NotNull
    @Size(min = 6, max = 50)
    @Email
    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public boolean isMarketingOk ()
    {
        return marketingOk;
    }

    public void setMarketingOk (boolean marketingOk)
    {
        this.marketingOk = marketingOk;
    }

    @AssertTrue(message = "{account.acceptTerms.assertTrue.message}")
    public boolean isAcceptTerms ()
    {
        return acceptTerms;
    }

    public void setAcceptTerms (boolean acceptTerms)
    {
        this.acceptTerms = acceptTerms;
    }

    public String toString()
    {
        return username + " - " + firstName + " - " + lastName + " - " + email + " - " + marketingOk + " - " + acceptTerms;
    }
}
