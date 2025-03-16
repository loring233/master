package com.yyp.mapper;


import com.yyp.domain.User;

import java.util.List;

/**
 * 用户业务层接口
 */
public interface UserMapper {

    /**
     * 查询所有用户
     * @return
     */
    List<User> selectUserAll();

    /**
     * 新增用户
     * @param user
     * @return
     */
    int add(User user);

    /**
     * 修改
     * @param user
     * @return
     */
    int update(User user);

    /**
     * 根据id删除用户
     * @param id
     * @return
     */
    int delete(int id);

    /**
     * 根据id获取用户名查询用户
     * @param user
     * @return
     */
    List<User> selectUsersByIdAndUsername(User user);

    /**
     * 根据id列表查询用户
     * @param ids
     * @return
     */
    List<User> selectUsersByIds(int[] ids);
}
