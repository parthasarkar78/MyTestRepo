package com.isat.catalist.test;

import java.io.*;
import org.apache.xmlbeans.*;
import org.junit.*;
import com.evolving.schema.tertio.featureSet.agentEPTInterface.x13.*;

public class TestEptResponse 
{
	@Test
	public void test() throws XmlException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\phincon\\Desktop\\eptresponse.txt");
		EptResponseMinsatType ept = EptResponseMinsatType.Factory.parse(fis);
		System.out.println( ept.getEptResponse().getAuxiliaryData().getFeatureSet().getParsedResponse().getAttributeList());
	}
}
