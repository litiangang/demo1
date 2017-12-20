package com.isscollege.hi.controller;

import com.isscollege.hi.entity.UserEntity;
import com.isscollege.hi.service.UserService;
import org.bytesoft.compensable.Compensable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by tgtana on 2017/12/13.
 */
@RestController
@Compensable(
        interfaceClass = UserService.class
        , confirmableKey = "userServiceConfirm"
        , cancellableKey = "userServiceCancel"
)
public class IndexController  implements UserService{

    @Resource(name ="userServiceImpl")
    private UserService userService;


    @Override
    @RequestMapping(value = "/test/updateMobphone",method = RequestMethod.GET)
    @Transactional
    public Integer updateMobphone(UserEntity userEntity) {
        userEntity.setAccount(userEntity.getAccount());
        userEntity.setMobphone(userEntity.getMobphone());
        int i = userService.updateMobphone(userEntity);
        return 1;
    }

    @RequestMapping(value = "/test/updatePassWord",method = RequestMethod.GET)
    @Override
    @Transactional
    public Integer updatePassWord(UserEntity userEntity) {
        userEntity.setAccount(userEntity.getAccount());
        userEntity.setPassword(userEntity.getPassword());
        int i = userService.updatePassWord(userEntity);
        return 1;
    }
}
