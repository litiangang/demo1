package com.isscollege.hi.service.impl.user.confirm;

import com.isscollege.hi.entity.UserEntity;
import com.isscollege.hi.entity.UserTransactionalEntity;
import com.isscollege.hi.mapper.UserMapper;
import com.isscollege.hi.mapper.UserTransactionalMapper;
import com.isscollege.hi.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by tglic on 2017/12/8.
 */
@Service("userServiceConfirm")
public class UserServiceConfirm implements UserService {

    private final static Logger _LOG = LoggerFactory.getLogger(UserServiceConfirm.class);

    @Resource
    private UserMapper userMapper;
    @Autowired
    private UserTransactionalMapper userTransactionalMapper;

    @Transactional
    @Override
    public Integer updateMobphone(UserEntity user) {
        UserTransactionalEntity userTransactionalEntity = userTransactionalMapper.getUserByAccount(user.getAccount());

        BeanUtils.copyProperties(userTransactionalEntity, user);
        int value = userMapper.updateByPrimaryKey(user);
//        if (value == 1) {
//            userTransactionalMapper.delete(userTransactionalEntity);
//        }
        return value;
    }

    @Transactional
    @Override
    public Integer updatePassWord(UserEntity user) {
        UserTransactionalEntity userTransactionalEntity = userTransactionalMapper.getUserByAccount(user.getAccount());

        BeanUtils.copyProperties(userTransactionalEntity, user);
        int value = userMapper.updateByPrimaryKey(user);
//        if (value == 1) {
//            userTransactionalMapper.delete(userTransactionalEntity);
//        }
        return value;
    }
}
