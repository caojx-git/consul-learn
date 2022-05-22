package caojx.learn.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 商品实体类
 *
 * @author caojx created on 2022/5/22 5:58 PM
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable {

    /**
     * 主键
     */
    private Integer id;

    /**
     * 商品名称
     */
    private String productName;

    /**
     * 商品数量
     */
    private Integer productNum;

    /**
     * 商品价格
     */
    private Double productPrice;
}
