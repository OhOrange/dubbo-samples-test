package com.dubbo.service;

import com.dubbo.api.UserService;
import com.dubbo.vo.User;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author 醋酸菌HaC | WebSite📶 : https://rain.baimuxym.cn
 * @site
 * @date 2021/11/17
 * @Description
 */
//这里可以配置 version、group、协议、负载均衡、超时、超时 等等。见xml项目
@DubboService(version = "1.0.0")
@Component
@Slf4j
@Service
public class UserServiceImpl implements UserService {

    @Override
    public User getUserInfo(long userId) {
        return new User(userId, "userName" + userId , " --->>>>response from remote RPC provider:" + RpcContext.getContext().getLocalAddress());
    }

}
