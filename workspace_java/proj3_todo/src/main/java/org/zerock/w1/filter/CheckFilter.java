package org.zerock.w1.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

// 어노텐션
@WebFilter("/*") //서블릿을 실행하기전에 먼저 실행된다
public class CheckFilter implements Filter {

    public CheckFilter() {
    }

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		// 서블릿 실행 전 처리할수 있는 영역
		long before = System.currentTimeMillis();
		System.out.println("doFilter 실행전");
		
		// 한글 인코딩
		request.setCharacterEncoding("utf-8"); // 들어오는 모든걸 인코딩
		
		// filter의 dofilter에서의 전달인자는 servlet에서 사용하던
		// HttpServletRequest를 부모형태로 캐스팅 한 변수를 사용하고 있어서
		// 필요한 메소드를 실행하기 위해 자식형태로 (HttpServletRequest) 형변환
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		
		// getServletPath 세션 주소를 구하는 메소드
		System.out.println("getServletPath : "+req.getServletPath());
		
		// 세션없이 통과하는 주소
		// 세션이 있어야 통과하는 주소
		
		if(isExclue(req.getServletPath())) {
			System.out.println("세션없이 진행");
			
			// assets이 아닌 servlet은 응답시 인코딩
			if(req.getServletPath().indexOf("/assets/") == -1) {
				response.setContentType("text/html; charset=utf-8;");
			}
			
			chain.doFilter(request, response);
		} else if("/session/mypage".equals( req.getServletPath() )){
			// 세션을 점검해서
			HttpSession session = req.getSession();
			Boolean isLogon = (Boolean) session.getAttribute("isLogon");
			if(isLogon != null && isLogon == true) {
				// 로그인 되어 있는 경우에만 통과
				System.out.println("로그인 확인 통과");
				chain.doFilter(request, response);
			} else {
				// 그렇지 않으면 다른페이지로 이동
				resp.sendRedirect(req.getContextPath() + "/session");
				System.out.println("로그인 미확인 통과불가능");
			}
		}
		
		
		
		
		// 서블릿 실행 후 처리하는 영역
		System.out.println("doFilter 실행후");
		long after = System.currentTimeMillis();
		
		System.out.println("소요시간(ms) : " + (after - before));
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("필터 init 실행");
	}
	
	private boolean isExclue(String servletPath) {
		if(    "/login".equals(servletPath) 
			|| "/logout".equals(servletPath) 
			|| !"/session/mypage".equals(servletPath)) 
		{
			return true;
		} else {
			return false;
		}
	}

}
