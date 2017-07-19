package programming.algorithm.sorting;

/**
 * 排序算法
 * @CREATE AA @ 17-7-18 下午15:40:03
 */
public class SortingNote {

    /**
     * 冒泡排序
     * @CREATE AA @ 2017-07-18 15:40:03
     */
    public <T extends Comparable> T[] bubble(T[] datas) {
        if (datas != null && datas.length > 1) {
            for (int i = datas.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (datas[j].compareTo(datas[j+1]) > 0) {
                        swap (datas, j, j+1);
                    }
                }
            }
        }
        return datas;
    }

    /**
     * 将datas数组中，位于ori和des的两元素进行对换
     * @CREATE AA @ 2017-07-18 16:57:36
     */
    private <T> void swap(T[] datas, int ori, int des) {
        T tmp = datas[ori];
        datas[ori] = datas[des];
        datas[des] = tmp;
    }
}