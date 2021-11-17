package com.dubbo.service;

import com.dubbo.api.OrderService;
import com.dubbo.vo.Order;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangyongwen
 * @date 2021/11/17
 * @Description
 */
@DubboService
public class OrderServiceImpl implements OrderService {

    @Override
    public List<Order> getOrderInfo(long orderId) {

        List<Order> list = new ArrayList<>();
        Order order1 = new Order();
        order1.setOrderId(199L);
        order1.setOrderName("苹果");

        Order order2 = new Order();
        order1.setOrderId(200L);
        order1.setOrderName("GTR 2060");

        list.add(order1);
        list.add(order2);

        return list;
    }
}
