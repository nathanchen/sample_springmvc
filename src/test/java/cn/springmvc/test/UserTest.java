package cn.springmvc.test;

import cn.springmvc.model.User;
import cn.springmvc.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: nathanchen Date: 15/10/2014 Time: 2:59 PM Description:
 */
public class UserTest
{
    private UserService userService;

    @Before
    public void before()
    {
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
                "classpath:conf/spring.xml",
                "classpath:conf/spring-mybatis.xml"
        });
        userService = (UserService) context.getBean("userServiceImpl");
    }

    @Test
    public void addUser()
    {
        User user = new User();
        user.setId(2);
        user.setNickname("hello");
        user.setState(2);
        System.out.println(userService.insertUser(user));
    }
}
