package cn.tedu.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.tedu.ssm.bean.Dept;
import cn.tedu.ssm.service.IDeptService;

@Controller
@RequestMapping("/dept")
public class DeptController {
	
	@Resource
	private IDeptService deptService;
	
	@RequestMapping("/showAddDept.do")
	public String showAddDept(){
		System.out.println("showAddDept方法");
		return "addDept";
	}
	
	@RequestMapping("/addDept.do")
	public String addDept(String deptName,String deptLoc){
		//将用户输入的信息封装到Dept对象中
		Dept dept = new Dept();
		dept.setDeptName(deptName);
		dept.setDeptLoc(deptLoc);
		//调用业务层方法
		deptService.addDept(dept);
		return "index";
	}
	
	@RequestMapping("/getAll.do")
	public String showAll(ModelMap map){
		List<Dept> depts = deptService.showAllDept();
		map.addAttribute("depts", depts);
		return "showAll";
	}
}
