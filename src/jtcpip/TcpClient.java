package jtcpip;

import java.io.IOException;
import java.net.Inet4Address;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by jooivind on 02.11.2015.
 */
public class TcpClient {
    private String address;
    private int port;
    private Socket socket;

    public TcpClient(String address, int port) throws UnknownHostException, IOException
    {
        socket = new Socket(Inet4Address.getByName(address), port);
    }
}
