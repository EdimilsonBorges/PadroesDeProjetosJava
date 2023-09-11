package State;

public class TCPClosed implements TCPState {
    @Override
    public void open() {
        System.out.println("TCPClosed open - State");
    }

    @Override
    public void close() {
        System.out.println("TCPClosed close - State");
    }

    @Override
    public void acknowledge() {
        System.out.println("TCPClosed acknowledge - State");
    }
}
