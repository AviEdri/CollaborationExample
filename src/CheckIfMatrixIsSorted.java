
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
	public static int[][] changePosition(int[][] arr) {
		arr[1][1]+=5;
		return arr;
	}

	// �������� ���� ���� ���� ���� ���
	private static boolean isMatrixSorted(int row, int col, int[][] matrix) {
		if (row == matrix.length-1 && col == matrix[0].length-1) {
			return true;
		}
		
		if (col<matrix[0].length-1) {

			// ���� �� ����� ����� �����
			if (matrix[row][col] >= matrix[row][col+1]) {
				return false;
			}
			
			// ����� ����� ������� ������ ���� ���� ������ ����� ����
			return isMatrixSorted(row, col + 1, matrix); 
		}
		
		// ���� ���� ����� ���� ������ �������
		// ���, ����� �����, ����� ���� ��� ��� ���� �� ����
		if (matrix[row][col] >= matrix[row+1][0]) {
			return false;
		}
		
		// ��� ���� ������ �������, ������ ������ ���� ����� ��������
		// ��� ����� ����
		return isMatrixSorted(row + 1, 0, matrix);
	}

}
