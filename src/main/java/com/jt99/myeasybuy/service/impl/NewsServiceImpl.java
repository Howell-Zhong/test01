package com.jt99.myeasybuy.service.impl;

import com.jt99.myeasybuy.dao.NewsMapper;
import com.jt99.myeasybuy.entity.News;
import com.jt99.myeasybuy.query.NewsQuery;
import com.jt99.myeasybuy.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {
    @Resource
    private NewsMapper newsMapper;

    //统计所有数据的数量
    @Override
    public int getNewsCount(NewsQuery newsQuery) {
        return newsMapper.getNewsCount(newsQuery);
    }

    //分页查
    @Override
    public List<News> getNewsListBy(NewsQuery newsQuery) {
        return newsMapper.getNewsListBy(newsQuery);
    }

    //连表分页查
    @Override
    public List<News> getNewsInnerListBy(NewsQuery newsQuery) {
        return newsMapper.getNewsInnerListBy(newsQuery);
    }

    //查所有
    @Override
    public List<News> getNewsList() {
        return newsMapper.getNewsList();
    }

    //增
    @Override
    public void addNews(News news) {
        newsMapper.addNews(news);
    }

    //删
    @Override
    public void deleteNewsById(Integer id) {
        newsMapper.deleteNewsById(id);
    }

    //改
    @Override
    public void updateNews(News news) {
        newsMapper.updateNews(news);
    }

    //查单个
    @Override
    public News getNewsById(Integer id) {
        return newsMapper.getNewsById(id);
    }

    //删多个
    @Override
    public void deleteNewssByIds(Integer[] ids) {
        newsMapper.deleteNewssByIds(ids);
    }

    @Override
    public List<News> getNewsByEnType(String enType) {
        return newsMapper.getNewsByEnType(enType);
    }
}
