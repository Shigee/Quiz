package model;

import java.util.ArrayList;

import dao.GameDao;

public class GetGameDataLogic {

	public ArrayList<ArrayList<GameData>> execute(){
		GameDao dao = new GameDao();
		ArrayList<ArrayList<GameData>> gameData = dao.quizList();
		return gameData;
	}

}
