package KeyListener;


import MusicController.MusicControl;


//コーディング時に画面を簡単に切り替える方法
public class Main{
    static MainWindow mainWindow;
    public static void main(String[] args) {

        mainWindow = new MainWindow();  //ウインドウを生成
        mainWindow.preparePanels();     //ペインに直接貼り付けるパネルの生成
        mainWindow.prepareComponents(); //その他のコンポーネントを生成
        mainWindow.setFrontScreenAndFocus(ScreenMode.FIELD);
        //mainWindow.setFrontScreenAndFocus(ScreenMode.GAME);
        //起動後最初に表示するべき画面を手前にもってくる
        //※ フレームレイアウトをnull以外に設定した場合、必ずこの記述より先にフレームのpack()メソッドを呼ぶ必要がある

        //音楽の呼び出し
        MusicControl mainController = new MusicControl();


        mainWindow.setVisible(true);
    }
}