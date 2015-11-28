package jtcpip.parser;

/**
 * Created by Jo Øivind Gjernes on 28.11.2015.
 */
public class Parser
{
	public static String[] extractArgs(String gpsLine)
	{
		if(gpsLine.charAt(0)!='$') return null;
		String[] split = gpsLine.split(",");
	}
}
