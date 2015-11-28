package jtcpip;

import java.io.*;
import java.util.stream.Stream;

/**
 * Created by Jo Øivind Gjernes on 28.11.2015.
 */
public class main
{

	static boolean print_string(String s)
	{
		if(s==null) return false;
		System.out.println(s);
		return true;
	}
	public static void main(String[] args)
	{
		TcpClient tcp = new TcpClient("192.168.3.7", 1234);

		OutputStream out;
		InputStream in;
		try {
			in = tcp.getInputStream();
			out = tcp.getOutputStream();
			BufferedWriter bfrW = new BufferedWriter(new OutputStreamWriter(out));
			BufferedReader bfrR = new BufferedReader(new InputStreamReader(in));

			while(tcp.isConnected()){
				print_string(bfrR.readLine());
				bfrR.ready();
				//System.out.println("WRITING TO SERVER");
				bfrW.write("OK");
				bfrW.flush();
				//System.out.println("FLUSHED");
			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
