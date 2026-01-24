public class Television {

    private int channel = 1;
    private boolean on = false;

    //setter
    public void setChannel(int channel){
        if(channel > 10){
            this.channel = 1;
        }else if(channel < 1){
            this.channel = 10;
        }else this.channel = channel;
    }

    //getters
    public int getChannel(){
        return channel;
    }

    public boolean isOn(){
        return on;
    }
    //on/off button
    public void pressOnOff(){
        on = !on;
    }

}



