package com.commentCon;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.commentDAO.commentDAO;
import com.commentDTO.commentDTO;
import com.google.gson.Gson;

@WebServlet("/commentCon")
public class commentCon extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int cnt = 0;
		ArrayList<commentDTO> list = new ArrayList<commentDTO>();
		request.setCharacterEncoding("utf-8");
		int tb_seq = Integer.parseInt(request.getParameter("tb_seq"));
		String commContent = request.getParameter("commContent");
		String mb_id = request.getParameter("mb_id");
		commentDAO commdao = new commentDAO();
		System.out.println(" 1 " + tb_seq);
		System.out.println(commContent);
		System.out.println(mb_id);

		cnt = commdao.addComment(tb_seq, commContent, mb_id);
		System.out.println(cnt);
		if (cnt > 0) {
			Gson gson = new Gson();
			commentDTO commdto = new commentDTO(commContent, mb_id);
			list.add(commdto);
			String json = gson.toJson(list);
			PrintWriter out = response.getWriter();
			response.setCharacterEncoding("utf-8");
			out.print(json);
		}

	}

}
