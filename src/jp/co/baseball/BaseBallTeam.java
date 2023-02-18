package jp.co.baseball;

public class BaseBallTeam {
    // フィールド
    private String name;        // チーム名
    private int win;            // 勝利
    private int lose;           // 敗北
    private int draw;           // 引分


 // 引数4つがあるコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }
    // 勝敗情報を表示するメソッド
    public void report () {
        System.out.println(name + "の2022年の成績は" + win + "勝" + lose + "敗" + draw + "分、勝率は" + getRate() + "です。");
    }

    // 勝率を戻すメソッド
    double getRate() {
        double rate = (double) win / (win + lose);
        return rate;
    }
}