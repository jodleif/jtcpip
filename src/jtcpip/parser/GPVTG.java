package jtcpip.parser;

/**
 * Created by Jo Øivind Gjernes on 30.11.2015.
 *
 * MSGID	- GPVTG
 * Course	- 309.62	deg
 * Ref		- T
 * Course	- 		deg
 * Reference	- M		Magnetic
 * Speed	- 0.13		knots
 * Units	- N		knots
 * Speed	- 0.2
 * Units	- K		km / h
 * checksum
 *
 *
 */
public class GPVTG extends NMEA
{
	public GPVTG(String msgId) throws IllegalArgumentException
	{
		super(msgId);
	}
}
