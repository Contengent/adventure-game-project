/**
 * @author 
 *
 *   /\_/\  _     ___
 *  |>'v'<||"| -/\, ,`>
 *     -=Edelstein=-
 * 
 */

package com.mycompany.adventure.project;

import java.util.Scanner;

public class AdventureProject {

    public static void main(String[] args) {
        Scanner nameInput = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        int choice = 0;
        String name = "";
        
        print("Hello adenture-rer(?). Welcome to our adventure!");
        print("You will be given two choices at each point of the adventure,");
        print("select your choice by typing '1' or '2'");
        print("Any incorrect responses will return an error.");
        print("Type your name if you understand, and would like to start.");
        name = nameInput.nextLine();
        
        print("\nAlright " + name + ", lets get started.");
        print("I wake up. Another day, boring as usual. I could get up, get dressed, and get to work.");
        print("But who wants to work there for the rest of their life? I heard computer science was the big bux now a days.");
        print("[1] Go to work like always.\n[2] Start learning how to code.");
        choice = input.nextInt();
        
        if(choice == 1){
            //Ending one: workLikeAlways
            print("Sodium I can deal with this until I am allowed to claim my pension.");
            
        } else if(choice == 2){
            //learn to code
            print("No. I want to start living my best life. And to do that, I will start with stackhub and C.");
            print("People talk about 'Linux' a lot and I'm not sure about it. I always thought it was some '5up3r e1it3 hax0r' stuff.");
            print("But it could help me learn more...");
            print("[1] Keep using windows.\n[2] Start using Linux.");
            choice = input.nextInt();
            
            if(choice == 1){
                //use windows
                print("I don't think that coding will require me to change to Linux. It's just editing a file!");
                print("Interesting how much money you can make by infecting a database and requesting for ransome...");
                print("[1] Decide you should not be coding.\n[2] Get to work.");
                choice = input.nextInt();
                
                if(choice == 1){
                    //Ending two: hoddenTalents
                    print("I think that it would be better for the world if I didn't learn how to code...");
                } else if(choice == 2){
                    //getting to work
                    print("Okay, the malware is ready... should I really go through with this?");
                    print("[1] Re-think your path.\n[2] Launch the attack.");
                    choice = input.nextInt();
                    
                    if(choice == 1){
                        //Ending three: withGreatPower
                        print("Maybe I should rethink my path... Should I become a cyber-security agent instead?");
                    } else if(choice == 2){
                        //Ending four: exampleOf
                        print("Okay... it is time to launch the attack... *click*");
                        print("*weeks later* \n\"This is the RCMP, is " + name + " home?\"");
                    } else{
                        print("Error: Invalid input.");
                    }
                }
                
            } else if(choice == 2){
                //use linux
                print("Linux seems like a good choice, I think that Linux-Mint would be a good starting place.");
                print("Interesting how much money you can make by infecting a database and requesting for ransome...");
                print("[1] I should not be coding...\n[2] Time to work...");
                choice = input.nextInt();
                
                if(choice == 1){
                    //Ending five: whatCouldHaveBeen
                    print("I don't want to end up in jail because I made a trivial mistake...");
                } else if(choice == 2){
                    print("Alright, lets get started...");
                    print("Okay, the rootkit is ready, and I am safe from the feds... should I really go through with this?");
                    print("[1] Reconsider it all.\n[2] Infect their system.");
                    choice = input.nextInt();
                    
                    if(choice == 1){
                        //Ending six: pestControl
                        print("I think I would be better off reporting this to them, and start building my resume...");
                    } else if(choice == 2){
                        //Ending seven: dealWith999
                        print("*days later* ...");
                        print("*months later*");
                        print("*years later*");
                    } else{
                        print("Error: Invalid input.");
                    }
                    
                } else{
                    print("Error: Invalid input");
                }
                
            } else{
                print("Error: Invalid input");
            }
        } else{
            print("Error: Invalid input.");
        }
        
        
            
        
        
        
    }
    
    private static void print(String input){
        System.out.println(input);
    }
}
