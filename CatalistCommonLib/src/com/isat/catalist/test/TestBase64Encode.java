package com.isat.catalist.test;

import java.io.*;
import org.apache.commons.codec.binary.*;
import org.junit.*;

public class TestBase64Encode 
{
	@Test
	public void testBase64Encode() throws IOException
	{
		byte[] bt = Base64.decodeBase64(data.getBytes());
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Phincon\\Desktop\\data.txt");
		fos.write(bt);
		fos.close();
	}
}