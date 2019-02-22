package day01_DI_Collection;

import java.util.Properties;

public class CollectionBean {
	//Collection 객체 사용 
	
	//1) List
	/*private List<String> addressList;
	
	public void setAddressList(List<String> addressList) {
		this.addressList=addressList;
	}

	
	public List<String> getAddressList() {
		return addressList;
	}
*/	
	//2) set key의 중복을 제거한다.
/*	private Set<String> addressList;

	public Set<String> getAddressList() {
		return addressList;
	}

	public void setAddressList(Set<String> addressList) {
		this.addressList = addressList;
	}*/
	//3) map.
/*	private Map<String,String> addressList;

	public Map<String, String> getAddressList() {
		return addressList;
	}

	public void setAddressList(Map<String, String> addressList) {
		this.addressList = addressList;
	}*/
	//4) properties key= value 형태.
	private Properties addressList;
	
	public Properties getAddressList() {
		return addressList;
	}

	public void setAddressList(Properties addressList) {
		this.addressList = addressList;
	}
	
	
	
}
