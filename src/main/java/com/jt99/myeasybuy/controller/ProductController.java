package com.jt99.myeasybuy.controller;


import com.jt99.myeasybuy.entity.Product;
import com.jt99.myeasybuy.query.ProductQuery;
import com.jt99.myeasybuy.service.ProductService;
import com.jt99.myeasybuy.util.Page;
import com.jt99.myeasybuy.util.ResponseResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * @ClassName: ProductController
 * @Description: 商品控制类
 * @Author: 70886
 * @Date: 2021/5/6 11:12
 * @Version 1.0
 **/
@CrossOrigin(value = "*",maxAge = 3600)
@RestController
@RequestMapping("/product")
public class ProductController {

    @Resource
    ProductService productService;

    @RequestMapping("/getProductAll")
    public ResponseResult<List<Product>> getProductAll(){
        List<Product> products = productService.getProductAll();
        return ResponseResult.createSuccess(products);
    }

    @RequestMapping(value = "/addProduct", method = RequestMethod.POST)
    public ResponseResult addProduct(MultipartFile epPicture, HttpServletRequest request, Product product) throws IOException {

        String path = request.getSession().getServletContext().getRealPath("/resources/upload/product");
        System.out.println(path);
        String fileName = UUID.randomUUID() + epPicture.getOriginalFilename().substring(epPicture.getOriginalFilename().lastIndexOf("."));
        File file = new File(path + "/"+ fileName);
        epPicture.transferTo(file);
        product.setEpFileName("/resources/upload/product/" + fileName);

        productService.addProduct(product);
        return ResponseResult.createSuccess("ok");
    }

    @RequestMapping("/deleteProduct")
    public ResponseResult deleteProduct(int epId){
        productService.deleteProduct(epId);
        return ResponseResult.createSuccess("ok");
    }

    @RequestMapping(value = "/updateProduct", method = RequestMethod.POST)
    public ResponseResult updateProduct(MultipartFile epPicture, HttpServletRequest request, Product product) throws IOException {
        if (epPicture != null){
            String path = request.getSession().getServletContext().getRealPath("/resources/upload/product");
            System.out.println(path);
            String fileName = UUID.randomUUID() + epPicture.getOriginalFilename().substring(epPicture.getOriginalFilename().lastIndexOf("."));
            File file = new File(path + "/"+ fileName);
            epPicture.transferTo(file);
            product.setEpFileName("/resources/upload/product/" + fileName);
        }
        productService.updateProduct(product);
        return ResponseResult.createSuccess("ok");
    }

    @RequestMapping("/getProductByPage")
    public ResponseResult<Page<Product>> getProductByPage(ProductQuery productQuery){
        Page<Product> page = new Page<>();
        int totalCount = productService.getTotalCount(productQuery);
        List<Product> products = productService.getProductByPage(productQuery);
        page.setList(products);
        page.setPageNo(productQuery.getPageNo());
        page.setPageSize(productQuery.getPageSize());
        page.setTotalCount(totalCount);
        return ResponseResult.createSuccess(page);
    }

    @RequestMapping("/getProductById")
    public ResponseResult<Product> getProductById(Integer epId){
        Product product = productService.getProductById(epId);
        return ResponseResult.createSuccess(product);
    }

    @RequestMapping("/updateProductStatus")
    public ResponseResult updateProductStatus(Integer epId, String epStatus){
        Product product = productService.getProductById(epId);
        product.setEpStatus(epStatus);
        productService.updateProduct(product);
        return ResponseResult.createSuccess("ok");
    }

    @RequestMapping("/getProductByPromotionCategory")
    public ResponseResult<List<Product>> getProductByPromotionCategory(String epPromotionCategory){
        List<Product> products = productService.getProductByPromotionCategory(epPromotionCategory);
        return ResponseResult.createSuccess(products);
    }

    @RequestMapping("/getProductByProductClass")
    public ResponseResult<Page<Product>> getProductByProductClass(ProductQuery productQuery){
        Page<Product> page = new Page<>();
        int totalCount = productService.getTotalCount(productQuery);
        List<Product> products = productService.getProductByProductClass(productQuery);
        page.setList(products);
        page.setPageNo(productQuery.getPageNo());
        page.setPageSize(productQuery.getPageSize());
        page.setTotalCount(totalCount);
        return ResponseResult.createSuccess(page);
    }
}
