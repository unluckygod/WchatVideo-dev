package com.video.mapper;

import com.video.pojo.Users;
import com.video.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UsersMapper extends MyMapper<Users> {

    /**
     * @Description: 用户受喜欢数累加
     */
    void addReceiveLikeCount(String userId);

    /**
     * @Description: 用户受喜欢数累减
     */
    void reduceReceiveLikeCount(String userId);

    /**
     * @Description: 增加粉丝数
     */
    void addFansCount(String userId);

    /**
     * @Description: 增加关注数
     */
    void addFollersCount(String userId);

    /**
     * @Description: 减少粉丝数
     */
    void reduceFansCount(String userId);

    /**
     * @Description: 减少关注数
     */
    public void reduceFollersCount(String userId);
}