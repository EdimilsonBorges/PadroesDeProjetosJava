package State;

public class TCPConnect {

    private TCPState tcpState;

    public TCPConnect(){
        this.tcpState = new TCPListen();
    }

    public void open(){
     tcpState.open();
    }

    public void close(){
      tcpState.close();
    }

    public void acknowledge(){
       tcpState.acknowledge();
    }

    public TCPState getTcpState() {
        return tcpState;
    }

    public void setTcpState(TCPState tcpState) {
        this.tcpState = tcpState;
    }
}
