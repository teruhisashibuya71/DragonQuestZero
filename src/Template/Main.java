package Template;

//コーディング時に画面を簡単に切り替える方法
public class Main{
    static MainWindow mainWindow;

    public static void main(String[] args) {

        mainWindow = new MainWindow();  //ウインドウを生成
        mainWindow.preparePanels();     //ペインに直接貼り付けるパネルの生成
        mainWindow.prepareComponents(); //その他のコンポーネントを生成
        mainWindow.setFrontScreenAndFocus(ScreenMode.MAIN);
        //mainWindow.setFrontScreenAndFocus(ScreenMode.GAME);
        //起動後最初に表示するべき画面を手前にもってくる
        //※ フレームレイアウトをnull以外に設定した場合、必ずこの記述より先にフレームのpack()メソッドを呼ぶ必要がある
        mainWindow.setVisible(true);
    }
}


// import javax.swing.JFrame;

// public class Main{
//     public static void main(String[] args) {

//         //ウインドウのタイトル
//         JFrame frame = new JFrame("ドラゴンクエスト -ZERO-");
        
//         //ウインドウサイズの設定
//         frame.setSize(800,600);

//         //バツをクリックした時の処理を設定
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//         //ウインドウを可視化
//         frame.setVisible(true);

//         //画面中央にウインドウを表示
//         frame.setLocationRelativeTo(null);

//     }
// }