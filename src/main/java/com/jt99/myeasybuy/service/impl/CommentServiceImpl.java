package com.jt99.myeasybuy.service.impl;

import com.jt99.myeasybuy.dao.CommentMapper;
import com.jt99.myeasybuy.entity.Comment;
import com.jt99.myeasybuy.query.CommentQuery;
import com.jt99.myeasybuy.service.CommentService;
import com.jt99.myeasybuy.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;

    //统计所有数据的数量
    @Override
    public int getCommentCount(CommentQuery commentQuery) {
        return commentMapper.getCommentCount(commentQuery);
    }

    //分页查
    @Override
    public List<Comment> getCommentListBy(CommentQuery commentQuery) {
        return commentMapper.getCommentListBy(commentQuery);
    }

    //连表分页查
    @Override
    public Page<Comment> getCommentInnerListBy(CommentQuery commentQuery) {
        Page<Comment> page = new Page<Comment>();
        int totalCount = commentMapper.getCommentCount(commentQuery);
        List<Comment> list = commentMapper.getCommentInnerListBy(commentQuery);
        page.setPageNo(commentQuery.getPageNo());
        page.setPageSize(commentQuery.getPageSize());
        page.setTotalCount(totalCount);
        page.setList(list);
        return page;
    }

    //查所有
    @Override
    public List<Comment> getCommentList() {
        return commentMapper.getCommentList();
    }

    //增
    @Override
    public void addComment(Comment comment) {
        commentMapper.addComment(comment);
    }

    //删
    @Override
    public void deleteCommentById(Integer id) {
        commentMapper.deleteCommentById(id);
    }

    //改
    @Override
    public void updateComment(Comment comment) {
        commentMapper.updateComment(comment);
    }

    //查单个
    @Override
    public Comment getCommentById(Integer id) {
        return commentMapper.getCommentById(id);
    }

    //删多个
    @Override
    public void deleteCommentsByIds(Integer[] ids) {
        commentMapper.deleteCommentsByIds(ids);
    }
}
