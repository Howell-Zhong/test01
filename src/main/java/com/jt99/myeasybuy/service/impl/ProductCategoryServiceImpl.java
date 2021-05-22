package com.jt99.myeasybuy.service.impl;



import com.jt99.myeasybuy.dao.ProductCategoryMapper;
import com.jt99.myeasybuy.entity.ProductCategory;
import com.jt99.myeasybuy.query.ProductCategoryQuery;
import com.jt99.myeasybuy.service.ProductCategoryService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @ClassName: ProductClassServiceImpl
 * @Description: 分类实现类
 * @Author: 70886
 * @Date: 2021/5/8 6:13
 * @Version 1.0
 **/
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Resource
    ProductCategoryMapper productCategoryMapper;

    @Override
    public List<ProductCategory> getProductClassFather() {
        return productCategoryMapper.getProductClassFather();
    }

    @Override
    public List<ProductCategory> getProductClassChildByFather(Integer epcId) {
        return productCategoryMapper.getProductClassChildByFather(epcId);
    }

    @Override
    public List<ProductCategoryQuery> getProductClassAll() {
        // 查出所有
        // 从数据库中查询全部
        List<ProductCategoryQuery> productClassList =  productCategoryMapper.getProductClassAll();
        // jdk8的stream处理,把根分类区分出来
        List<ProductCategoryQuery> roots = productClassList.stream().filter(productClass -> (productClass.getEpcFatherId() == 0)).collect(Collectors.toList());
        // 把非根分类区分出来
        List<ProductCategoryQuery> subs = productClassList.stream().filter(productClass -> (productClass.getEpcFatherId() != 0)).collect(Collectors.toList());

        // 递归构建结构化的分类信息
        roots.forEach(root -> buildSubs(root, subs));
        return roots;
    }

    @Override
    public List<ProductCategory> getProductClassList() {
        return productCategoryMapper.getProductClassList();
    }

    @Override
    public ProductCategory getProductClassById(Integer epcId) {
        return productCategoryMapper.getProductClassById(epcId);
    }

    @Override
    public void updateProductClass(ProductCategory productClass) {
        productCategoryMapper.updateProductClass(productClass);
    }

    @Override
    public void deleteProductClass(Integer epcId) {
        productCategoryMapper.deleteProductClass(epcId);
    }

    @Override
    public void addProductClass(ProductCategory productClass) {
        productCategoryMapper.addProductClass(productClass);
    }


    /**
     * 递归构建
     * @param parent
     * @param subs
     */
    private void buildSubs(ProductCategoryQuery parent, List<ProductCategoryQuery> subs) {
        List<ProductCategoryQuery> children = subs.stream().filter(sub -> (sub.getEpcFatherId() == parent.getEpcId())).collect(Collectors.toList());
        // 有子分类的情况
        if (!CollectionUtils.isEmpty(children)) {
            parent.setChildren(children);
            // 再次递归构建
            children.forEach(child -> buildSubs(child, subs));
        }
    }
}
