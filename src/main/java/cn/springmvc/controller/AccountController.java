package cn.springmvc.controller;

import cn.springmvc.model.AccountForm;
import cn.springmvc.model.database.Account;
import cn.springmvc.service.AccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * User: nathanchen Date: 17/10/2014 Time: 10:34 AM Description:
 */
@Controller
@RequestMapping(value = "/users")
public class AccountController
{
    private static final Logger logger = LoggerFactory.getLogger(AccountController.class);

    private static final String VN_REG_FORM = "users/registrationForm";
    private static final String VN_REG_OK = "redirect:registration_ok";

    @Autowired
    private AccountService accountService;

    @InitBinder
    public void initBinder(WebDataBinder binder)
    {
        binder.setAllowedFields("username", "password", "confirmPassword", "firstName", "lastName", "email", "marketingOk", "acceptTerms");
    }

    @RequestMapping(value = "new", method = RequestMethod.GET)
    public String getRegistrationForm(Model model)
    {
        model.addAttribute("account", new AccountForm(0));
        return VN_REG_FORM;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public String postRegistrationForm(@ModelAttribute("account") @Valid AccountForm accountForm, BindingResult bindingResult)
    {
        convertPasswordError(bindingResult);
        logger.info("Created registration: {}", accountForm);
        accountService.registerAccount(toAccount(accountForm), bindingResult);
        return (bindingResult.hasErrors() ? VN_REG_FORM : VN_REG_OK);
    }

    private static void convertPasswordError(BindingResult bindingResult)
    {
        for (ObjectError error : bindingResult.getGlobalErrors())
        {
            String msg = error.getDefaultMessage();
            if ("account.password.mismatch.message".equals(msg))
            {
                if (! bindingResult.hasFieldErrors("password"))
                {
                    bindingResult.rejectValue("password", "error.mismatch");
                }
            }
        }
    }

    private static Account toAccount(AccountForm accountForm)
    {
        Account account = new Account();
        account.setUsername(accountForm.getUsername());
        account.setFirstName(accountForm.getFirstName());
        account.setLastName(accountForm.getLastName());
        account.setEmail(accountForm.getEmail());
        account.setMarketingOk(accountForm.isMarketingOk());
        account.setAcceptTerms(accountForm.isAcceptTerms());
        account.setEnabled(true);
        return account;
    }
}
