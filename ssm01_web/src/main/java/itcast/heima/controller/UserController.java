package itcast.heima.controller;

import itcast.heima.domain.TabUser;
import itcast.heima.domain.User;
import itcast.heima.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/findAll")
    @ResponseBody
    public List<User> findAll(){
        System.out.println("222修改");
        System.out.println("333修改");
        System.out.println(userService.findAll());
        return  userService.findAll();


    }

    @RequestMapping("/findAll1")
    @ResponseBody
    public List<TabUser> findAll1() {
        System.out.println(userService.findAll1());
        return userService.findAll1();
    }

    @RequestMapping("/findAll3")
    @ResponseBody
    public List<TabUser> findAll3() {
        System.out.println(userService.findAll1());
        return userService.findAll1();
    }
}
