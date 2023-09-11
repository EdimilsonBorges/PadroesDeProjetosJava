package Bridge;

public abstract class Window {

    private WindowImp windowImp;

    public void drawRect(){
        windowImp.devDrawLine();
        windowImp.devDrawLine();
        windowImp.devDrawLine();
        windowImp.devDrawLine();
    }

    public void drawText(){
     windowImp.devDrawText();
    }

    public WindowImp getWindowImp() {
        return windowImp;
    }

    public void setWindowImp(WindowImp windowImp) {
        this.windowImp = windowImp;
    }
}
