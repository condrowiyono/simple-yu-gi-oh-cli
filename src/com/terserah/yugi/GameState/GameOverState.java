/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.terserah.yugi.GameState;

import com.terserah.yugi.Manager.GameStateManager;

/**
 *
 * @author condro
 */
public class GameOverState extends GameState {

    public GameOverState(GameStateManager gsm) {
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
    }
    
}
