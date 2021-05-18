package com.dll.design.demo.adapterpattern;

/**
 * @author dll
 * @date 2021-05-18 09:55
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
