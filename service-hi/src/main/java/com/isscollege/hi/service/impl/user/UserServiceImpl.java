package com.isscollege.hi.service.impl.user;

import com.isscollege.hi.entity.UserEntity;
import com.isscollege.hi.entity.UserTransactionalEntity;
import com.isscollege.hi.mapper.UserMapper;
import com.isscollege.hi.mapper.UserTransactionalMapper;
import com.isscollege.hi.service.UserService;
import org.bytesoft.compensable.Compensable;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
@Compensable(
        interfaceClass = UserService.class
        , confirmableKey = "userServiceConfirm"
        , cancellableKey = "userServiceCancel"
)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserTransactionalMapper userTransactionalMapper;

    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = com.bytesvc.ServiceException.class)
    @Override
    public Integer updateMobphone(UserEntity user) {
        UserEntity userEntity = userMapper.getUserByAccount(user.getAccount());

        //先更新临时表
        UserTransactionalEntity userTransactionalEntity = new UserTransactionalEntity();
        BeanUtils.copyProperties(userEntity, userTransactionalEntity);
        userTransactionalEntity.setMobphone(user.getMobphone());
        UserTransactionalEntity userTransactionalEntity1 = userTransactionalMapper.selectByPrimaryKey(userTransactionalEntity.getId());
        if (null==userTransactionalEntity1) {
            userTransactionalMapper.insert(userTransactionalEntity);
        }else {
            userTransactionalMapper.updateByPrimaryKey(userTransactionalEntity);
        }

        return 1;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = com.bytesvc.ServiceException.class)
    @Override
    public Integer updatePassWord(UserEntity user) {
        UserEntity userEntity = userMapper.getUserByAccount(user.getAccount());
        //先更新临时表
        UserTransactionalEntity userTransactionalEntity = new UserTransactionalEntity();
        BeanUtils.copyProperties(userEntity, userTransactionalEntity);
        userTransactionalEntity.setPassword(user.getPassword());
        UserTransactionalEntity userTransactionalEntity1 = userTransactionalMapper.selectByPrimaryKey(userTransactionalEntity.getId());
        if (null==userTransactionalEntity1) {
            userTransactionalMapper.insert(userTransactionalEntity);
        }else {
            userTransactionalMapper.updateByPrimaryKey(userTransactionalEntity);
        }
        return 1;
    }
}
