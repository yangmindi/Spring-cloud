package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Dept;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);
    public Dept findById(Long id);
    public List<Dept> findAll();
}
