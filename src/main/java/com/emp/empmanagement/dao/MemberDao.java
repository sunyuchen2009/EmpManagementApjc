package com.emp.empmanagement.dao;

import com.emp.empmanagement.bean.Member;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * (Member)表数据库访问层
 *
 * @author makejava
 * @since 2022-05-21 14:39:58
 */
@Mapper
public interface MemberDao {

    /**
     * 通过ID查询单条数据
     *
     * @param  id
     * @return 实例对象
     */
    Member queryById(Integer id);

    /**
     * 根据姓名、性别、年龄查询
     *
     * @param name   姓名
     * @param gender 性别
     * @param age    年龄
     *
     * @return 对象列表
     */
    @Select("SELECT * FROM member WHERE name=#{name} AND gender=#{gender} AND age=#{age}")
    List<Member> queryByCondition(@Param("name") String name, @Param("gender") String gender, @Param("age") Integer age);

    /**
     * 查询数据库中member表的所有数据
     *
     * @return 对象列表
     */
    @Select("SELECT * FROM member")
    List<Member> queryAll();

    /**
     * 新增数据
     *
     * @param member 实例对象
     * @return 影响行数
     */
    @Insert("INSERT INTO member(name, age, gender, tel, adress) VALUES(#{name}, #{age}, #{gender}, #{tel}, #{adress})")
    int insert(Member member);

    /**
     * 修改数据
     *
     * @param member 实例对象
     * @return 影响行数
     */
    @Update("UPDATE member SET name=#{name}, age=#{age}, gender=#{gender}, tel=#{tel}, adress=#{adress} WHERE id = #{id}")
    int update(Member member);

    /**
     * 通过主键删除数据
     *
     * @param  id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}