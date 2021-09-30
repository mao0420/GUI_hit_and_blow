public class Constants {
    public static final String DISPLAY_NAME_FRAME_TITLE = "Hit & Blow";
    public static final String DISPLAY_TEXT_TITLE = "Hit & Blow";
    public static final String DISPLAY_BUTTON_GAME_START = "ゲームスタート";
    public static final String DISPLAY_BUTTON_RULE_DESCRIPTION = "ルール説明";
    public static final String DISPLAY_BUTTON_GAME_END = "ゲーム終了";
    public static final String DISPLAY_BUTTON_GAME_CLEAR = "ゲームクリア画面";
    public static final String DISPLAY_TEXT_RULE_DESCRIPTION = """
            <html><body>ヒット&ブローはプログラム側がランダムで設定した数字を当てるゲームです。<br/>
            <br/>
            このプログラムでは被り無しの0～9の数字が3桁設定されます。<br/>
            ユーザー側が3桁の数字を入力し、<br/>
            その数字と正解の数字を比較して次のヒントが表示されます。<br/>
            <br/>
            ヒット:桁の位置も数字も合っている数字の数です。<br/>
            ブロー:数字は合っているが、桁の位置が違う数字の数です。<br/>
            <br/>
            例:正解が[083]入力が[385]の時、<br/>
            　 8は桁も数字も合っている為ヒット、<br/>
            　 3は桁の位置が違うが数字は合っている為ブローとなり、<br/>
            　 ヒットとブローの数がそれぞれ1つずつの為、ヒット:1 ブロー:1と表示されます。<br/>
            <br/>
            その後、再度数字の入力から繰り返し、3桁全部の数字を当てた場合はゲームクリアです。<br/>
            少ない回数でのクリアを目指してください。<br/>
            <br/>
            10回目の入力までに正解の数字を見つけられないとゲームオーバーになります。<br/>
            また、数値入力時にGを入力するとギブアップとしてゲームを終了する事が出来ます。<br/>
            <br/></body></html>
            """;
    public static final String DISPLAY_BUTTON_BACK_TO_TITLE = "タイトルに戻る";
    public static final String DISPLAY_TEXT_GAME_CLEAR_RESULT = """
            <html><center>ゲームクリア！<br/>
            <br/>
            正解の数字は%sでした！<br/>
            <br/>
            入力回数:%d回<br/></center></html>
            """;
    public static final String DISPLAY_TEXT_GAME_OVER_RESULT = """
            <html><body>ゲームクリア！<br/>
            <br/>
            正解の数字は%sでした！<br/>
            <br/>
            入力回数:%d回<br/></body></html>
            """;
    public static final String FONT_MS_GOTHIC = "ＭＳ ゴシック";
    public static final String CARD_TITLE_SCREEN = "CardTitleScreen";
    public static final String CARD_RULE_DESCRIPTION = "CardRuleDescription";
    public static final String CARD_GAME_CLEAR = "CardGameClear";
}
