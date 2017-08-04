import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.util.Date;
import java.util.Timer;

public class test 
{
    public static void main()
    {
        File sound = new File("C:\\Users\\David\\Desktop\\ton.wav");
        File sound2 = new File("C:\\Users\\David\\Desktop\\brah.wav");
        PlaySound(sound,sound2);
        
       
    }
    
    static void PlaySound(File Sound,File Sound2)
    {
        
        try{
        
        Clip clip = AudioSystem.getClip();
        clip.open(AudioSystem.getAudioInputStream(Sound));
      
        
        Clip clip2 = AudioSystem.getClip();
        clip2.open(AudioSystem.getAudioInputStream(Sound2));
        
        clip.start();
        clip2.loop(5);
       
        
        new java.util.Timer().schedule( 
        new java.util.TimerTask() {
            @Override
            public void run() {
                clip.stop();
                clip2.stop();
            }
        }, 
        5000 
        );
        
    }catch(Exception e)
        {
            
        }
    }
    
    
}
