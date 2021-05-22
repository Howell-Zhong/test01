package com.jt99.myeasybuy.service;



import com.jt99.myeasybuy.entity.ProductCategory;
import com.jt99.myeasybuy.query.ProductCategoryQuery;

import java.util.List;

public interface ProductCategoryService {
    // 查询父类
    List<ProductCategory> getProductClassFather();

    // 根据父类查询子类
    List<ProductCategory> getProductClassChildByFather(Integer epcId);

    // 查出所有
    List<ProductCategoryQuery> getProductClassAll();

    // 查询所有分类信息
    List<ProductCategory> getProductClassList();

    // 根据epcId查询分类信息
    ProductCategory getProductClassById(Integer epcId);

    // 修改分类信息
    void updateProductClass(ProductCategory productClass);

    // 删除分类信息
    void deleteProductClass(Integer epcId);

    // 增加分类
    void addProductClass(ProductCategory productClass);
}
