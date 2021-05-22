package com.jt99.myeasybuy.service.impl;


import com.jt99.myeasybuy.dao.ProductMapper;
import com.jt99.myeasybuy.entity.Product;
import com.jt99.myeasybuy.query.ProductQuery;
import com.jt99.myeasybuy.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: ProductServiceImpl
 * @Description: 商品实现类
 * @Author: 70886
 * @Date: 2021/5/6 11:13
 * @Version 1.0
 **/
@Service
public class ProductServiceImpl implements ProductService {

    @Resource
    ProductMapper productMapper;

    @Override
    public List<Product> getProductAll() {
        return productMapper.getProductAll();
    }

    @Override
    public void addProduct(Product product) {
        productMapper.addProduct(product);
    }

    @Override
    public void deleteProduct(int epId) {
        productMapper.deleteProduct(epId);
    }

    @Override
    public void updateProduct(Product product) {
        productMapper.updateProduct(product);
    }

    @Override
    public Integer getTotalCount(ProductQuery productQuery) {
        return productMapper.getTotalCount(productQuery);
    }

    @Override
    public List<Product> getProductByPage(ProductQuery productQuery) {
        return productMapper.getProductByPage(productQuery);
    }

    @Override
    public Product getProductById(int epId) {
        return productMapper.getProductById(epId);
    }

    @Override
    public List<Product> getProductByPromotionCategory(String epPromotionCategory) {
        return productMapper.getProductByPromotionCategory(epPromotionCategory);
    }

    @Override
    public List<Product> getProductByProductClass(ProductQuery productQuery) {
        return productMapper.getProductByProductClass(productQuery);
    }

}
