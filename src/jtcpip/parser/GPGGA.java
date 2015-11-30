package jtcpip.parser;

/**
 * Created by Jo Øivind Gjernes on 29.11.2015.
 *
 * Felter
 * Message ID - GPGGA
 * UTCTime - hhmmss.sss
 * Latitude - ddmm.mmmmm
 * N/S indicator - N or S
 * Longitude - dddmm.mmmmm
 * E/W indicator - E or W
 * Position Fix Indicator - 0 (not avail) 1 (gps sps mode) 2 (dgps valid) 3 (gps pps valid)
 * Sattelites used - 0-12
 * HDOP - 1.0 horizontal dilution of precision
 * MSL Altitude 9 (meter)
 * UNITS - M - meter
 * Geoid Separation - - meter
 * Units - M - meter
 * Age of diff. corr  - - NULL når DGPS ikke brukt
 * Diff. Ref. StationID - 0000
 * (Checksum)
 * 15(16) felter
 */

public class GPGGA extends NMEA
{
	public GPGGA(String msgId) throws IllegalArgumentException
	{
		super(msgId);
	}
}
