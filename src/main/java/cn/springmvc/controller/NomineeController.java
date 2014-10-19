package cn.springmvc.controller;

import cn.springmvc.model.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * User: nathanchen Date: 17/10/2014 Time: 9:06 AM Description:
 */
@Controller
@RequestMapping(value = "nominee/")
public class NomineeController
{
    private static final Logger logger = LoggerFactory.getLogger(NomineeController.class);

    private String thanksViewName;

    public void setThanksViewName (String thanksViewName)
    {
        this.thanksViewName = thanksViewName;
    }

    @RequestMapping(value = "form", method = RequestMethod.GET)
    public Member form()
    {
        return new Member();
    }

    @RequestMapping(value = "processFormData", method = RequestMethod.POST)
    public String processFormData(Member member)
    {
        logger.info("Processing nominee: {}", member);
        return thanksViewName;
    }

//    @RequestMapping(value = "processFormData", method = RequestMethod.GET)
//    public String processFormData(@ModelAttribute("nominee") Member member, Model model)
//    {
//        logger.info("Processing nominee: {}", member);
//        Map map = model.asMap();
//        logger.info("model[member]={}", map.get("member"));
//        logger.info("model[nominee]={}", map.get("nominee"));
//        return thanksViewName;
//    }
}
