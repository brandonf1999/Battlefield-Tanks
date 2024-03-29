import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Miss extends JPanel 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int player;

	public Miss(int player)
	{
		this.player = player;
		setSize(900, 700);
		setOpaque(false);
	}

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		URL rightURL = null;
		switch (player)
		{
		case(0):
			rightURL = this.getClass().getResource("imgg/Miss Computer.png");
			break;
		
		case(1):
			rightURL = this.getClass().getResource("imgg/Miss Player.png");
			break;
		}
		BufferedImage rightI = new BufferedImage(900, 700, BufferedImage.TYPE_INT_ARGB);
		try
		{
			
			rightI = ImageIO.read(rightURL);

		} catch (IOException e)
		{
			e.printStackTrace();
		}
		g.drawImage(rightI, 0, 0, null);
	}
}
