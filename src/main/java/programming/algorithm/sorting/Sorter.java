package programming.algorithm.sorting;

/**
 * 排序器
 * @CREATE AA @ 17-7-19 下午4:26
 */
public abstract class Sorter {
    /** 比较次数 计数器 */
    protected Counter counter = new Counter();

    /**
     * 对数组datas进行 排序
     * @return 运行次数
     * @CREATE AA @ 2017-07-19 16:28:13
     */
    abstract <T extends Comparable> int sort(T[] datas);


    /**
     * 计数器
     * @CREATE AA @ 2017-07-19 17:12:09
     */
    protected static class Counter {
//    private ThreadLocal<Integer> count = new ThreadLocal<Integer>();
        private int value = 0;

        /**
         * 重置计数器
         * @CREATE AA @ 2017-07-19 16:55:11
         */
        public void reset() {
            value = 0;
        }

        /**
         * 计数 +1
         * @CREATE AA @ 2017-07-19 17:03:21
         */
        public int incr() {
            return ++value;
        }

        /**
         * 获取 计数
         * @CREATE AA @ 2017-07-19 17:05:21
         */
        public int value() {
            return value;
        }
    }
}
