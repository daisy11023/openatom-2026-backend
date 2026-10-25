public class MyArrayList<T> {

    // ===== Task1：核心结构 =====
    private Object[] elements;   // 底层定长数组，用来装所有元素（为什么不用 T[]，见笔记）
    private int size;            // 已经存了几个元素（不是数组容量！容量永远 = elements.length）

    public MyArrayList() {
        elements = new Object[3];  // 初始容量故意设成 3，方便一会儿看见扩容
        size = 0;                  // 刚造出来，一个元素都没有
    }

    // ===== Task2：添加 + 自动扩容 =====
    public void add(T element) {
        if (size == elements.length) {          // size 追上了容量 = 数组满了
            int oldCapacity = elements.length;   // 记下旧容量，一会儿打印用
            Object[] newArr = new Object[oldCapacity * 2];  // 申请 2 倍大小的新数组

            for (int i = 0; i < size; i++) {    // 把老数组里的元素一个个搬到新数组
                newArr[i] = elements[i];
            }
            elements = newArr;                  // 让 elements 这个"把手"改指向新数组（老数组被垃圾回收）

            System.out.println("触发底层扩容！当前数组容量由 " + oldCapacity + " 扩容至 " + elements.length);
        }

        elements[size] = element;   // 存进"下一个空位"（下标正好等于当前数量）
        size++;                     // 数量 +1
        System.out.println("成功添加：" + element);
    }

    // ===== Task3：查询（带边界检查） =====
    public T get(int index) {
        if (index < 0 || index >= size) {        // 合法下标是 0 ~ size-1，两头都要查
            System.out.println("错误：索引越界" + index);
            return null;                          // 越界就不给数据，返回 null
        }
        return (T) elements[index];               // 数组里是 Object，取出来要强转回 T
    }

    // ===== Task4：删除 + 移位 =====
    public void remove(int index) {
        if (index < 0 || index >= size) {         // 同样的边界检查
            System.out.println("错误：索引越界" + index);
            return;
        }
        T removed = (T) elements[index];          // 先把要删的元素存起来，一会儿打印用

        // 核心：把 index 后面的元素，全部往前挪一格，把洞填上
        // 循环到 size-2 为止（即 i < size-1），因为最后一个元素没有"后一个"了
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];        // 后一个覆盖前一个
        }

        elements[size - 1] = null;                // 收尾1：最后那一格现在重复了，清空
        size--;                                   // 收尾2：数量减一
        System.out.println("删除了索引[" + index + "]的元素(" + removed + ")");
    }

    // ===== Task5：实战测试 =====
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("单号A");
        list.add("单号B");
        list.add("单号C");
        list.add("单号D");    // 存第 4 个时必然触发扩容（3 → 6）
        list.add("单号E");

        System.out.println("获取索引[2]的元素：" + list.get(2));

        list.remove(1);       // 删掉"单号B"，后面的 C D E 整体前移
        System.out.println("验证移位，此时索引[1]的元素变为了：" + list.get(1));
    }
}
