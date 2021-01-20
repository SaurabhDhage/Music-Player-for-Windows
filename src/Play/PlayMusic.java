package Play;
import java.io.FileInputStream;
import javazoom.jl.player.Player;
public class PlayMusic {

	void Play()
	{
	try {
		SelectPath s1=new SelectPath();
		String path=s1.getPath();
		System.out.println("Now Playing " +path);
	    FileInputStream audio=new FileInputStream(path);
	    Player player=new Player(audio);
	    player.play();
	   
		}
	catch(Exception e)
		{
	System.out.println(e);	
	    }

}
}
