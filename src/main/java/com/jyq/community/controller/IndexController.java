package com.jyq.community.controller;

import com.jyq.community.mapper.UserMapper;
import com.jyq.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/")
    public String index(HttpServletRequest request){
        Cookie[] cookies = request.getCookies();
        for (Cookie cookie : cookies) {
            if(cookie.getName().equals("token")){
                String token = cookie.getValue();
                System.out.println("客户端请求所带的cookie中的token是" + token);
                User user = userMapper.findByToken(token);
                System.out.println(user);
                if(user != null){
                    System.out.println("index()-----登录用户不为空，用户是" + user);
                    request.getSession().setAttribute("user", user);
                }
                break;
            }
        }
        return "index";
    }
}
