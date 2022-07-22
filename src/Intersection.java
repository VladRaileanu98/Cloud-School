import java.util.concurrent.Semaphore;

public class Intersection {
    private final Semaphore remoteControl; //remote control of the current traffic light
    private boolean goOn1;
    private boolean goOn2;

    public Intersection(){
        this.remoteControl = new Semaphore(1, true);
        this.goOn1 = true;
        this.goOn2 = false;
    }

    public void carStatus(int carId,
                           int directionId,
                           int roadId,
                           Runnable greenOn,
                           Runnable crossOn){
        String pole = "-";
        switch(directionId){ //defining the poles based on given direction
            case 1:
                pole = "Nord";break;
            case 2:
                pole = "South";break;
            case 3:
                pole = "West"; break;
            case 4:
                pole = "East"; break;
            default:
        }
        try{
            remoteControl.acquire();
            if((roadId==1 && goOn1)||(roadId==2 && goOn2)){
                crossOn.run();
                char road = '-';
                if(directionId==1 || directionId==2)
                    road='A';
                if(directionId==3 || directionId==4)
                    road='B';
                System.out.println("green on road"+road);
            }
            else
                if(roadId==1 && !goOn1){
                    greenOn.run();
                    goOn1=true;
                    goOn2=false;
                    crossOn.run();
                    char road='A';
                    System.out.println("car no."+carId+" passed the road "+road+" towards "+pole);
                }
                else
                if(roadId==2 && !goOn2){
                    greenOn.run();
                    goOn2=true;
                    goOn1=false;
                    crossOn.run();
                    char road='B';
                    System.out.println("car no."+carId+" passed the road "+road+" towards "+pole);
                }
            remoteControl.release();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
