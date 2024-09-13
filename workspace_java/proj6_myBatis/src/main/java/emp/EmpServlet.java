package emp;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/emp")
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		EmpDAO dao = new EmpDAO();
		
		List list = dao.selectEmp();
		
		System.out.println("doGet의 list : " + list);
		
		List<Map> listMap = dao.selectAllEmpMap();
		
		System.out.println("doGet의 listMap의 ename : " + listMap.get(0).get("ENAME"));
		
		EmpDTO dto = dao.selectOneEmp();
		System.out.println(dto);
		
		int total = dao.totalEmp();
		System.out.println("doGet의 total : " + total);
		
		String str = dao.selectEnameEmp();
		System.out.println("str : " + str);
		
		dto = new EmpDTO();
		dto.setEname("scott12345");
		dto.setSal(555);
		dto.setEmpno(7788);
		
		int result = dao.updateEmp(dto);
		System.out.println("update 결과 : " + result);
		
		dto = new EmpDTO();
		dto = dao.selectEmpByEname("KING");
		System.out.println("dto : " + dto);
		
		
		
	}
}
