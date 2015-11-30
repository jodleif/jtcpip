package jtcpip.parser;

import java.util.IllegalFormatException;

/**
 * Created by Jo Øivind Gjernes on 28.11.2015.
 */
public class Parser
{
	public static String[] extractArgs(String gpsLine) throws IllegalArgumentException
	{
		if(gpsLine.charAt(0)!='$') return null;
		int[] points = findLimits(gpsLine);
		String toSplit = gpsLine.substring(points[0],points[1]);
		String[] split = toSplit.split(",");

		return split;
	}

	public static int[] findLimits(String str) throws IllegalArgumentException
	{
		int point1 = 0;
		int point2 = 0;
		for(int i=0;i<str.length();++i){
			if(str.charAt(i)=='$') {
				point1=i+1;
				break;
			}
		}
		for(int i=str.length()-1;i>0;--i){
			if(str.charAt(i)=='*'){
				point2=i;
				break;
			}
		}
		if(point1==0||point2==0) throw new IllegalArgumentException("Didnt find limits");
		return new int[] {point1,point2};
	}
}
