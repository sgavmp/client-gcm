package com.javapapers.android.gcm.devicetodevice;

public interface Config {

	// used to share GCM regId with application server - using php app server
	//static final String APP_SERVER_URL = "http://192.168.1.17/gcm/gcm.php?shareRegId=1";

	// GCM server using java
	static final String APP_SERVER_URL = "URL DEL SERVIDOR/GCMNotification?";

	// Google Project Number
	static final String GOOGLE_PROJECT_ID = "ID del proyecto en GOOGLE";
	
	static final String REGISTER_NAME = "name";
	
	static final String MESSAGE_KEY = "message";
	static final String TO_NAME = "toName";	

}
