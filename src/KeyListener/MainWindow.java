package KeyListener;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MainWindow extends JFrame {
    
    private static final long serialVersionUID = 1L;

    //以下 フィールド
    ScreenMode screenMode = ScreenMode.FIELD;

    //定数 とりあえず正方形で
    final int WIDTH = 800;
    final int HEIGHT = 800;

    //レイアウト(紙芝居のような設定)
    CardLayout layout = new CardLayout();

    //コンポーネント
    MainPanel mainPanel;

    //コンストラクタ mainメソッドの最初で呼ばれる処理
    MainWindow(){
        this.setTitle("フィールド画面テスト");
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
        mainPanel = new MainPanel();
        this.add(mainPanel, "メイン画面");
        this.pack();
    }

    //メインメソッドで呼ぶ
    public void prepareComponents() {
        mainPanel.prepareComponents();
    }

    //スクリーンモードの切り替え
    //メインメソッドで呼び出し
    public void setFrontScreenAndFocus(ScreenMode s) {
        screenMode = s;
        //引数によって画面の表示を切り替える
        switch (screenMode) {
        case FIELD:
            layout.show(this.getContentPane(),"メイン画面");
            mainPanel.requestFocus();
            break;
        }           
    }
}
