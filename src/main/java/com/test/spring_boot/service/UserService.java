package com.test.spring_boot.service;

import com.test.spring_boot.repository.dao.UserDao;
import com.test.spring_boot.repository.entity.UserEntity;
import com.test.spring_boot.service.vo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: service层
 * @author: TK
 * @time: 2021/6/28 下午12:24
 */
@Service
public class UserService {

    // 自动注入
    @Autowired
    UserDao userDao;

    // service层方法
    public UserVo get(long id) {
        // dao层返回的 肯定是 entity
        UserEntity userEntity = userDao.getById(id);

        // 返回给c端的 肯定是vo
        // 一般转vo是在service层负责的
        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(userEntity, userVo);

        return userVo;
    }

}
