package test;

import dao.GameDao;


public class GameTest {

	public static void main(String[] args) {
		testCreateRecord();
	}

	public static void testCreateRecord(){
		GameDao dao = new GameDao();
		String[][] result = dao.quizList();
		for(int i = 0; i < result.length; i++){
			for(int j = 0; j < 5; j++){
				System.out.println(result[i][j]);
			}
		}
	}
}
