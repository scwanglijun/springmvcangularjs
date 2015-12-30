package com.newtouch.lion.web.controller;

import com.newtouch.lion.web.model.Right;
import com.newtouch.lion.web.model.Role;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by wanglijun on 15/12/26.
 */
@Controller
@RequestMapping("/role")
public class RoleController {

    static List<Role> roles=new ArrayList<Role>();

    static  List<Right> rights=new ArrayList<Right>();

    static{
        roles.add(new Role("系统管理员",1));
        roles.add(new Role("总经理",2));

        rights.add(new Right(1,"人员管理"));
        rights.add(new Right(2,"合同管理"));
        rights.add(new Right(3,"项目管理"));
        rights.add(new Right(4,"新闻公告"));
    }

    @RequestMapping("/list")
    @ResponseBody
    public List<Role>  list(){
        return roles;
    }


    @RequestMapping("/rights")
    @ResponseBody
    public List<Right> rights(){
        return rights;
    }

    @RequestMapping(value="/rolerights",method = POST)
    @ResponseBody
    public List<Right> roleRights(@RequestBody Right right){
        List<Right> rights1=new ArrayList<Right>();
        if(right.getId()==1) {
            rights1.add(new Right(1, "人员管理"));
            rights1.add(new Right(2, "合同管理"));
            rights1.add(new Right(3, "项目管理"));
            rights1.add(new Right(4, "新闻公告"));
        }else{
            rights1.add(new Right(1, "人员管理"));
            rights1.add(new Right(2, "合同管理"));
        }
        return rights1;
    }
}
