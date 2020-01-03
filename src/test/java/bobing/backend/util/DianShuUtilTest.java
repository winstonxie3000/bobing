package bobing.backend.util;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

class DianShuUtilTest {

    @BeforeEach
    void setUp() {

    }

    @Test
    void isYiXiu() {
    }

    @Test
    void isErJu() {
    }

    @Test
    void isSanHong() {
    }

    @Test
    void isSiJin() {
    }

    @Test
    void isDuiTang() {
        int [] numbers1 = {1,3,2,4,6,5};
        Assertions.assertTrue(DianShuUtil.isDuiTang(numbers1));
        int [] numbers2 = {1,3,2,4,5,6};
        Assertions.assertTrue(DianShuUtil.isDuiTang(numbers2));
        int [] numbers3 = {1,1,2,4,5,6};
        Assertions.assertFalse(DianShuUtil.isDuiTang(numbers3));
    }

    @Test
    void isZhuangYuan() {
    }

    @Test
    void isChaJinHua() {
    }

    @Test
    void testIsSanHong() {
        int [] numbers1 = {4,4,4,4,6,5};
        Assertions.assertTrue(DianShuUtil.isSiHong(numbers1));
        int [] numbers2 = {4,4,4,4,1,2};
        Assertions.assertTrue(DianShuUtil.isSiHong(numbers2));
        int [] numbers3 = {4,3,4,4,1,2};
        Assertions.assertFalse(DianShuUtil.isSiHong(numbers3));
    }

    @Test
    void isWuZi() {
        int [] numbers1 = {4,4,4,4,6,5};
        Assertions.assertFalse(DianShuUtil.isWuZi(numbers1));
        int [] numbers2 = {4,4,4,4,4,4};
        Assertions.assertFalse(DianShuUtil.isWuZi(numbers2));
        int [] numbers3 = {1,1,1,1,1,4};
        Assertions.assertTrue(DianShuUtil.isWuZi(numbers3));
        int [] numbers4 = {2,2,2,2,2,4};
        Assertions.assertTrue(DianShuUtil.isWuZi(numbers4));
        int [] numbers5 = {4,4,4,4,4,5};
        Assertions.assertFalse(DianShuUtil.isWuZi(numbers5));
    }

    @Test
    void isWuHong() {
        int [] numbers1 = {4,4,4,4,4,5};
        Assertions.assertTrue(DianShuUtil.isWuHong(numbers1));
        int [] numbers2 = {5,5,5,5,4,5};
        Assertions.assertFalse(DianShuUtil.isWuHong(numbers2));

    }

    @Test
    void isLiuZi() {
        int [] numbers1 = {4,4,4,4,4,4};
        Assertions.assertFalse(DianShuUtil.isLiuZi(numbers1));
        int [] numbers2 = {5,5,5,4,4,4};
        Assertions.assertFalse(DianShuUtil.isLiuZi(numbers2));
        int [] numbers3 = {1,1,1,1,1,1};
        Assertions.assertTrue(DianShuUtil.isLiuZi(numbers3));
        int [] numbers4 = {3,3,3,3,3,3};
        Assertions.assertTrue(DianShuUtil.isLiuZi(numbers4));
    }

    @Test
    void isLiuHong() {
        int [] numbers1 = {4,4,4,4,4,4};
        Assertions.assertTrue(DianShuUtil.isLiuHong(numbers1));
        int [] numbers2 = {5,5,5,4,4,4};
        Assertions.assertFalse(DianShuUtil.isLiuHong(numbers2));
        int [] numbers3 = {1,1,1,1,1,1};
        Assertions.assertFalse(DianShuUtil.isLiuHong(numbers3));
        int [] numbers4 = {3,3,3,3,3,3};
        Assertions.assertFalse(DianShuUtil.isLiuHong(numbers4));
    }
}