package jtcpip.parser;

/**
 * Created by Jo Øivind Gjernes on 29.11.2015.
 *
 * MSGID 	GPGLL
 * Latitude	ddmm.mmmmm
 * N/Sindicator	N/S
 * Longitude	dddmm.mmmmm
 * E/W ind	E/W
 * utc pos	hhmmss.sss
 * STATUS	A/V (valid / not valid)
 * Checksum
 * (8)
 *
 */
public class GPGLL extends NMEA
{
	public GPGLL(String msgId) throws IllegalArgumentException
	{
		super(msgId);
	}
}
