package program1;

public class TV 
{
    private int Channel = 120;
    private int Volumelevel = 7;
    private boolean On = true;
    
    private int current_channel = 1;
    private int current_volume = 1;

    public TV()
    {
    }
    public TV(int ch,int volume,boolean on)
    {
        Channel = ch;
        Volumelevel = volume;
        On =on;
    }
    public TV(int ch,int volume,boolean on,int cur_ch,int cur_vol)
    {
        Channel = ch;
        Volumelevel = volume;
        On =on;
        current_channel =cur_ch;
        current_volume = cur_vol;
    }
    public void turn_on()
    {
        On = true;
    }
    public void turn_off()
    {
        On = false;
    }
    public void setChannel(int new_ch)
    {
        Channel +=new_ch;
    }
    public void setVolume(int new_volume)
    {
        Volumelevel += new_volume;
    }
    public void ChannelUP()
    {
        if(current_channel == Channel)
            current_channel =1;
        else
        {
            currnet_Channel();
            current_channel ++;
        }
    }
    public void ChannelDown()
    {
        if(current_channel == 1)
            current_channel = Channel;
        else
        {
            currnet_Channel();
            current_channel --;
        }
    }
    public void VolumeUP()
    {
        if(current_volume == Volumelevel);

        else
        {
            currnet_Volume();
            current_volume ++;
        }
    }
    public void VolumeDown()
    {
        if(current_volume == 0);
        
        else
        {
            currnet_Volume();
            current_volume --;
        }
    }
    public int currnet_Channel()
    {
        return current_channel; 
    }
    public int currnet_Volume()
    {
        return current_volume;
    }
    
    public void result()
    {
        System.out.println("The number of Channel = " +Channel);
        System.out.println("The number of Volume = " +Volumelevel);
        
        if(On==true)
            System.out.println("The TV is open");
        else
            System.out.println("The TV is close");        
    
       System.out.println("The Current Channel : " +currnet_Channel()); 
       System.out.println("The Current Volume : " +currnet_Volume()); 
    }
}