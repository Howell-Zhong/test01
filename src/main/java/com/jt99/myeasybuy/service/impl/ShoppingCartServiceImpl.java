package com.jt99.myeasybuy.service.impl;

import com.jt99.myeasybuy.dao.ShoppingCartMapper;
import com.jt99.myeasybuy.entity.ShoppingCart;
import com.jt99.myeasybuy.query.ShoppingCartQuery;
import com.jt99.myeasybuy.service.ShoppingCartService;
import com.jt99.myeasybuy.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Autowired
    private ShoppingCartMapper shoppingCartMapper;

    //统计所有数据的数量
    @Override
    public int getShoppingCartCount(ShoppingCartQuery shoppingCartQuery) {
        return shoppingCartMapper.getShoppingCartCount(shoppingCartQuery);
    }

    //分页查
    @Override
    public List<ShoppingCart> getShoppingCartListBy(ShoppingCartQuery shoppingCartQuery) {
        return shoppingCartMapper.getShoppingCartListBy(shoppingCartQuery);
    }

    //连表分页查
    @Override
    public List<ShoppingCart> getShoppingCartInnerListBy(ShoppingCartQuery shoppingCartQuery) {
        return shoppingCartMapper.getShoppingCartInnerListBy(shoppingCartQuery);
    }

    //查所有
    @Override
    public List<ShoppingCart> getShoppingCartList() {
        return shoppingCartMapper.getShoppingCartList();
    }

    //增
    @Override
    public void addShoppingCart(ShoppingCart shoppingCart) {
        //根据用户ID查出所有购物车
        List<ShoppingCart> list = shoppingCartMapper.getCartsByEuId(shoppingCart.getEuId());
        //判断是否已存在,默认1不存在
        String has = "1";
        for(ShoppingCart sc : list){
            //Integer是个对象，低于128的数值存在字符串常量池中，用==判断结果是true，
            //大于128或等于128的数值不能用==判断，只能用equals
            if(sc.getEpId().equals(shoppingCart.getEpId())){
                has ="2";
                sc.setEscQuantity(sc.getEscQuantity()+1);
                shoppingCartMapper.updateShoppingCart(sc);
            }
        }
        //如果不存在则增加一个购物车
        if("1".equals(has)){
            shoppingCart.setEscQuantity(1);
            shoppingCartMapper.addShoppingCart(shoppingCart);
        }

    }

    //删
    @Override
    public void deleteShoppingCartById(Integer id) {
        shoppingCartMapper.deleteShoppingCartById(id);
    }

    //购物车结算后，根据用户ID删除改用户所有结算的购物车
    @Override
    public void deleteShoppingCartByEuId(Integer euId) {
        shoppingCartMapper.deleteShoppingCartByEuId(euId);
    }

    //改
    @Override
    public void updateShoppingCart(ShoppingCart shoppingCart) {
        shoppingCartMapper.updateShoppingCart(shoppingCart);
    }

    //查单个
    @Override
    public ShoppingCart getShoppingCartById(Integer id) {
        return shoppingCartMapper.getShoppingCartById(id);
    }

    @Override
    public List<ShoppingCart> getCartsByEuId(Integer euId) {
        return shoppingCartMapper.getCartsByEuId(euId);
    }

    //根据用户ID连表查出用户购物车中的商品
    @Override
    public Page<ShoppingCart> getShoppingCartByEuId(ShoppingCartQuery shoppingCartQuery) {
        Page<ShoppingCart> page = new Page<ShoppingCart>();
        int totalCount = shoppingCartMapper.getShoppingCartCount(shoppingCartQuery);
        List<ShoppingCart> list = shoppingCartMapper.getShoppingCartByEuId(shoppingCartQuery);
        page.setPageNo(shoppingCartQuery.getPageNo());
        page.setPageSize(shoppingCartQuery.getPageSize());
        page.setTotalCount(totalCount);
        page.setList(list);
        return page;
    }

    //计算总金额
    @Override
    public Double getTotalPriceByEuId(Integer euId) {
        List<ShoppingCart> list = shoppingCartMapper.getTotalPriceByEuId(euId);
        double sum = 0.00;
        for(ShoppingCart sc : list){
            sum += sc.getEscQuantity()*sc.getProduct().getEpPrice();
        }
        return sum;
    }

    //删多个
    @Override
    public void deleteShoppingCartsByIds(Integer[] ids) {
        shoppingCartMapper.deleteShoppingCartsByIds(ids);
    }
}
