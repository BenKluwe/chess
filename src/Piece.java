import javax.imageio.ImageIO;
import java.io.File;
import java.awt.image.BufferedImage;
import java.awt.Image;

public class Piece {
	public final static int NONE = 0;
	public final static int PAWN = 1;
	public final static int KNIGHT = 2;
	public final static int BISHOP = 3;
	public final static int ROOK = 4;
	public final static int QUEEN = 5; 
	public final static int KING = 6;
	
	public final static int WHITE = 1; 
	public final static int BLACK = 2;
	
	private Image img;
	private int x;
	private int y;
	private int type;
	private int side;
	
	private Piece(){};

	public Piece(int side, int type, int x, int y) {
		this.type = type;
		this.side = side;
		this.x = x;
		this.y = y;
		
		String tmp = "";
		
		switch(side) {
			case WHITE: tmp+="white"; break;
			case BLACK: tmp+="black"; break;
		}

		switch(type) {
			case PAWN:   tmp += "_pawn";   break;
			case KNIGHT: tmp += "_knight"; break;
			case BISHOP: tmp += "_bishop"; break;
			case ROOK:   tmp += "_rook";   break;
			case QUEEN:  tmp += "_queen";  break;
			case KING:   tmp += "_king";   break;
		}
		try {
			img = ImageIO.read(new File("../png/Set1/" + tmp + ".png"));
		}
		catch(Exception e) {}
	}
	
	public void setX(int x) { this.x = x; }
	public void setY(int y) { this.y = y; }
	public int getX() { return x; }
	public int getY() { return y; }
	public int getType() { return type; }
	public int getSide() { return side; }
	public Image getImage() { return img; }
}
