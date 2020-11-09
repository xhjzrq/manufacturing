package com.rpkj.manufacturing.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.rpkj.manufacturing.entity.UserFilterVO;
import com.rpkj.manufacturing.entity.XhjUser;
import com.rpkj.manufacturing.service.XhjUserService;
import com.rpkj.manufacturing.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/user")
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
    public R info(String token) {
       // return R.ok().data("roles", "admin").data("name", "admin").data("avatar", "admin");
        ArrayList<String> roles = new ArrayList<String>();

        if ("admin".equals(token)){
            roles.add("admin");
        }else{
            roles.add("test");
        }
        return R.ok().data("roles",roles).data("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif").data("name","Super Admin");

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


        List<XhjUser> listo =xhjUserService.list(new QueryWrapper<XhjUser>().select("distinct username"));
        List<UserFilterVO> userlisto = new ArrayList<>();
        UserFilterVO userFilterVO;
        for(XhjUser x: listo){
            userFilterVO=new UserFilterVO();
            userFilterVO.setText(x.getUsername());
            userFilterVO.setValue(x.getUsername());
            userlisto.add(userFilterVO);
        }

//        List<XhjUser> listo1 =xhjUserService.list(new QueryWrapper<XhjUser>().select("distinct username"));
//        List<UserFilterVO> userlisto1 = new ArrayList<>();
//        UserFilterVO userFilterVO1;
//        for(XhjUser x: listo){
//            userFilterVO=new UserFilterVO();
//            userFilterVO.setText(x.getUsername());
//            userFilterVO.setValue(x.getUsername());
//            userlisto.add(userFilterVO);
//        }
        return R.ok().data("list",userList).data("userfilter",userlisto);
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
