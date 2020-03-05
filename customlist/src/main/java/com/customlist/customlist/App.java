package com.customlist.customlist;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.customlist.customlist.App;
/**
 * Hello world!
 *
 */
public class App 
{
	private static final Logger LOGGER = LogManager.getLogger(App.class);
    public static void main( String[] args ) throws Exception{
    	CustomList<Integer> integerList= new CustomList<Integer>();
    	integerList.add(0);
    	integerList.add(1);
    	integerList.add(2);
    	integerList.add(3);
    	integerList.add(4);
		LOGGER.debug("The size of the custom list is : "+integerList.size());
		integerList.remove(4);
		LOGGER.debug("The size of the custom list is : "+integerList.size());
		LOGGER.debug("The element at index 1 is : "+integerList.get(1));
		CustomList<String> stringList =new CustomList<String>();
		stringList.add("java");
		stringList.add("programming");
		LOGGER.debug(stringList.get(0)+" "+stringList.get(1));
    }
}
