package kr.or.ddit.employees.dao;

import java.util.List;
import java.util.Map;

import kr.or.ddit.employees.model.EmployeesVo;
import kr.or.ddit.mybatis.SqlMapSessionFactory;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class EmployeesDao implements EmployeesDaoInf{
	
	private SqlSessionFactory sqlSessionFactory = SqlMapSessionFactory.getSqlSessionFactory(); 

	@Override
	public List<EmployeesVo> selectAllEmployees() {
		SqlSession session = sqlSessionFactory.openSession();
		session.close(); 
		return null;
	}

	@Override
	public List<EmployeesVo> getEmployeesPageList(Map<String, Integer> map) {
		SqlSession session = sqlSessionFactory.openSession();
		session.close(); 
		return null;
	}

	@Override
	public int getStudentTotCnt() {
		SqlSession session = sqlSessionFactory.openSession();
		session.close(); 
		return 0;
	}

}
