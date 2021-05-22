package com.jt99.myeasybuy.controller;


import com.jt99.myeasybuy.entity.ProductCategory;
import com.jt99.myeasybuy.query.ProductCategoryQuery;
import com.jt99.myeasybuy.service.ProductCategoryService;
import com.jt99.myeasybuy.util.ResponseResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @ClassName: ProductClassController
 * @Description: 分类启动类
 * @Author: 70886
 * @Date: 2021/5/8 6:24
 * @Version 1.0
 **/
@CrossOrigin(value = "*", maxAge = 3600)
@RestController
@RequestMapping("/productClass")
public class ProductCategoryController {

    @Resource
    ProductCategoryService productCategoryService;

    @RequestMapping("/getProductClassFather")
    public ResponseResult<List<ProductCategory>> getProductClassFather(){
        List<ProductCategory> productClassList = productCategoryService.getProductClassFather();
        return ResponseResult.createSuccess(productClassList);
    }

    @RequestMapping("/getProductClassChildByFather")
    public ResponseResult<List<ProductCategory>> getProductClassChildByFather(Integer epcId){
        List<ProductCategory> productClassList = productCategoryService.getProductClassChildByFather(epcId);
        return ResponseResult.createSuccess(productClassList);
    }

    @RequestMapping("/getProductClassAll")
    public ResponseResult<List<ProductCategoryQuery>> getProductClassAll(){
        List<ProductCategoryQuery> productClassList = productCategoryService.getProductClassAll();
       return ResponseResult.createSuccess(productClassList);
    }


    @RequestMapping("/getProductClassList")
    public ResponseResult<List<ProductCategory>> getProductClassList(){
        List<ProductCategory> productClassList = productCategoryService.getProductClassList();
        return ResponseResult.createSuccess(productClassList);
    }

    @RequestMapping("/getProductClassById")
    public ResponseResult<ProductCategory> getProductClassById(Integer epcId){
        ProductCategory productClass = productCategoryService.getProductClassById(epcId);
        return ResponseResult.createSuccess(productClass);
    }

    @RequestMapping(value = "/updateProductClass", method = RequestMethod.POST)
    public ResponseResult updateProductClass(ProductCategory productClass){
        productClass.setEpcLevel("2");
        productCategoryService.updateProductClass(productClass);
        return ResponseResult.createSuccess("ok");
    }

    @RequestMapping("/deleteProductClass")
    public ResponseResult deleteProductClass(Integer epcId){
        productCategoryService.deleteProductClass(epcId);
        return ResponseResult.createSuccess("ok");
    }

    @RequestMapping(value = "/addProductClass", method = RequestMethod.POST)
    public ResponseResult addProductClass(ProductCategory productClass){
        productClass.setEpcLevel("2");
        productCategoryService.addProductClass(productClass);
        return ResponseResult.createSuccess("ok");
    }
}
