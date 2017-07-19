package programming.algorithm.sorting;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

/**
 * @CREATE AA @ 17-7-18 下午4:39
 */
class SorterTest {
    Sorter sorter = null;

    @BeforeEach
    void setUp() {
        sorter = new BubbleSorter();
    }

    @Test
    void sort() {
        sort(null);
        // len: 0
        sort(new Long[] {});
        // len: 1
        sort(new Double[] {214.34});
        // len: 2
        sort(new Double[] {214.34, 25.4});
        //
        sort(new Double[] {23.9, 214.34, 25.4, 54.21, 34.44, 63.21});
        // 顺序
        sort(new Integer[] {11, 22, 33, 44, 55});


    }

    private <T extends Comparable> void sort(T[] datas) {
        System.out.print("\n");
        System.out.println("> " + Arrays.toString(datas));
        System.out.println("< " + sorter.sort(datas));
        System.out.println("< " + Arrays.toString(datas));
    }

}