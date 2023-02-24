package ScreenChange;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainWindow extends JFrame {
    
    private static final long serialVersionUID = 1L;

    //以下 フィールド
    ScreenMode screenMode = ScreenMode.TITLE;

    //定数
    final int WIDTH = 800;
    final int HEIGHT = 600;

    //レイアウト(紙芝居のような設定)
    CardLayout layout = new CardLayout();

    //コンポーネント
    TitlePanel titlePanel;
    GamePanel gamePanel;

    //コンストラクタ mainメソッドの最初で呼ばれる処理
    MainWindow(){
        this.setTitle("タイトルを設定");
        //ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("/hero.png")); //getClassLoderを利用するとプロジェクトのルート階層階層でややおしくなるので今回はしようしない
        ImageIcon icon = new ImageIcon(getClass().getResource("../img/hero.png"));
        this.setIconImage(icon.getImage());
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);        //バツボタン押下時の動作
        this.setResizable(false);                 //画面サイズの変更を禁止
        this.getContentPane().setBackground(Color.green);   //背景色

        this.setLayout(layout);                             //紙芝居設定
        this.setPreferredSize(new Dimension(WIDTH,HEIGHT)); //ウインドウのサイズ設定
        this.pack();                                        // 自動サイズ調整
        this.setLocationRelativeTo(null);                //起動時のスクリーン位置

    }

    //メインメソッドで呼ぶ
    public void preparePanels() {
        //パネルの準備
        titlePanel = new TitlePanel();
        this.add(titlePanel, "タイトル画面");
        gamePanel = new GamePanel();
        this.add(gamePanel, "ゲーム画面");
        this.pack();
    }

    //メインメソッドで呼ぶ
    public void prepareComponents() {
        titlePanel.prepareComponents();
        gamePanel.prepareComponents();
    }

    //スクリーンモードの切り替え
    //メインメソッドで呼び出し
    public void setFrontScreenAndFocus(ScreenMode screenMode) {
        //引数によって画面の表示を切り替える
        switch (screenMode) {
            case TITLE:
                layout.show(this.getContentPane(),"タイトル画面");
                this.requestFocus();
                break;
            case GAME:
                layout.show(this.getContentPane(),"ゲーム画面");
                this.requestFocus();
                break;
        }           
    }
}
