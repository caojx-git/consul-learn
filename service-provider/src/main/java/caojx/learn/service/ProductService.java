package caojx.learn.service;

import caojx.learn.pojo.Product;

import java.util.List;

/**
 * 商品服务
 *
 * @author caojx created on 2022/5/22 5:59 PM
 */
public interface ProductService {

    /**
     * 查询商品列表
     *
     * @return
     */
    List<Product> selectProductList();
}
