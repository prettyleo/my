package cn.tedu.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.tedu.ssm.bean.Dept;
import cn.tedu.ssm.dao.DeptDao;
/**
 *此类需要在控制器中作为成员变量,因此需要实例化,所以要@Service实例化
 *@author Leo Shen
 */
@Service
public class DeptServiceImpl implements IDeptService {

	@Resource
	private DeptDao deptDao;
	
	public void addDept(Dept dept) {
		deptDao.insertDept(dept);

	}

	public List<Dept> showAllDept() {
		return deptDao.selectAll();
	}

}
