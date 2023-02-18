package jp.co.baseball;

public class Review03 {
    public static void main(String[] args) {


        BaseBallTeam bbt01 = new BaseBallTeam("東京ヤクルトスワローズ", 80, 59, 4);

        BaseBallTeam bbt02 = new BaseBallTeam("横浜DeNAベイスターズ",73, 68, 2);

        BaseBallTeam bbt03 = new BaseBallTeam("阪神タイガース", 68,71,4);

        BaseBallTeam bbt04 = new BaseBallTeam("読売ジャイアンツ",68,72,3);

        BaseBallTeam bbt05 = new BaseBallTeam("広島東洋カープ",66,74,3);

        BaseBallTeam bbt06 = new BaseBallTeam("中日ドラゴンズ",66,75,2);

    bbt01.report();
    bbt02.report();
    bbt03.report();
    bbt04.report();
    bbt05.report();
    bbt06.report();

    }
}
