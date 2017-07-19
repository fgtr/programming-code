package programming.algorithm.sorting;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @CREATE AA @ 17-7-18 下午4:39
 */
class SortingNoteTest {
    SortingNote sorting = new SortingNote();

//    @BeforeEach
//    void setUp() {
//
//    }

    @Test
    void bubbleTest() {
        bubbleTest(null);
        // len: 0
        bubbleTest(new Long[] {});
        // len: 1
        bubbleTest(new Double[] {214.34});
        // len: 2
        bubbleTest(new Double[] {214.34, 25.4});
        //
        bubbleTest(new Double[] {23.9, 214.34, 25.4, 54.21, 34.44, 63.21});

    }

    private <T extends Comparable> void bubbleTest(T[] datas) {
        System.out.print("\n");
        System.out.println(Arrays.toString(datas));
        sorting.bubble(datas);
        System.out.println(Arrays.toString(datas));
    }

}