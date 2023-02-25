package MusicController;

import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import java.net.URL;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.event.*;
import java.util.HashMap;
import java.util.Map;

import java.io.File;
import java.util.logging.*;
import java.net.MalformedURLException;

//import javafx.scene.media.AudioClip;

public class MusicControl  {

    private static final long serialVersionUID = 1L;
    
    Logger logger = Logger.getLogger("MusicControl");

    //フィールド 使う音楽ファイルのURLを保持する
    //HashMap<String,URL> BGMs;
    //BasicPlayer player;


    //コンストラクタ
    public MusicControl() {
        BasicPlayer basicPlayer = new BasicPlayer();

        //サウンドファイルのパス 相対パスは操作中のターミナルからのパスになるので地獄！！
        String filePath = "/Users/ts/Desktop/testgame/samplegame/src/music/dragon_quest_zero.mp3";
        //String filePath = "./samplegame/src/music/dragon_quest_zero.mp3";
        //パスにしたがってファイルを読み込む
        File soundFile = new File(filePath);
        
        //音楽の再生
        try {
            basicPlayer.open(soundFile);
            basicPlayer.play();
        } catch (BasicPlayerException bpe){
            logger.info("音楽ファイル再生時の例外： " + bpe.getMessage());
        }
        
    }
}