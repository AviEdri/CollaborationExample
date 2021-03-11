
public class FindWayInMaze {

	public static void main(String[] args) {

	}

	public static void findWayInMaze(boolean[][] maze) {
		findWayInMaze(0, 0, maze);		
	}

	private static boolean findWayInMaze(int row, int col, boolean[][] maze) {
		// רצף בדיקות של חריגה מגבולות המטריצה
		if (col<0) {
			return false;
		}

		if (row<0) {
			return false;
		}

		if (col == maze[0].length) {
			return false; 
		}

		if (row == maze.length) {
			return false;
		}
		// ------------------------------------------

		// אם הגעתי לקיר או למקום בו הייתי כבר
		if (maze[row][col] == false) {
			return false;
		}		

		// אם הגענו לנקודת היעד
		if (row == maze.length-1 && col == maze[0].length -1) {
			return true;
		}

		// אנחנו מרשים לעצמנו לשנות את מטריצת המבוך, על מנת לסמן איפה היינו
		// אם לא היה מותר לנו, היינו מעבירים מטריצה בוליאנית ומסמנים בה
		maze[row][col] = false;


		// אם הפניה מעלה, הפכה להיות חלק ממסלול שהוביל לנקודת היעד
		// נדפיס את התא הנוכחי
		// ונחזיר אמת לפו' שקראה לנו, על מנת לסמן גם לה שאנחנו חלק
		// ממסלול שהוביל אל היעד
	
		if (findWayInMaze(row - 1, col, maze) || findWayInMaze(row+1, col, maze) 
			|| findWayInMaze(row, col -1, maze) || findWayInMaze(row, col + 1, maze)) {
			System.out.println(row + "," + col);
			return true;
		}

		// אם אף מסלול אינו מוביל לנקודת הסיום נחזיר שקר
		return false;
	}
}
