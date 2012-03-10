import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board extends JPanel implements ActionListener {
	Piece[][] board = new Piece[8][8];
	
	public Board() {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[0].length; j++) {
				int side = Piece.NONE;
				int type = Piece.NONE;
				if(j == 0 || j == 1) side = Piece.WHITE;
				if(j == 6 || j == 7) side = Piece.BLACK;
				if(j == 0 || j == 7)
					switch(i) {
						case 0: case 7: type = Piece.ROOK; break;
						case 1: case 6: type = Piece.KNIGHT; break;
						case 2: case 5: type = Piece.BISHOP; break;
						case 3: type = Piece.QUEEN; break;
						case 4: type = Piece.KING; break;
					}
				if(j == 1 || j == 6) type = Piece.PAWN;
					
				board[i][j] = new Piece(side, type, i, j);
			}
		}
	}

	public void paint(Graphics g) {
		int width = super.getWidth();
		int height = super.getHeight();
		int intervalWidth = width/8;
		int intervalHeight = height/8;
		boolean white = false;
		boolean starton = true;

		for(int i = 0; i < 8; i++) {
			white = starton;
			starton = !starton;
			for(int j = 0; j < 8; j++) {
				g.setColor((white)? Color.WHITE:Color.BLACK);
				white = !white;
				g.fillRect(i*intervalWidth, j*intervalHeight, intervalWidth, intervalHeight);
				if(board[i][j].getType() != Piece.NONE) {
					g.drawImage(board[i][j].getImage(),
						    (board[i][j].getX()*intervalWidth) + (intervalWidth/3),
						    (board[i][j].getY()*intervalHeight) + (intervalHeight/3),
						    null);
				}
			}
		}
	}

	public void updateBoard() {
		
	}

	public void actionPerformed(ActionEvent e) {
	    
	}
}
