package com.dubbo.api;

import com.dubbo.vo.User;

import java.util.List;

/**
 * @author huangyongwen
 * @date 2021/11/18
 * @Description 压测接口
 */
public interface StressTestService {

    String StressString(String string);

    User StressTestPojo(User user);

    List<User> StressListUser(List<User> list);

    String StressTest50K(String bytes);

    String StressTest100K(String bytes);

}
