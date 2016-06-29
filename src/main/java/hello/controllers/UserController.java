package hello.controllers;

import hello.models.User;
import hello.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by yeonju on 2016-06-29.
 */
@Controller
@SessionAttributes
public class UserController {
    @Autowired
    private UserRepository userRepository;

  /*  @RequestMapping("{id}")
    public User getUser(@PathVariable String id){
        User user = userRepository.findOne(id);
        return user;
    }*/
    @RequestMapping("add/")
    public User addUser(@RequestParam String id, @RequestParam String password, @RequestParam String name){
        User user = userRepository.save(new User(id, password, name));

        return user;
    }

}
