package cn.springmvc.model.database;

import java.util.Date;

/**
 * User: nathanchen Date: 19/10/2014 Time: 10:20 PM Description:
 */
public class Account
{
    private Long id;
    private String username, firstName, lastName, email;
    private boolean marketingOk = true;
    private boolean acceptTerms = false;
    private boolean enabled = true;
    private Date dateCreated;

    public Long getId ()
    {
        return id;
    }

    public void setId (Long id)
    {
        this.id = id;
    }

    public String getUsername ()
    {
        return username;
    }

    public void setUsername (String username)
    {
        this.username = username;
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

    public boolean isAcceptTerms ()
    {
        return acceptTerms;
    }

    public void setAcceptTerms (boolean acceptTerms)
    {
        this.acceptTerms = acceptTerms;
    }

    public boolean isEnabled ()
    {
        return enabled;
    }

    public void setEnabled (boolean enabled)
    {
        this.enabled = enabled;
    }

    public Date getDateCreated ()
    {
        return dateCreated;
    }

    public void setDateCreated (Date dateCreated)
    {
        this.dateCreated = dateCreated;
    }
}
