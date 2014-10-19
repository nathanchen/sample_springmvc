package cn.springmvc.controller;

import cn.springmvc.model.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

/**
 * User: nathanchen Date: 16/10/2014 Time: 10:10 PM Description:
 */
@Controller
@RequestMapping(value = "roster/")
public class RosterController
{
    private List<Member> members = new ArrayList<Member>();

    public RosterController()
    {
        members.add(new Member("John", "Lennon"));
        members.add(new Member("Paul", "McCartney"));
        members.add(new Member("George", "Harrison"));
        members.add(new Member("Ringo", "Starr"));
    }

    @RequestMapping(value = "list")
    public void list(Model model)
    {
        model.addAttribute(members);
    }

    @RequestMapping(value = "member")
    public void member(@RequestParam("id") Integer id, Model model)
    {
        model.addAttribute(members.get(id));
    }
}
