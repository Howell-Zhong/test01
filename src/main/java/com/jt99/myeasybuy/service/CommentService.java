package com.jt99.myeasybuy.service;

import com.jt99.myeasybuy.entity.Comment;
import com.jt99.myeasybuy.query.CommentQuery;
import com.jt99.myeasybuy.util.Page;

import java.util.List;

public interface CommentService {
    //统计所有数据的数量
    public int getCommentCount(CommentQuery commentQuery);

    //分页查，与连表分页查的区别就在于实体类有没有引用类型属性
    public List<Comment> getCommentListBy(CommentQuery commentQuery);

    //连表分页查
    public Page<Comment> getCommentInnerListBy(CommentQuery commentQuery);

    //查所有
    public List<Comment> getCommentList();

    //增
    public void addComment(Comment comment);

    //删
    public void deleteCommentById(Integer id);

    //改
    public void updateComment(Comment comment);

    //查单个
    public Comment getCommentById(Integer id);

    //删多个
    public void deleteCommentsByIds(Integer[] ids);
}
