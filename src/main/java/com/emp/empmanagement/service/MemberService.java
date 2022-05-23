package com.emp.empmanagement.service;

import com.emp.empmanagement.bean.Member;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Member)表服务接口
 *
 * @author makejava
 * @since 2022-05-21 14:39:58
 */
public interface MemberService {

    /**
     * 通过ID查询单条数据
     *
     * @param  id 主键
     * @return 实例对象
     */
    Member queryById(Integer id);

    /**
     * 查询数据库中member表的所有数据
     *
     * @return 对象列表
     */
    List<Member> queryAll();

    /**
     * 通过姓名、性别、年龄过滤查询数据
     *
     * @param name 实例对象
     * @param gender 实例对象
     * @param age 实例对象
     * @return 对象列表
     */
    List<Member> queryByCondition(String name, String gender, Integer age);

    /**
     * 新增数据
     *
     * @param member 实例对象
     * @return 实例对象
     */
    Member insert(Member member);

    /**
     * 修改数据
     *
     * @param member 实例对象
     * @return 实例对象
     */
    boolean update(Member member);

    /**
     * 通过主键删除数据
     *
     * @param  id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}