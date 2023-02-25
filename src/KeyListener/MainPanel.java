package KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import java.awt.Color;

public class MainPanel extends JPanel{

    private static final long serialVersionUID = 1L;

    //定数フィールド
    Color backGroundColor = Color.green;

    //コンポーネント
    HeroLabel heroLabel;
    
    //インナークラスの型
    MyKeyListener myKeyListener;

    //コンストラクタ
    MainPanel(){
        //パネルサイズと貼り付け位置の設定は不要 CardLayoutが自動で画面サイズに合わせる
        this.setLayout(null);
        this.setBackground(backGroundColor);  //背景色
    }


    public void prepareComponents() {
        heroLabel = new HeroLabel();
        this.add(heroLabel);
        myKeyListener = new MyKeyListener(this);
        
    }

    private class MyKeyListener implements KeyListener {

        //貼り付け位置を保持
        MainPanel panel;

        //コンストラクタ リスナーをパネルに取り付ける
        MyKeyListener(MainPanel p){
            super();
            panel = p;
            p.addKeyListener(this);
        }

        //以下 KeyListener クラスが持つメソッドのオーバーライド
        /**
         * @param event
         */
        @Override
        public void keyTyped(KeyEvent event) {
            //do nothing
        }

        @Override
        public void keyReleased(KeyEvent event) {
            //do nothing
        }

        /**
         * キーを押した時の処理
         * 上下左右が押された時と壁にぶつかった時の処理を定義
         * @param event
         */
        @Override
        public void keyPressed(KeyEvent event) {
            switch (event.getKeyCode()) {

            case KeyEvent.VK_UP: //上を押した時の処理
                if (heroLabel.getY() > 0) {
                    heroLabel.setLocation(heroLabel.getX(), heroLabel.getY()-36);
                }
                break;

            case KeyEvent.VK_DOWN: //下を押した時の処理
                if (heroLabel.getY() + heroLabel.heroImage.getHeight(null) < panel.getHeight()) {
                    heroLabel.setLocation(heroLabel.getX(), heroLabel.getY()+36);
                }
                break;

            case KeyEvent.VK_LEFT: //左を押した時の処理
                if (heroLabel.getX() > 0) {
                    heroLabel.setLocation(heroLabel.getX()-36, heroLabel.getY());
                }
                break;
            
            case KeyEvent.VK_RIGHT: //右を押した時の処理
                if (heroLabel.getX() + heroLabel.heroImage.getWidth(null) < panel.getWidth()) {
                    heroLabel.setLocation(heroLabel.getX()+36, heroLabel.getY());
                }
                break;
            case KeyEvent.VK_ENTER: //ENTERの処理
                if (backGroundColor == Color.green) {
                    backGroundColor = Color.blue;
                    panel.setBackground(backGroundColor);
                } else if (backGroundColor == Color.blue) {
                    backGroundColor = Color.green;
                    panel.setBackground(backGroundColor);
                }
                break;
            }
        }
    }
}
