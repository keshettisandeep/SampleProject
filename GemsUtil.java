package com.paypal.csp.infra.util;
import weblogic.security.internal.SerializedSystemIni;
import weblogic.security.internal.encryption.ClearOrEncryptedService;
import weblogic.security.internal.encryption.EncryptionService;

public class GemsUtil {
	/**
	 * Decrypt text in AES encrypted format using testing git hub for merge conflicts

	 */
	
	Fuck you darling
	/**
	 * @param encryptedString
	 * @return decryptedString
	 */
	public static String decryptProperty(String encryptedString){
		if(encryptedString == null)
			return null;
 		String decryptedString = null;	
			EncryptionService wlEncryptionService = SerializedSystemIni.getExistingEncryptionService();
			if (wlEncryptionService != null){
				ClearOrEncryptedService clearOrEncryptedService  = new ClearOrEncryptedService(wlEncryptionService);
				decryptedString = clearOrEncryptedService.decrypt(encryptedString);
			}
		return decryptedString;		
	}
	
	/*
	 * This method used to replace the hyphens with underscores in a string
	 */
	public String replaceHyphensWithUnderscore(String key){
		if(key.contains("-"))
		{
			key = key.replace("-", "_");
		}
		return key;
	}
}
