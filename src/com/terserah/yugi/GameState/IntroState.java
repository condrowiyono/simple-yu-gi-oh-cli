package com.terserah.yugi.GameState;

import com.terserah.yugi.Main.GamePanel;
import com.terserah.yugi.Manager.GameStateManager;
import java.util.Scanner;

public class IntroState extends GameState {
	
	public IntroState(GameStateManager gsm) {
		super(gsm);
	}
	
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Yu Gi Oh Game");
		handleInput();
	}

	@Override
	public void handleInput() {
		// TODO Auto-generated method stub
                System.out.println("Command");
                System.out.println("N New Game");
                System.out.println("L Load Game");
                System.out.println("E Exit");
                
		Scanner in = new Scanner(System.in);
		String opt;
		opt = in.nextLine();
                switch (opt) {
                    case "N":
                        System.out.println("Please Enter Name:");
                        String name;
                        name = in.nextLine();
                        GamePanel.createPlayer(name);
                        gsm.setState(GameStateManager.MENU);
                        break;
                    case "L":
                        //LOAD GAME
                        break;
                    case "E":
                        System.exit(0);
                    default :
                        break;
                
                }
        }

}
