package com.jt99.myeasybuy.controller;

import com.jt99.myeasybuy.entity.Reply;
import com.jt99.myeasybuy.query.ReplyQuery;
import com.jt99.myeasybuy.service.ReplyService;
import com.jt99.myeasybuy.util.ResponseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("/reply")
public class ReplyController {
    @Autowired
    private ReplyService replyService;

    //统计所有数据的数量
    @RequestMapping("/getReplyCount")
    public ResponseResult<Integer> getReplyCount(ReplyQuery replyQuery) {
        return ResponseResult.createSuccess(replyService.getReplyCount(replyQuery));
    }

    //分页查
    @RequestMapping("/getReplyListBy")
    public ResponseResult<List<Reply>> getReplyListBy(ReplyQuery replyQuery) {
        return ResponseResult.createSuccess(replyService.getReplyListBy(replyQuery));
    }

    //连表分页查
    @RequestMapping("/getReplyInnerListBy")
    public ResponseResult<List<Reply>> getReplyInnerListBy(ReplyQuery replyQuery) {
        return ResponseResult.createSuccess(replyService.getReplyInnerListBy(replyQuery));
    }

    //查所有
    @RequestMapping("/getReplyList")
    public ResponseResult<List<Reply>> getReplyList() {
        return ResponseResult.createSuccess(replyService.getReplyList());
    }

    //增
    @RequestMapping("/addReply")
    public ResponseResult addReply(Reply reply) {
        reply.setErReplyTime(new Date());
        replyService.addReply(reply);
        return ResponseResult.createSuccess("操作成功");
    }

    //删
    @RequestMapping("/deleteReplyById")
    public ResponseResult deleteReplyById(Integer id) {
        replyService.deleteReplyById(id);
        return ResponseResult.createSuccess("操作成功");
    }

    //改
    @RequestMapping("/updateReply")
    public ResponseResult updateReply(Reply reply) {
        System.out.println(reply);
        reply.setErReplyTime(new Date());
        replyService.updateReply(reply);
        return ResponseResult.createSuccess("操作成功");
    }

    //查单个
    @RequestMapping("/getReplyById")
    public ResponseResult<Reply> getReplyById(Integer id) {
        return ResponseResult.createSuccess(replyService.getReplyById(id));
    }

    //删多个
    @RequestMapping("/deleteReplysByIds")
    public ResponseResult deleteReplysByIds(Integer[] ids) {
        replyService.deleteReplysByIds(ids);
        return ResponseResult.createSuccess("操作成功");
    }
}
