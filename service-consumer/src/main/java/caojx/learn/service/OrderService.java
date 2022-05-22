package caojx.learn.service;

import caojx.learn.pojo.Order;

/**
 * 订单服务
 *
 * @author caojx created on 2022/5/22 6:16 PM
 */
public interface OrderService {

    /**
     * 根据主键查询订单
     *
     * @param id
     * @return
     */
    Order selectOrderById(Integer id);
}
