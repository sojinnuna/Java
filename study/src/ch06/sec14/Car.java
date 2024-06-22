package ch06.sec14;

public class Car {
    private int speed;
    private boolean stop;

//    speed 필드의 Getter/Setter 선언
//    getter와 setter를 만들어서 사용자가 직접 필드에 접근하지 못하도록 함
//    get와 set을
    public int getspeed(){
        return speed;
    }

    public void setSpeed(int speed) {
      if(speed < 0) {
          this.speed = 0;
          return;
      }else{
          this.speed = speed;
      }
    }
// stop 필드의 Getter/Setter 선언
public boolean isStop(){
        return stop;
}

public void setStop(boolean stop){
        this.stop = stop;
        if(stop == true) this.speed = 0;
}
}
