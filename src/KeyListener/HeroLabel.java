package KeyListener;

import javax.swing.JLabel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

public class HeroLabel extends JLabel {
    
    private static final long serialVersionUID = 1L;

    Image heroImage;

    
    /**
     * コンストラクタ
     * 画像を取得と初期設定
     */
    HeroLabel(){
        //画像の取得
        heroImage = new ImageIcon(getClass().getResource("../img/hero.png")).getImage();
        
        //画像の貼り付け先 位置 大きさの設定
        this.setBounds(133,100,heroImage.getWidth(null),heroImage.getHeight(null));
    }

    /** 
     * 画像の表示と詳細設定(向きなど)
     * @param graphic 画像データ
    */
    public void paint(Graphics graphic) {
        super.paint(graphic);
        //画像を使う処理
        Graphics2D hero2D = (Graphics2D)graphic;
        //画像の反転処理などはこの引数をいじることでできる
        hero2D.drawImage(heroImage, 0,0,heroImage.getWidth(null),heroImage.getHeight(null),null);
    }

}
