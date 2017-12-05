package net.hualisheng.www.web.filter;

import java.io.IOException;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.hualisheng.www.bean.Categroy;

/**
 * Servlet Filter implementation class FilterCategroy
 */
public class FilterCategroy implements Filter {

	public void destroy() {
		System.out.println("filter被销毁了");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request2=(HttpServletRequest) request;
		HttpServletResponse response2=(HttpServletResponse) response;
		System.out.println("FilterCategroy被执行了");
		HttpSession session = request2.getSession();
		List<Categroy> categroys = (List<Categroy>) session.getAttribute("categroys");
		System.out.println(categroys);
		if (categroys==null) {
			System.out.println(47567);
			request2.getRequestDispatcher("/WEB-INF/jsp/msg.jsp").forward(request2, response2);
			return;
		}
		chain.doFilter(request2, response2);
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("FilterConfig被创建了");
	}

}
