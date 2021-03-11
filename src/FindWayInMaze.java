
public class FindWayInMaze {

	public static void main(String[] args) {

	}

	public static void findWayInMaze(boolean[][] maze) {
		findWayInMaze(0, 0, maze);		
	}

	private static boolean findWayInMaze(int row, int col, boolean[][] maze) {
		// ��� ������ �� ����� ������� �������
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

		// �� ����� ���� �� ����� �� ����� ���
		if (maze[row][col] == false) {
			return false;
		}		

		// �� ����� ������ ����
		if (row == maze.length-1 && col == maze[0].length -1) {
			return true;
		}

		// ����� ����� ������ ����� �� ������ �����, �� ��� ���� ���� �����
		// �� �� ��� ���� ���, ����� ������� ������ �������� ������� ��
		maze[row][col] = false;


		// �� ����� ����, ���� ����� ��� ������ ������ ������ ����
		// ����� �� ��� ������
		// ������ ��� ���' ����� ���, �� ��� ���� �� �� ������ ���
		// ������ ������ �� ����
	
		if (findWayInMaze(row - 1, col, maze) || findWayInMaze(row+1, col, maze) 
			|| findWayInMaze(row, col -1, maze) || findWayInMaze(row, col + 1, maze)) {
			System.out.println(row + "," + col);
			return true;
		}

		// �� �� ����� ���� ����� ������ ����� ����� ���
		return false;
	}
}
