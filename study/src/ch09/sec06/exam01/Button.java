package ch09.sec06.exam01;

public class Button {
    //정적 멤버 인터페이스
    public static interface ClickListener{
        //추상 메소드
        void onClick();
    }

    //필드
    //Button 클래스에서 ClickListener 인터페이스를 피드로 갖고 있다
    private ClickListener clickListener;

    //메소드
//    set 메소드에서는 ClickListener를 받아온 값으로 변경해준다 (DI)
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public void click(){
        this.clickListener.onClick();
    }
}
