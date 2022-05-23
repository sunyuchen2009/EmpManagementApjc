package com.emp.empmanagement.service.impl;

import com.emp.empmanagement.bean.Grade;
import com.emp.empmanagement.dao.GradeDao;
import com.emp.empmanagement.service.GradeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Grade)表服务实现类
 *
 * @author makejava
 * @since 2022-05-21 14:39:57
 */
@Service("gradeService")
public class GradeServiceImpl implements GradeService {
    @Resource
    private GradeDao gradeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param  id
     * @return 实例对象
     */
    @Override
    public Grade queryById(Integer id) {
        return this.gradeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Grade> queryAllByLimit(int offset, int limit) {
        return this.gradeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param grade 实例对象
     * @return 实例对象
     */
    @Override
    public Grade insert(Grade grade) {
        this.gradeDao.insert(grade);
        return grade;
    }

    /**
     * 修改数据
     *
     * @param grade 实例对象
     * @return 实例对象
     */
    @Override
    public Grade update(Grade grade) {
        this.gradeDao.update(grade);
        return this.queryById(grade.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.gradeDao.deleteById(id) > 0;
    }
}