package cn.tedu.ssm.service;

import java.util.List;

import cn.tedu.ssm.bean.Dept;

public interface IDeptService {
	
	void addDept(Dept dept);
	List<Dept> showAllDept();
}
