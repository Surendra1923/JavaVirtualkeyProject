package com.java.pages;

import com.java.services.DirectoryService;
import com.java.services.MainPageService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class WelcomePage implements MainPage {

    private String welcomeText = "********   welcome to VirtualKey!        ********";
    private String developerText = "      Developer: Surendra Kuruva       ";

    private ArrayList<String> options = new ArrayList<>();


    public WelcomePage() {
        options.add("1. For Show Files in the Directory");
        options.add("2. For Show File Options Menu");
        options.add("3. For Quit");

    }
    
    public void introWS() {
    	System.out.println(welcomeText);
        System.out.println(developerText);
        System.out.println("\n");
        Show();
    }
    
    
    
    @Override
    public void Show() {
    	System.out.println("Main Menu");
        for (String s : options)  {
            System.out.println(s);
        }

    }

    public void GetUserInput() {
        int selectedOption  = 0;
        while ((selectedOption = this.getOption()) != 3) {
            this.NavigateOption(selectedOption);
        }
    }

    @Override
    public void NavigateOption(int option) {
        switch(option) {

            case 1: // Show Files in Directory
                this.ShowFiles();
                
                this.Show();
                
                break;
                
            case 2: // Show File Options menu
            	MainPageService.setCurrentScreen(MainPageService.FileOptionsScreen);
                MainPageService.getCurrentScreen().Show();
                MainPageService.getCurrentScreen().GetUserInput();
                
                this.Show();
                
                break;
                
            default:
                System.out.println("Invalid Option");
                break;
        }
        
    }

    public void ShowFiles() {

        //TODO: Get the files from the Directory
    	
    	//Finished TODO Task

        System.out.println("List of Files In the Directory : ");
    	DirectoryService.PrintFiles();

    }
    
    private int getOption() {
        Scanner in = new Scanner(System.in);

        int returnOption = 0;
        try {
            returnOption = in.nextInt();
        }
        catch (InputMismatchException ex) {

        }
        return returnOption;

    }
}

