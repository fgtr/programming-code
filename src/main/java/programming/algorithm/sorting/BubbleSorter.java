package programming.algorithm.sorting;

/**
 * 冒泡排序
 * @CREATE AA @ 17-7-18 下午15:40:03
 */
public class BubbleSorter extends Sorter {

    /**
     * 冒泡排序
     * @CREATE AA @ 2017-07-18 15:40:03
     * @MODIFY 新增计数功能 BY AA @ 2017-07-19 17:12:09
     * @MODIFY 新增顺序检测功能 BY AA @ 2017-07-19 17:41:39
     */
    @Override
    public <T extends Comparable> int sort(T[] datas) {
        counter.reset();
        boolean needNextPass = true;
        if (datas != null && datas.length > 1) {
            for (int i = datas.length - 1; i > 0 && needNextPass; i--) {
                // P72. Array may be sorted and next pass not needed
                needNextPass = false;
                for (int j = 0; j < i; j++) {
                    counter.incr();
                    if (datas[j].compareTo(datas[j+1]) > 0) {
                        needNextPass = true; //next pass still needed
                        swap (datas, j, j+1);
                    }
                }
            }
        }
        return counter.value();
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