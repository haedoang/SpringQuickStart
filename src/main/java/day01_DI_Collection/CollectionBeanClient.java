package day01_DI_Collection;

import java.util.Properties;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		AbstractApplicationContext factory =
				new GenericXmlApplicationContext("applicationContext.xml");
		CollectionBean bean =(CollectionBean)factory.getBean("collectionBean");
		//List<String> addressList = bean.getAddressList();
		//Set<String> addressList = bean.getAddressList();
		/*for(String address : addressList) {
			System.out.println(address);
		}*/
		//Map<String,String> addressList = bean.getAddressList();
		/*for(String key : addressList.keySet()) {
			System.out.printf("key:%s value:%s\n",key,addressList.get(key));
		}*/
		
		Properties addressList = bean.getAddressList();
		for(Object key : addressList.keySet()) {
		
			System.out.printf("key:%s value:%s\n",key,addressList.get(key));
		}
		
		
		factory.close();
	}
}
