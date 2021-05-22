package com.jt99.myeasybuy.service.impl;

import com.jt99.myeasybuy.dao.ReplyMapper;
import com.jt99.myeasybuy.entity.Reply;
import com.jt99.myeasybuy.query.ReplyQuery;
import com.jt99.myeasybuy.service.ReplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService {
    @Autowired
    private ReplyMapper replyMapper;

    //统计所有数据的数量
    @Override
    public int getReplyCount(ReplyQuery replyQuery) {
        return replyMapper.getReplyCount(replyQuery);
    }

    //分页查
    @Override
    public List<Reply> getReplyListBy(ReplyQuery replyQuery) {
        return replyMapper.getReplyListBy(replyQuery);
    }

    //连表分页查
    @Override
    public List<Reply> getReplyInnerListBy(ReplyQuery replyQuery) {
        return replyMapper.getReplyInnerListBy(replyQuery);
    }

    //查所有
    @Override
    public List<Reply> getReplyList() {
        return replyMapper.getReplyList();
    }

    //增
    @Override
    public void addReply(Reply reply) {
        replyMapper.addReply(reply);
    }

    //删
    @Override
    public void deleteReplyById(Integer id) {
        replyMapper.deleteReplyById(id);
    }

    //改
    @Override
    public void updateReply(Reply reply) {
        replyMapper.updateReply(reply);
    }

    //查单个
    @Override
    public Reply getReplyById(Integer id) {
        return replyMapper.getReplyById(id);
    }

    //删多个
    @Override
    public void deleteReplysByIds(Integer[] ids) {
        replyMapper.deleteReplysByIds(ids);
    }
}
