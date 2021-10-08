import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ContentsTest {
    //正解数値設定テスト
    @Test
    void testCorrectAnswerNumber() {
        int[] actual = Contents.correctAnswerNumber();
        assertNotEquals(actual[0], actual[1]);
        assertNotEquals(actual[0], actual[2]);
        assertNotEquals(actual[1], actual[2]);
        assertEquals(Constants.TEST_ELEMENT_DIGITS, actual.length);
    }

    //ヒットブロー計算メソッド ヒット数0テスト
    @Test
    void testGetHitBlowHit0() {
        int expect = Constants.TEST_HIT_ZERO;
        int[] answer = {0, 1, 2};
        int[] input = {3, 4, 5};
        int[] actual = Contents.getHitBlow(answer, input);
        assertEquals(expect, actual[Constants.CONSTANT_ARRAY_HIT_COUNTER]);
    }

    //ヒットブロー計算メソッド ヒット数1テスト
    @Test
    void testGetHitBlowHit1() {
        int expect = Constants.TEST_HIT_ONE;
        int[] answer = {0, 1, 2};
        int[] input = {0, 3, 4};
        int[] actual = Contents.getHitBlow(answer, input);
        assertEquals(expect, actual[Constants.CONSTANT_ARRAY_HIT_COUNTER]);
    }

    //ヒットブロー計算メソッド ヒット数2テスト
    @Test
    void testGetHitBlowHit2() {
        int expect = Constants.TEST_HIT_TWO;
        int[] answer = {0, 1, 2};
        int[] input = {0, 1, 3};
        int[] actual = Contents.getHitBlow(answer, input);
        assertEquals(expect, actual[Constants.CONSTANT_ARRAY_HIT_COUNTER]);
    }

    //ヒットブロー計算メソッド ヒット数3テスト
    @Test
    void testGetHitBlowHit3() {
        int expect = Constants.TEST_HIT_THREE;
        int[] answer = {0, 1, 2};
        int[] input = {0, 1, 2};
        int[] actual = Contents.getHitBlow(answer, input);
        assertEquals(expect, actual[Constants.CONSTANT_ARRAY_HIT_COUNTER]);
    }

    //ヒットブロー計算メソッド ブロー数0テスト
    @Test
    void testGetHitBlowBlow0() {
        int expect = Constants.TEST_BLOW_ZERO;
        int[] answer = {0, 1, 2};
        int[] input = {0, 1, 2};
        int[] actual = Contents.getHitBlow(answer, input);
        assertEquals(expect, actual[Constants.CONSTANT_ARRAY_BLOW_COUNTER]);
    }

    //ヒットブロー計算メソッド ブロー数1テスト
    @Test
    void testGetHitBlowBlow1() {
        int expect = Constants.TEST_BLOW_ONE;
        int[] answer = {0, 1, 2};
        int[] input = {2, 3, 4};
        int[] actual = Contents.getHitBlow(answer, input);
        assertEquals(expect, actual[Constants.CONSTANT_ARRAY_BLOW_COUNTER]);
    }

    //ヒットブロー計算メソッド ブロー数2テスト
    @Test
    void testGetHitBlowBlow2() {
        int expect = Constants.TEST_BLOW_TWO;
        int[] answer = {0, 1, 2};
        int[] input = {1, 2, 3};
        int[] actual = Contents.getHitBlow(answer, input);
        assertEquals(expect, actual[Constants.CONSTANT_ARRAY_BLOW_COUNTER]);
    }

    //ヒットブロー計算メソッド ブロー数3テスト
    @Test
    void testGetHitBlowBlow3() {
        int expect = Constants.TEST_BLOW_THREE;
        int[] answer = {0, 1, 2};
        int[] input = {2, 0, 1};
        int[] actual = Contents.getHitBlow(answer, input);
        assertEquals(expect, actual[Constants.CONSTANT_ARRAY_BLOW_COUNTER]);
    }
}
