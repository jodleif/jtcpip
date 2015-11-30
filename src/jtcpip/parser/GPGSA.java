package jtcpip.parser;

/**
 * Created by Jo Øivind Gjernes on 30.11.2015.
 *
 * Msg id 	- GPGSA
 * Mode1	- M / A - Manual forced to 2d or 3d / Automatic 2d switch 2d/3d
 * Mode2 	- 1,2,3 - No fix, 2d, 3d
 * Sat used(1) 	-
 * ..
 * Sat used(12) -
 * PDOP		- 	- Pos dilituoon of prec
 * HDOP		-	- Horiz dop
 * VDOP		-	- vert dop
 * Checksum
 *
 *
 */
public class GPGSA extends NMEA
{
	public GPGSA(String msgId) throws IllegalArgumentException
	{
		super(msgId);
	}
}
