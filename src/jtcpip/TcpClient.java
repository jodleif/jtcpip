package jtcpip;

import java.io.*;
import java.net.Inet4Address;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

/**
 * Created by jooivind on 02.11.2015.
 */
public class TcpClient
{
	private Socket socket;

	public TcpClient()
	{
		socket = new Socket();
	}

	public TcpClient(String address, int port)
	{
		socket = new Socket();
		try {
			SocketAddress sock = new InetSocketAddress(Inet4Address.getByName(address), port);
			connect(sock);
		} catch (Exception e) {

		}
	}

	public boolean connect(SocketAddress address)
	{
		try {
			socket.setKeepAlive(true);
			socket.connect(address);
			return true;
		} catch (Exception e) {
			System.err.println("[TcpClient]: Error connectiong!");
		}
		return false;
	}

	public boolean isConnected()
	{
		return socket.isConnected();
	}

	public void disconnect()
	{
		try {
			socket.close();
		} catch (Exception e) {
			System.err.println("[TcpClient]: Error disconnecting!");
		}
	}

	public OutputStream getOutputStream() throws IOException
	{
		if (isConnected()) {
			return socket.getOutputStream();
		}
		return null;
	}

	public BufferedReader getBufferedReader() throws IOException
	{
		if(isConnected()){
			return new BufferedReader(new InputStreamReader(getInputStream()));
		}
		return null;
	}

	public InputStream getInputStream() throws IOException {
		if(isConnected()){
			return socket.getInputStream();
		}
		return null;
	}
}
