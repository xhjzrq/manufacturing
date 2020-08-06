package com.rpkj.manufacturing.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.rpkj.manufacturing.entity.XhjUser;
import com.rpkj.manufacturing.service.XhjUserService;
import com.rpkj.manufacturing.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
    @Autowired
    private XhjUserService xhjUserService;
    @PostMapping("/login")
    public R login(@RequestBody XhjUser user) {
        XhjUser xhjUser= xhjUserService.getOne(new QueryWrapper<XhjUser>().eq("username",user.getUsername()).eq("password",user.getPassword()));
        if(xhjUser!=null){
            return R.ok().data("token", "admin").data("user",xhjUser);
        }
        return R.error().data("msg","用户名或者密码错误");
    }

    @GetMapping("info")
    public R info() {
       // return R.ok().data("roles", "admin").data("name", "admin").data("avatar", "admin");
        return R.ok();

    }

    @PostMapping("logout")
    public R logout() {
        return R.ok();
    }

    @GetMapping("list")
    public R getUserList(String name){
        System.out.println(name);
        QueryWrapper<XhjUser> qw = new QueryWrapper<XhjUser>();//.eq("username", user.getUsername()).eq("password", user.getPassword());

        if (name!=null&& name !=""){
            qw.like("username",name).or().like("realname",name).ne("id","1");
        }else{
            qw.ne("id","1");
        }
        List<XhjUser> userList= xhjUserService.list(qw);
        return R.ok().data("list",userList);
    }

    @GetMapping("del")
    public R getUserdel(String id){
        System.out.println(id);
       // return R.ok();
        boolean b = xhjUserService.removeById(id);
        if (b){
            return R.ok();
        }else {
            return R.error();
        }

    }

    @PostMapping ("save")
    public R saveuser(@RequestBody  XhjUser user){
     user.setId(UUID.randomUUID().toString());
        // return R.ok();
         boolean b = xhjUserService.save(user);
        if (b){
            return R.ok();
        }else {
            return R.error();
        }

    }


    @PostMapping ("update")
    public R updateuser(@RequestBody  XhjUser user){
        
        // return R.ok();
        boolean b=xhjUserService.updateById(user);
        if (b){
            return R.ok();
        }else {
            return R.error();
        }

    }


}
