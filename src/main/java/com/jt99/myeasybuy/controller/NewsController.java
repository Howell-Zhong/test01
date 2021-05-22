package com.jt99.myeasybuy.controller;

import com.jt99.myeasybuy.entity.News;
import com.jt99.myeasybuy.query.NewsQuery;
import com.jt99.myeasybuy.service.NewsService;
import com.jt99.myeasybuy.util.Page;
import com.jt99.myeasybuy.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("/news")
public class NewsController {
    @Resource
    private NewsService newsService;

    //统计所有数据的数量,
    @RequestMapping("/getNewsCount")
    public ResponseResult<Integer> getNewsCount(NewsQuery newsQuery) {
        return ResponseResult.createSuccess(newsService.getNewsCount(newsQuery));
    }

    //分页查
    @RequestMapping("/getNewsListByPage")
    public ResponseResult<Page<News>> getNewsListBy(NewsQuery newsQuery) {
        Page<News> page = new Page<>();
        int totalCount = newsService.getNewsCount(newsQuery);
        List<News> newsList = newsService.getNewsListBy(newsQuery);
        page.setTotalCount(totalCount);
        page.setPageNo(newsQuery.getPageNo());
        page.setPageSize(newsQuery.getPageSize());
        page.setList(newsList);
        return ResponseResult.createSuccess(page);
    }

    //连表分页查
    @RequestMapping("/getNewsInnerListBy")
    public ResponseResult<List<News>> getNewsInnerListBy(NewsQuery newsQuery) {
        return ResponseResult.createSuccess(newsService.getNewsInnerListBy(newsQuery));
    }

    //查所有
    @RequestMapping("/getNewsList")
    public ResponseResult<List<News>> getNewsList() {
        return ResponseResult.createSuccess(newsService.getNewsList());
    }

    //增
    @RequestMapping(value = "/addNews", method = RequestMethod.POST)
    public ResponseResult addNews(News news) {
        //添加时间
        news.setEnCreateTime(new Date());
        newsService.addNews(news);
        return ResponseResult.createSuccess("操作成功");
    }

    //删
    @RequestMapping("/deleteNewsById")
    public ResponseResult deleteNewsById(Integer id) {
        newsService.deleteNewsById(id);
        return ResponseResult.createSuccess("操作成功");
    }

    //改
    @RequestMapping("/updateNews")
    public ResponseResult updateNews(News news) {
        newsService.updateNews(news);
        return ResponseResult.createSuccess("操作成功");
    }

    //查单个
    @RequestMapping("/getNewsById")
    public ResponseResult<News> getNewsById(Integer id) {
        return ResponseResult.createSuccess(newsService.getNewsById(id));
    }

    //删多个
    @RequestMapping("/deleteNewssByIds")
    public ResponseResult deleteNewssByIds(Integer[] ids) {
        newsService.deleteNewssByIds(ids);
        return ResponseResult.createSuccess("操作成功");
    }

    // 根据类型进行查询
    @RequestMapping("/getNewsByEnType")
    public ResponseResult<List<News>> getNewsByEnType(String enType){
        List<News> newsList = newsService.getNewsByEnType(enType);
        return ResponseResult.createSuccess(newsList);
    }
}
