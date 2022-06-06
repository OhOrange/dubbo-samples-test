package com.dubbo.controller;

import com.dubbo.api.UserService;
import com.dubbo.vo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 醋酸菌HaC | WebSite📶 : https://rain.baimuxym.cn
 * @site
 * @date 2021/11/19
 * @Description
 */
@RestController
@RequestMapping("/provider")
@Slf4j
public class ProviderUserController {


    @Autowired
    UserService UserServiceImpl;

    @RequestMapping("/user/{id}")
    User getUserInfo(@PathVariable("id") Long id ) {
        return UserServiceImpl.getUserInfo(id);

    }

}
