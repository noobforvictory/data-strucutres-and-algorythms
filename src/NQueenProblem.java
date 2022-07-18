import java.util.ArrayList;

public class NQueenProblem {
	
	public static void addBoard(char[][] board, ArrayList<ArrayList<String>> allBoards) {
	   String row="";
		ArrayList<String> newBoard = new ArrayList ();
		for(int i=0; i<board.length; i++) {
			 row="";
			for(int j=0; j<board.length; j++) {
				if(board[i][j] == 'Q') {
					row+=board[i][j];
				}else {
					row+='.';
				}
			}
			newBoard.add(row);
		}
		allBoards.add(newBoard);
}
	public static boolean isSafe(int r, int col, char[][]board) {
		//vertical
		for(int i=0;i<board.length;i++) {
			if(board[i][col] == 'Q')return false;
			
		}
		
		//horizontal
		for(int i=0; i<board.length; i++) {
			if(board[r][i] == 'Q')return false;
			
		}
		// upward left
		int i =r;
		for(int j=col ; i>=0 && j>=0; i-- , j--) {
			if(board[i][j] == 'Q')return false;
			
		}
		// upward right
		i=r;
		for(int j=col; i>=0 && j<board.length; i--, j++) {
			if(board[i][j] == 'Q')return false;
			
		}
		//lower left
		i=r;
		for(int j=col; i<board.length && j>=0; i++, j--) {
			if(board[i][j]=='Q')return false;
			
		}
		//lower right
		i=r;
		for(int j=col; i<board.length && j<board.length; i++,j++) {
			if(board[i][j]=='Q')return false;
			
		}
		return true;
	}
	public static void helper(char[][]board, ArrayList<ArrayList<String>> allBoards, int col) {
		if(col == board.length) {
			addBoard(board,allBoards);
			return;
		}
		for(int r=0; r<board.length; r++) {
			if(isSafe(r,col,board)) {
				board[r][col]='Q';
				helper(board, allBoards, col+1);
				board[r][col]='.';
			}
		}
	}
	public static ArrayList<ArrayList <String>> allBoards = new ArrayList ();
public static void solveNQueen(int n){
	
	char[][] board = new char[n][n];
	helper(board, allBoards,0);
}
	public static void main(String[] args) {
		solveNQueen(n);
		

	}

}
