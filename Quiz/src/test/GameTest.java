package test;

import java.util.ArrayList;

import dao.GameDao;
import model.GameData;


public class GameTest {


	public static void main(String[] args) {
		testCreateRecord();
	}

	public static void testCreateRecord(){
		GameDao dao = new GameDao();
		ArrayList<ArrayList<GameData>> result = dao.quizList();
		for(int i = 0; i < 4; i++){
			for(int j = 0; j < result.get(i).size(); j++){
				GameData data = result.get(i).get(j);
				System.out.print(data.getId() + " ");
				System.out.print(data.getText() + " ");
				System.out.print(data.getAnswer() + " ");
				System.out.print(data.getLevel() + " ");
				System.out.print(data.getComment() + " ");
				System.out.println(" ");
			}
		}
	}
}
