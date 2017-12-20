package com.isscollege.hi.mapper;

import com.isscollege.hi.base.BaseMapper;
import com.isscollege.hi.entity.UserEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by sxzhange on 2016/11/15.
 */
@Repository
public interface UserMapper extends BaseMapper<UserEntity> {


    Integer updateMobphone(UserEntity user);

    public UserEntity getUserByAccount(String account);

    Integer updatePassWord(UserEntity user);
}
