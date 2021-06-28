package com.test.spring_boot.repository.dao;

import com.test.spring_boot.repository.entity.UserEntity;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @description: dao层逻辑
 * 先模拟一个 简单dao层。不接入DB。
 * @author: TK
 * @time: 2021/6/28 下午12:29
 */
@Repository
public class UserDao {

    public UserEntity getById(long id) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(id);
        userEntity.setName("测试用户：" + id);
        return userEntity;
    }

    public List<UserEntity> getListByIds(List<Long> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return Collections.emptyList();
        }
        return ids.stream()
                .map(this::getById)
                .collect(Collectors.toList());
    }

}
