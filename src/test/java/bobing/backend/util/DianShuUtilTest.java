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
}