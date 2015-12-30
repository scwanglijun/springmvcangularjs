package com.newtouch.lion.web.controller;

import com.newtouch.lion.web.model.User;
import org.jboss.logging.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by wanglijun on 15/12/26.
 */

@Controller
public class HelloConstroller {
    /***
     * 日志
     */
    private static final Logger logger= LoggerFactory.getLogger(HelloConstroller.class);

    @RequestMapping("/index")
    public  String index(){
        return  "index";
    }


    @RequestMapping(value="/user/add",method = POST)
    @ResponseBody
    public User add(@RequestBody User user){
        logger.info("id:{},username:{}",user.getId(),user.getUsername());
        if(user.getId()==null){
            user.setId(5);
        }
        //User user=new User(username,id);
        return user;
    }

    @RequestMapping("/user/get")
    @ResponseBody
    public  User get(Integer id){
        logger.info("id:{}",id);
        User user=new User("even",11);
        return user;
    }
}
