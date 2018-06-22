package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GameDao {

	//QUIZテーヴルのデータを取得
	public String[][] quizList(){
		Connection conn = null;
		String[][] record;

		//データベースに接続
		try{
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection("jdbc:h2:~/test","sa","");

			Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			String sql = "SELECT * FROM QUIZ";
			ResultSet rs = stmt.executeQuery(sql);
			//行数取得
			rs.last();
			int rowNum = rs.getRow();

			rs.beforeFirst();
 			//列数取得
			int colNum = rs.getMetaData().getColumnCount();

			//行数、列数で配列初期化
			record = new String[rowNum][colNum];

			while(rs.next()){
				//各列にアクセスし、全てをStringに変換
			    Integer id = rs.getInt("ID");
			    String strId = Integer.toString(id);

			    String text = rs.getString("TEXT");

			    Integer ans = rs.getInt("ANSWER");
			    String strAns = Integer.toString(ans);

			    Integer level = rs.getInt("LEVEL");
			    String strLevel = Integer.toString(level);

			    String com = rs.getString("COMMENT");


			    //列番号に応じて取得したデータを格納
			    for(int i = 1; i < 6; i++){
			    	switch(i){
			    		case 1:
			    			record[rs.getRow() -1][0] = strId;
			    			break;
			    		case 2:
			    			record[rs.getRow() -1][1] = text;
			    			break;
			    		case 3:
			    			record[rs.getRow() -1][2] = strAns;
			    			break;
			    		case 4:
			    			record[rs.getRow() -1][3] = strLevel;
			    			break;
			    		case 5:
			    			record[rs.getRow() -1][4] = com;
			    			break;
			    		default:
			    			System.out.println("ああああああああ");
			    	}
			    }

			}
		}catch(SQLException e){
			e.printStackTrace();
			return null;
		}catch(ClassNotFoundException e){
			e.printStackTrace();
			return null;
		}finally{
			if(conn != null){
				try{
					conn.close();
				}catch(SQLException e){
				e.printStackTrace();
				return null;
				}
			}
		}
		return record;
	}
}
