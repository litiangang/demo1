package com.isscollege.hi.service.impl.user.cancel;

import com.isscollege.hi.entity.UserEntity;
import com.isscollege.hi.entity.UserTransactionalEntity;
import com.isscollege.hi.mapper.UserTransactionalMapper;
import com.isscollege.hi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Created by tglic on 2017/12/8.
 */
@Service("userServiceCancel")
public class UserServiceCancel  implements UserService {
    @Autowired
    private UserTransactionalMapper userTransactionalMapper;


    @Transactional
    @Override
    public Integer updateMobphone(UserEntity user) {
        UserTransactionalEntity userTransactionalEntity = userTransactionalMapper.getUserByAccount(user.getAccount());
        int value = userTransactionalMapper.deleteByPrimaryKey(userTransactionalEntity.getId());
        return value;
    }

    @Transactional
    @Override
    public Integer updatePassWord(UserEntity user) {
        UserTransactionalEntity userTransactionalEntity = userTransactionalMapper.getUserByAccount(user.getAccount());
        int value = userTransactionalMapper.deleteByPrimaryKey(userTransactionalEntity.getId());
        return value;
    }

}
