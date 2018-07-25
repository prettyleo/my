package test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.ssm.bean.Dept;
import cn.tedu.ssm.dao.DeptDao;
import cn.tedu.ssm.service.DeptServiceImpl;
import cn.tedu.ssm.service.IDeptService;

public class TestDept {
	
	@Test
	public void testInsertDept(){
		//1.获取spring容器(初始化spring容器)
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-dao.xml");
		//2.获取bean对象
		DeptDao dd = ac.getBean("deptDao",DeptDao.class);
		//3.调用方法
		Dept dept = new Dept();
		dept.setDeptName("第一开发部");
		dept.setDeptLoc("中关村");
		dd.insertDept(dept);
		//4.关闭容器
		ac.close();
	}
	
	@Test
	public void testDeptService(){
		//1.获取spring容器(初始化容器)
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-service.xml","application-dao.xml");
		//2.获取bean对象
		IDeptService servoce = ac.getBean("deptServiceImpl",DeptServiceImpl.class);
		//3.调用方法
		Dept d = new Dept();
		d.setDeptLoc("华侨城");
		d.setDeptName("第二开发部");
		servoce.addDept(d);
		ac.close();
	}
	
	@Test
	public void testSelectAll(){
		//1.获取容器对象
		AbstractApplicationContext ac = new ClassPathXmlApplicationContext("application-service.xml","application-dao.xml");
		//2.获取dao层对象
		DeptDao dd = ac.getBean("deptDao",DeptDao.class);
		System.out.println(dd.selectAll());
		ac.close();
		
	}
}
