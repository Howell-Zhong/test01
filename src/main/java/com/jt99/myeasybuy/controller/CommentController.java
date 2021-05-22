package com.jt99.myeasybuy.controller;



import com.jt99.myeasybuy.entity.Comment;
import com.jt99.myeasybuy.query.CommentQuery;
import com.jt99.myeasybuy.service.CommentService;
import com.jt99.myeasybuy.util.Page;
import com.jt99.myeasybuy.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    //统计所有数据的数量
    @RequestMapping("/getCommentCount")
    public ResponseResult<Integer> getCommentCount(CommentQuery commentQuery) {
        return ResponseResult.createSuccess(commentService.getCommentCount(commentQuery));
    }

    //分页查
    @RequestMapping("/getCommentListBy")
    public ResponseResult<List<Comment>> getCommentListBy(CommentQuery commentQuery) {
        return ResponseResult.createSuccess(commentService.getCommentListBy(commentQuery));
    }

    //连回复表，用户表分页查
    @RequestMapping("/getCommentInnerListBy")
    public ResponseResult<Page<Comment>> getCommentInnerListBy(CommentQuery commentQuery) {
        return ResponseResult.createSuccess(commentService.getCommentInnerListBy(commentQuery));
    }

    //查所有
    @RequestMapping("/getCommentList")
    public ResponseResult<List<Comment>> getCommentList() {
        return ResponseResult.createSuccess(commentService.getCommentList());
    }

    //增
    @RequestMapping("/addComment")
    public ResponseResult addComment(Comment comment) {
        comment.setEcCreateTime(new Date());
        commentService.addComment(comment);
        return ResponseResult.createSuccess("操作成功");
    }

    //删
    @RequestMapping("/deleteCommentById")
    public ResponseResult deleteCommentById(Integer ecId) {
        commentService.deleteCommentById(ecId);
        return ResponseResult.createSuccess("操作成功");
    }

    //改
    @RequestMapping("/updateComment")
    public ResponseResult updateComment(Comment comment) {
        commentService.updateComment(comment);
        return ResponseResult.createSuccess("操作成功");
    }

    //查单个
    @RequestMapping("/getCommentById")
    public ResponseResult<Comment> getCommentById(Integer id) {
        return ResponseResult.createSuccess(commentService.getCommentById(id));
    }

    //删多个
    @RequestMapping("/deleteCommentsByIds")
    public ResponseResult deleteCommentsByIds(Integer[] ids) {
        commentService.deleteCommentsByIds(ids);
        return ResponseResult.createSuccess("操作成功");
    }
}
