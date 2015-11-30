package jtcpip.parser;

/**
 * Created by Jo Øivind Gjernes on 30.11.2015.
 *
 * MSGID 	- GPRMC
 * UTC TIME	- hhmmss.sss
 * Status	- A / V
 * Lat		- ddmm.mmmmm
 * N/S ind	- N/S
 * Long		- dddmm.mmmmm
 * E/W ind	- E/W
 * Speed ovg	- float/double	- knop
 * Course ovg	- 0-360.00 - degrees
 * Date		- ddmmyy
 * Magnetic var	- E or W - degrres
 * Checksum	-
 */
public class GPRMC extends NMEA
{
	public GPRMC(String msgId) throws IllegalArgumentException
	{
		super(msgId);
	}
}
