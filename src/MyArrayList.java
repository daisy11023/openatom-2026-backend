public class MyArrayList<T> {
    private Object[] elements;
    private int size;

    public MyArrayList() {
        elements = new Object[3];
        size = 0;
    }

    public void add(T element) {
        if (size == elements.length) {
            int oldCapacity = elements.length;
            Object[] newArr = new Object[oldCapacity * 2];

            for (int i = 0; i < size; i++) {
                newArr[i] = elements[i];
            }
            elements = newArr;

            System.out.println("触发底层扩容！当前数组容量由 " + oldCapacity + " 扩容至 " + elements.length);
        }

        elements[size] = element;
        size++;
        System.out.println("成功添加：" + element);
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("错误：索引越界" + index);
            return null;
        }
        return (T) elements[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("错误：索引越界" + index);
            return;
        }
        T removed = (T) elements[index];

        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        elements[size - 1] = null;
        size--;
        System.out.println("删除了索引[" + index + "]的元素(" + removed + ")");
    }

    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        list.add("单号A");
        list.add("单号B");
        list.add("单号C");
        list.add("单号D");
        list.add("单号E");

        System.out.println("获取索引[2]的元素：" + list.get(2));

        list.remove(1);
        System.out.println("验证移位，此时索引[1]的元素变为了：" + list.get(1));
    }
}
