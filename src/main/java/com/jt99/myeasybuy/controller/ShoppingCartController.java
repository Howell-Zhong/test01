package com.jt99.myeasybuy.controller;

import com.jt99.myeasybuy.entity.ShoppingCart;
import com.jt99.myeasybuy.query.ShoppingCartQuery;
import com.jt99.myeasybuy.service.ShoppingCartService;
import com.jt99.myeasybuy.util.Page;
import com.jt99.myeasybuy.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("/shoppingCart")
public class ShoppingCartController {
    @Autowired
    private ShoppingCartService shoppingCartService;

    //统计所有数据的数量
    @RequestMapping("/getShoppingCartCount")
    public ResponseResult<Integer> getShoppingCartCount(ShoppingCartQuery shoppingCartQuery) {
        return ResponseResult.createSuccess(shoppingCartService.getShoppingCartCount(shoppingCartQuery));
    }

    //分页查
    @RequestMapping("/getShoppingCartListBy")
    public ResponseResult<List<ShoppingCart>> getShoppingCartListBy(ShoppingCartQuery shoppingCartQuery) {
        return ResponseResult.createSuccess(shoppingCartService.getShoppingCartListBy(shoppingCartQuery));
    }

    //连表分页查
    @RequestMapping("/getShoppingCartInnerListBy")
    public ResponseResult<List<ShoppingCart>> getShoppingCartInnerListBy(ShoppingCartQuery shoppingCartQuery) {
        return ResponseResult.createSuccess(shoppingCartService.getShoppingCartInnerListBy(shoppingCartQuery));
    }

    //查所有
    @RequestMapping("/getShoppingCartList")
    public ResponseResult<List<ShoppingCart>> getShoppingCartList() {
        return ResponseResult.createSuccess(shoppingCartService.getShoppingCartList());
    }

    //加入购物车
    @RequestMapping("/addShoppingCart")
    public ResponseResult addShoppingCart(ShoppingCart shoppingCart) {
        shoppingCartService.addShoppingCart(shoppingCart);
        return ResponseResult.createSuccess("操作成功");
    }

    //删除一个购物车
    @RequestMapping("/deleteShoppingCartById")
    public ResponseResult deleteShoppingCartById(Integer euId, Integer escId) {
        shoppingCartService.deleteShoppingCartById(escId);
        return ResponseResult.createSuccess(shoppingCartService.getTotalPriceByEuId(euId));
    }

    //购物车结算后，根据用户ID删除该用户所有已结算的购物车
    @RequestMapping("/deleteShoppingCartByEuId")
    public ResponseResult deleteShoppingCartByEuId(Integer euId) {
        shoppingCartService.deleteShoppingCartByEuId(euId);
        return ResponseResult.createSuccess("操作成功");
    }

    //修改商品数量后，要返回变动的金额
    @RequestMapping("/updateShoppingCart")
    public ResponseResult<Double> updateShoppingCart(ShoppingCart shoppingCart) {
        shoppingCartService.updateShoppingCart(shoppingCart);
        int euId = shoppingCart.getEuId();
        return ResponseResult.createSuccess(shoppingCartService.getTotalPriceByEuId(euId));
    }

    //查单个
    @RequestMapping("/getShoppingCartById")
    public ResponseResult<ShoppingCart> getShoppingCartById(Integer id) {
        return ResponseResult.createSuccess(shoppingCartService.getShoppingCartById(id));
    }

    //根据用户ID连表查出用户购物车中的商品
    @RequestMapping("/getShoppingCartByEuId")
    public ResponseResult<Page<ShoppingCart>> getShoppingCartByEuId(ShoppingCartQuery shoppingCartQuery) {
        return ResponseResult.createSuccess(shoppingCartService.getShoppingCartByEuId(shoppingCartQuery));
    }

    //计算总金额
    @RequestMapping("/getTotalPriceByEuId")
    public ResponseResult<Double> getTotalPriceByEuId(Integer euId){
        return ResponseResult.createSuccess(shoppingCartService.getTotalPriceByEuId(euId));
    }

    //删多个
    @RequestMapping("/deleteShoppingCartsByIds")
    public ResponseResult deleteShoppingCartsByIds(Integer[] ids) {
        shoppingCartService.deleteShoppingCartsByIds(ids);
        return ResponseResult.createSuccess("操作成功");
    }



}
