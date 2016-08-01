package com.isat.catalist.oms.transformer;

import java.util.*;
import org.apache.xmlbeans.*;
import com.indosat.catalist.oos.master.*;
import com.isat.catalist.common.*;
import com.isat.catalist.oms.exception.*;
import com.isat.catalist.oms.order.*;

public interface OLITransformer
{
	final static ThreadSafeDateFormat siebelDF = new ThreadSafeDateFormat("MM/dd/yyyy HH:mm:ss");
	final static ThreadSafeDateFormat oosDF = new ThreadSafeDateFormat("yyyy-MM-dd HH:mm:ss");
	final static ThreadSafeDateFormat timeOOSDF = new ThreadSafeDateFormat("HH:mm:ss");
	final static ThreadSafeDateFormat dateOOSDF = new ThreadSafeDateFormat("yyyy-MM-dd");
	final static ThreadSafeDateFormat dateSiebelDF = new ThreadSafeDateFormat("dd/MM/yyyy");

	void transform(List<OOSOrderLineItemType> oli, OOSOrderConstructionType constr, Map<String, String> orderValues, XmlObject input) throws TransformationException;
	void transformOutput(OOSOrderLineItemType li, XmlObject output);
}
