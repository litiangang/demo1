package com.isscollege.hi.mapper;

import com.isscollege.hi.base.BaseMapper;
import com.isscollege.hi.entity.UserTransactionalEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by sxzhange on 2016/11/15.
 */
@Repository
public interface UserTransactionalMapper  extends BaseMapper<UserTransactionalEntity> {


    Integer updateMobphone(UserTransactionalEntity user);

    public UserTransactionalEntity getUserByAccount(String account);

    Integer updatePassWord(UserTransactionalEntity user);
}
