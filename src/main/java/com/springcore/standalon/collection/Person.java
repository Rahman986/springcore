package com.springcore.standalon.collection;

import java.util.List;
import java.util.Map;

import com.sun.xml.internal.fastinfoset.sax.Properties;

public class Person {
private List<String> friends;
private Map<String,Integer>feestruture;
private Properties properties;

public List<String> getFriends() {
	return friends;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}


public Map<String, Integer> getFeestruture() {
	return feestruture;
}

public void setFeestruture(Map<String, Integer> feestruture) {
	this.feestruture = feestruture;
}


public Properties getProperties() {
	return properties;
}

public void setProperties(Properties properties) {
	this.properties = properties;
}

@Override
public String toString() {
	return "Person [friends=" + friends + ", feestruture=" + feestruture + "]";
}


}
