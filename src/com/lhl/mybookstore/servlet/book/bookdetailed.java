package com.lhl.mybookstore.servlet.book;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lhl.mybookstore.bean.Book;
import com.lhl.mybookstore.dao.BookDao;
import com.lhl.mybookstore.dao.impl.BookDaoImpl;


@WebServlet("/bookdetail")
public class bookdetailed extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String DETAIL_PATH="jsp/book/bookdetails.jsp";

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int bookId = Integer.parseInt(request.getParameter("bookId"));
		BookDao bd = new BookDaoImpl();
		request.setAttribute("bookInfo", bd.findBookById(bookId));
		request.getRequestDispatcher(DETAIL_PATH).forward(request, response);

	}

}
