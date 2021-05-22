package com.jt99.myeasybuy.dao;

import com.jt99.myeasybuy.entity.News;
import com.jt99.myeasybuy.query.NewsQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface NewsMapper {
    //统计所有数据的数量
    public int getNewsCount(NewsQuery newsQuery);

    //分页查，与连表分页查的区别就在于实体类有没有引用类型属性
    public List<News> getNewsListBy(NewsQuery newsQuery);

    //连表分页查
    public List<News> getNewsInnerListBy(NewsQuery newsQuery);

    //查所有
    public List<News> getNewsList();

    //增
    public void addNews(News news);

    //删
    public void deleteNewsById(Integer id);

    //改
    public void updateNews(News news);

    //查单个
    public News getNewsById(Integer id);

    //删多个
    public void deleteNewssByIds(Integer[] ids);

    // 根据新闻类型进行查询
    List<News> getNewsByEnType(String enType);

}

