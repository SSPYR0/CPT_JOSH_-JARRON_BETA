package TileMap;

import java.awt.image.BufferedImage;

public class Tile 
{
	private BufferedImage image;
	private int tileType;
	
	//tile type 
	public static final int NORMAL = 0;
	public static final int BLOCKED = 1;
	
	public Tile(BufferedImage image,int tileType)
	{
		this.image = image;
		this.tileType = tileType;
	}
	
	public BufferedImage getImage() {return image;}
	public int getType() {return tileType;}

	
}
