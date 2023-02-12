package com.diaryprj.web.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.diaryprj.web.entity.Anounce;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/mainpage")
public class AnoPrintService extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String USERNAME = "root";
		String PASSWORD = "6zkfmvpDdpa7";
		String URL = "jdbc:mysql://localhost:3306/diary?characterEncoding=utf8";
		String sql = "select * from ano_view";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			PreparedStatement stat = con.prepareStatement(sql);
			ResultSet rs = stat.executeQuery();
			
			List<Anounce> ano = new ArrayList<Anounce>();
			while(rs.next()){
				String context = rs.getString("ano_contxt");
				Date date = rs.getDate("wr_date");
				
				Anounce a = new Anounce(context, date);
				
				ano.add(a);
			}

			req.setAttribute("AnoList", ano);;
			
			rs.close();
			stat.close();
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("DB error");
			e.printStackTrace();
		}
		
		req.getRequestDispatcher("/html/share/main.jsp").forward(req, res);
	}
}
