package com.test.spring_boot.controller;

import com.test.spring_boot.service.UserService;
import com.test.spring_boot.service.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ajax/user")
public class UserController {

    @Autowired
    UserService userService;

    // TODO: 调用测试，使用 postman软件
    @RequestMapping(value = "/info", method = RequestMethod.GET)
    public UserVo getUser(long id) {
        return userService.get(id);
    }

    // TODO: 完成 返回用户列表List<UserVo>的接口
    // TODO: 目前是user相关请求，完成 一组 order相关请求

}
