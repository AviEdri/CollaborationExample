
public class CheckIfMatrixIsSorted {

	public static void main(String[] args) {
		int[][] matrix = new int[2][2];
		matrix[0][0] = 3;
		matrix[0][1] = 5;
		matrix[1][0] = 87;
		matrix[1][1] = 100;
		
		System.out.println(isMatrixSorted(matrix));
	}

	private static boolean isMatrixSorted(int[][] matrix) {
		return isMatrixSorted(0,0, matrix);
	}

	// שרירותית נחפש מיון בסדר עולה ממש
	private static boolean isMatrixSorted(int row, int col, int[][] matrix) {
		if (row == matrix.length-1 && col == matrix[0].length-1) {
			return true;
		}
		
		if (col<matrix[0].length-1) {

			// בודק אם מצאתי כשלון במיון
			if (matrix[row][col] >= matrix[row][col+1]) {
				return false;
			}
			
			// המערך עדיין מבחינתי ממויין ולכן צריך להמשיך לבדוק הלאה
			return isMatrixSorted(row, col + 1, matrix); 
		}
		
		// הגעה לכאן אומרת שאני בעמודה האחרונה
		// שוב, נבדוק כשלון, כלומר שהתא הבא קטן יותר או שווה
		if (matrix[row][col] >= matrix[row+1][0]) {
			return false;
		}
		
		// אני נמצא בעמודה האחרונה, ועדיין ממויין ולכן נמשיך ברקורסיה
		// תוך ירידת שורה
		return isMatrixSorted(row + 1, 0, matrix);
	}

}
