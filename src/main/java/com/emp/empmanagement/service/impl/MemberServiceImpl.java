package com.emp.empmanagement.service.impl;

import com.emp.empmanagement.bean.Member;
import com.emp.empmanagement.dao.MemberDao;
import com.emp.empmanagement.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Member)表服务实现类
 *
 * @author makejava
 * @since 2022-05-21 14:39:58
 */
@Service("memberService")
public class MemberServiceImpl implements MemberService {
    @Resource
    private MemberDao memberDao;

    /**
     * 通过ID查询单条数据
     *
     * @param  id
     * @return 实例对象
     */
    @Override
    public Member queryById(Integer id) {
        return this.memberDao.queryById(id);
    }

    /**
     * 查询数据库中member表的所有数据
     *
     * @return 对象列表
     */
    @Override
    public List<Member> queryAll() {
        return this.memberDao.queryAll();
    }

    /**
     * 通过姓名、性别、年龄过滤查询数据
     *
     * @param name 实例对象
     * @param gender 实例对象
     * @param age 实例对象
     * @return 对象列表
     */
    @Override
    public List<Member> queryByCondition(String name, String gender, Integer age) {
        if(!name.isEmpty() && !gender.isEmpty() && age != null){

        }
        return this.memberDao.queryByCondition(name, gender, age);
    }

    /**
     * 新增数据
     *
     * @param member 实例对象
     * @return 实例对象
     */
    @Override
    public boolean insert(Member member) {
        return this.memberDao.insert(member) > 0;
    }

    /**
     * 修改数据
     *
     * @param member 实例对象
     * @return 实例对象
     */
    @Override
    public boolean update(Member member) {
        System.out.println(member.toString());
        this.memberDao.update(member);
        return this.memberDao.update(member) > 0;
    }

    /**
     * 通过主键删除数据
     *
     * @param  id
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.memberDao.deleteById(id) > 0;
    }
}