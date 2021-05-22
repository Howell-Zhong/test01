package com.jt99.myeasybuy.dao;

import com.jt99.myeasybuy.entity.Reply;
import com.jt99.myeasybuy.query.ReplyQuery;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface ReplyMapper {
    //统计所有数据的数量
    public int getReplyCount(ReplyQuery replyQuery);

    //分页查，与连表分页查的区别就在于实体类有没有引用类型属性
    public List<Reply> getReplyListBy(ReplyQuery replyQuery);

    //连表分页查
    public List<Reply> getReplyInnerListBy(ReplyQuery replyQuery);

    //查所有
    public List<Reply> getReplyList();

    //增
    public void addReply(Reply reply);

    //删
    public void deleteReplyById(Integer id);

    //改
    public void updateReply(Reply reply);

    //查单个
    public Reply getReplyById(Integer id);

    //删多个
    public void deleteReplysByIds(Integer[] ids);

}

