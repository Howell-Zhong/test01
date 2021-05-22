package com.jt99.myeasybuy.dao;

import com.jt99.myeasybuy.entity.ShoppingCart;
import com.jt99.myeasybuy.query.ShoppingCartQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ShoppingCartMapper {
    //统计所有数据的数量
    public int getShoppingCartCount(ShoppingCartQuery shoppingCartQuery);

    //分页查，与连表分页查的区别就在于实体类有没有引用类型属性
    public List<ShoppingCart> getShoppingCartListBy(ShoppingCartQuery shoppingCartQuery);

    //连表分页查
    public List<ShoppingCart> getShoppingCartInnerListBy(ShoppingCartQuery shoppingCartQuery);

    //查所有
    public List<ShoppingCart> getShoppingCartList();

    //增
    public void addShoppingCart(ShoppingCart shoppingCart);

    //删
    public void deleteShoppingCartById(Integer escId);

    //购物车结算后，根据用户ID删除改用户所有结算的购物车
    public void deleteShoppingCartByEuId(Integer euId);

    //改
    public void updateShoppingCart(ShoppingCart shoppingCart);

    //查单个
    public ShoppingCart getShoppingCartById(Integer id);

    //根据用户查他的所有购物车
    public List<ShoppingCart> getCartsByEuId(Integer EuId);

    //根据用户ID连表查出用户购物车中的商品
    public List<ShoppingCart> getShoppingCartByEuId(ShoppingCartQuery shoppingCartQuery);

    //计算总金额
    public List<ShoppingCart> getTotalPriceByEuId(Integer euId);

    //删多个
    public void deleteShoppingCartsByIds(Integer[] ids);

}

