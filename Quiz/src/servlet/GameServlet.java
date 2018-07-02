package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.GameData;
import model.GetGameDataLogic;

@WebServlet("/GameServlet")
public class GameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		String forwardPath = null;

		if(action.equals("getData")){
			GetGameDataLogic ggdl = new GetGameDataLogic();
			ArrayList<ArrayList<GameData>> gameData = ggdl.execute();
			HttpSession session = request.getSession();
			session.setAttribute("gameData", gameData);
			forwardPath = "/WEB-INF/jsp/GamePlay.jsp";
		}

		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPath);
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	}
}
