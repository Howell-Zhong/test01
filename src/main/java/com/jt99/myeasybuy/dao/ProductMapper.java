package com.jt99.myeasybuy.dao;


import com.jt99.myeasybuy.entity.Product;
import com.jt99.myeasybuy.query.ProductQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    // 查询商品全部信息
    List<Product> getProductAll();

    // 添加商品
    void addProduct(Product product);

    // 删除商品
    void deleteProduct(int epId);

    // 修改商品
    void updateProduct(Product product);

    // 查询条数
    Integer getTotalCount(ProductQuery productQuery);

    // 分页查询
    List<Product> getProductByPage(ProductQuery productQuery);

    // 根据ID查询商品
    Product getProductById(int id);

    List<Product> getProductByPromotionCategory(String epPromotionCategory);


    // 根据商品父类查询
    List<Product> getProductByProductClass(ProductQuery productQuery);

}
