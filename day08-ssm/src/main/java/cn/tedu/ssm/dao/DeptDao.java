package cn.tedu.ssm.dao;

import java.util.List;

import cn.tedu.ssm.bean.Dept;

public interface DeptDao {
	
	void insertDept(Dept dept);
	void updateDept(Dept dept);
	void deleteDept(Integer id);
	List<Dept> selectAll();
}
