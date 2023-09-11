package State;

public class TCPListen implements TCPState{
    @Override
    public void open() {
        System.out.println("TCPListen open - State");
    }

    @Override
    public void close() {
        System.out.println("TCPListen close - State");
    }

    @Override
    public void acknowledge() {
        System.out.println("TCPListen acknowledge - State");
    }
}
