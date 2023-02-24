package ScreenChange;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class TitlePanel extends JPanel {

    private static final long serialVersionUID = 1L;

    //コンポーネント
    JLabel titleLabel;

    //コンストラクタ
    TitlePanel(){
        //パネルサイズと貼り付け位置の設定は不要 CardLayoutが自動で画面サイズに合わせる
        this.setLayout(null);      //レイアウト設定
        this.setBackground(Color.red);  //背景色
    }

    //メソッドその１
    public void prepareComponents() {
        //コンポーネントに対する命令は以下のとおり
        titleLabel = new JLabel();                               //ラベルの生成
        titleLabel.setText("タイトル画面");                  //ラベルに文字を記入
        titleLabel.setBounds(100,0,100,30);  //位置とサイズの設定
        this.add(titleLabel);                                   //ラベルをこのパネルに貼る
    }
}
