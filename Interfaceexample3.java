class Phone
{
    void call()
    {
        System.out.println("call someone");
    }
    void sms()
    {
        System.out.println("sms someone");
    }
}
interface Camera
{
    void click();
    void record();
}
interface Musicplayer
{
    void play();
    void stop();
}
class Smartphone extends Phone implements Camera,Musicplayer
{
   public void videocall()
    {
        System.out.println("Start the videocall");
    }
   public void click()
    {
        System.out.println("start the video call");
    }
   public void record()
    {
        System.out.println("start the recording");
    }
   public void play()
    {
        System.out.println("start the Musicplayer");
    }
    public void stop()
    {
        System.out.println("stop the Musicplayer");
    }
}

public class Main
{
	public static void main(String[] args) {
		Camera c=new Smartphone();
		c.record();
		c.click();
		Musicplayer m=new Smartphone();
		m.play();
		m.stop();
		Phone p=new Smartphone();
		p.call();
		p.sms();
	}
}
