package com.dll.design.demo.adapterpattern;

/**
 * @author dll
 * @date 2021-05-18 09:57
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
