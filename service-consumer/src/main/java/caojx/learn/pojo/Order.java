package caojx.learn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * 订单实体
 *
 * @author caojx created on 2022/5/22 6:15 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order implements Serializable {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 订单编号
     */
    private String orderNo;

    /**
     * 地址
     */
    private String orderAddress;

    /**
     * 总金额
     */
    private Double totalPrice;

    /**
     * 购买商品列表
     */
    private List<Product> productList;
}
