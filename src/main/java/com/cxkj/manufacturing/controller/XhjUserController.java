package com.cxkj.manufacturing.controller;


import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.cxkj.manufacturing.entity.User;
import com.cxkj.manufacturing.entity.XhjUser;
import com.cxkj.manufacturing.service.XhjUserService;
import com.cxkj.manufacturing.service.impl.XhjUserServiceImpl;
import com.cxkj.manufacturing.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author xhj
 * @since 2020-07-27
 */
@Controller
@RequestMapping("/xhjuser")
@CrossOrigin
public class XhjUserController {
    @Autowired
    private XhjUserService xhjUserService;

    @PostMapping("login")
    public R login(@RequestBody XhjUser user) {
        XhjUser xhjUser= xhjUserService.getOne(new QueryWrapper<XhjUser>().eq("username",user.getUsername()).eq("password",user.getPassword()));
        if(xhjUser!=null){
            return R.ok().data("token", "admin").data("user",xhjUser);
        }
        return R.error();

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

    @GetMapping("getist")
        public R getUserList(){
             List<XhjUser> userList= xhjUserService.list(null);
        return R.ok().data("list",userList);
        }
}

