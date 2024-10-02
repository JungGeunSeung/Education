package emp2.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import emp2.dao.EmpPageDAO;

public class EmpPageService {

	public Map getEmpPage(String countPerPage, String page) {
		int count = Integer.parseInt(countPerPage);
		int pageNo = Integer.parseInt(page);
		
		int start = ((pageNo -1)* count) +1;
		int end = pageNo * count;
		
		EmpPageDAO dao = new EmpPageDAO();
		int totalCount = dao.totalEmpPage();
		List list = dao.selectEmpPage(start, end);
		
		Map map = new HashMap();
		map.put("list", list);
		map.put("totalCount", totalCount);
		return map;
	}
	
	
}
