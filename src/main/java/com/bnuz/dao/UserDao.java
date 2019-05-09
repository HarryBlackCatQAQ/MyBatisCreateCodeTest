package com.bnuz.dao;

import com.bnuz.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * UserDao继承基类
 */
@Repository
public interface UserDao extends MyBatisBaseDao<User, Integer> {

    @Select("SELECT * FROM user_t")
    List<User> getAll();
}