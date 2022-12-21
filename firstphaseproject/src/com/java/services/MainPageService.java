package com.java.services;

import com.java.pages.FileOptions;
import com.java.pages.MainPage;
import com.java.pages.WelcomePage;
import com.java.units.Directory;


public class MainPageService {
	
	//static Directory dir = new Directory();
	
	
	
	public static WelcomePage WelcomeScreen = new WelcomePage();
    public static FileOptions FileOptionsScreen = new FileOptions();
    
    

    
    public static MainPage CurrentScreen =(MainPage) WelcomeScreen;

    
    public static MainPage getCurrentScreen() {
        return CurrentScreen;
    }

    
    public static void setCurrentScreen(MainPage currentScreen) {
        CurrentScreen = currentScreen;
    }
    
    
    
}
