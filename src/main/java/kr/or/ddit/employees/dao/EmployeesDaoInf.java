package kr.or.ddit.employees.dao;

import java.util.List;
import java.util.Map;

import kr.or.ddit.employees.model.EmployeesVo;
import kr.or.ddit.student.model.StudentVo;


public interface EmployeesDaoInf {
	/**
	 * 
	 * Method : selectAllStudents
	 * 최초작성일 : 2018. 7. 9.
	 * 작성자 : pc24
	 * 변경이력 :
	 * @return
	 * Method 설명 : 전체 정보를 조회한다.
	 */
	List<EmployeesVo> selectAllEmployees();
	
	
	/**
	 * 
	 * Method   : getStudentPageList 
	 * 최초작성일  : 2018. 7. 10. 
	 * 작성자 : PC06 
	 * 변경이력 : 
	 * @param map
	 * @return 
	 * Method 설명 :페이지 리스트 조회
	 */
	List<EmployeesVo> getEmployeesPageList(Map<String, Integer> map);
	
	
	/**
	 * 
	 * Method   : getStudentTotCnt 
	 * 최초작성일  : 2018. 7. 12. 
	 * 작성자 : PC06 
	 * 변경이력 : 
	 * @return 
	 * Method 설명 : 전체 건수 조회 
	 */
	int getStudentTotCnt();
}
