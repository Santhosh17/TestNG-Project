package com.auto.fileIO.propertiesClass.resourcebundle;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocaleDemo {
	public static void main(String[] args) {
		// L10N -- Localization
		// I18N -- Internationalization
		
		// Locale
		// ResourceBundle -> java.util
		
		String lang = "ka";
		String country = "IN";
		String fileLocation = "translations/Translate";// location should be inside resources folder (Ensure the resources folder 
		
		Locale l = new Locale(lang,country);
		ResourceBundle rb = ResourceBundle.getBundle(fileLocation,l);
		System.out.println(rb.getString("welcome"));
		System.out.println(rb.getString("hello"));
		
	}
}