package Template;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;

public class MainPanel extends JPanel{

    private static final long serialVersionUID = 1L;

    //コンポーネント
    JLabel gameLabel;

    //コンストラクタ
    MainPanel(){
        //パネルサイズと貼り付け位置の設定は不要 CardLayoutが自動で画面サイズに合わせる
        this.setLayout(null);
        this.setBackground(Color.green);  //背景色
        
    }

    public void prepareComponents() {
        //コンポーネントに対する命令は以下のとおり
        gameLabel = new JLabel();                                 //ラベルの生成
        gameLabel.setText("ゲーム画面");                      //ラベルに文字を記入
        gameLabel.setBounds(100,200,100,30);   //位置とサイズの設定
        this.add(gameLabel);    
    }
    
}
