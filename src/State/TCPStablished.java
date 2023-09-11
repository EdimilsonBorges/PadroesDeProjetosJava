package State;

public class TCPStablished implements TCPState{
    @Override
    public void open() {
        System.out.println("TCPStablished open - State");
    }

    @Override
    public void close() {
        System.out.println("TCPStablished close - State");
    }

    @Override
    public void acknowledge() {
        System.out.println("TCPStablished acknowledge - State");
    }
}
