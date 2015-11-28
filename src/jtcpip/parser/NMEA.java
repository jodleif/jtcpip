package jtcpip.parser;

/**
 * Created by Jo Øivind Gjernes on 28.11.2015.
 *
 *
 *
 */
public abstract class NMEA
{
	public static final String[]
			validIds = { "GPGGA", // GGA - Global positioning system fixed data
			"GPGLL", // GLL geographic position latitude/longitude
			"GPGSA", // GSA-GNSS - DOP and Active Satellites
			"GPGSV", // GSV-GNSS - Satellites in view
			"GPRMC", // RMC-Recommended minimum specific GNSS data
			"GPVTG" // VTG - Course over ground and ground speed
	};

	String msgId;
	public NMEA(String msgId) throws IllegalArgumentException
	{
		if(!checkValid(msgId)) throw new IllegalArgumentException("GPS-Code not valid: " + msgId);
		this.msgId = msgId;
	}

	private boolean checkValid(String msgId)
	{

		for(String s : validIds){
			if(s.equals(msgId)) return true;
		}
		return false;
	}
}
