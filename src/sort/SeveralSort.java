package sort;

public class SeveralSort {

    public static void main(String[] args) {
        int[] a = {8, 2, 17, 4, 5, 3252, 2543, 235, 1, 232, 2534, 6, 76, 8, 8, 9, 24, 5424, 32, 5423};
        int[] b = {6756, 325423, 68, 6, 8, 5, 75, 87, 9, 4, 25, 43, 2, 3, 1, 3, 757, 4, 57658};
        int[] c = {8, 2, 17, 4, 5};
//        quickSort(a, 0, a.length - 1);
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//
//
//        }
//        System.out.println();
        mergeSort(b);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");


        }
        System.out.println();
////        insertSort(a);
//        quickSort(a,0,a.length-1);
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i]+" ");
//
//        }
    }

    /**
     * 插入排序的思想：遍历数组，认为这个元素之前的数据有序，从后往前找到合适位置插入 其余的数据后移
     *
     * @param a
     */
    public static void insertSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            for (int j = i; j > 0; j--) {
                if (temp < a[j - 1]) {
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }
    }

    /**
     * 选择排序的思想是：每一趟选出最小的数放在这个位置上
     *
     * @param a
     */
    public static void chooseSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[i]) {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }

        }

    }

    /**
     * 冒泡排序的思路是：将一次比较中的最大的值冒泡到最后一位 相邻两个两两比较
     *
     * @param a
     */
    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

        }
    }

    /**
     * 快速排序的思路是每一次排序将比这个数小的放在左边，比这个数大的放在右边 然后分别对左右进行递归
     * 应该注意的地方：递归的停止条件 最外层的start<end 否则最后会变成 0 0  一直递归
     * 判断大小是的条件是>= 和<=
     *
     * @param a
     * @param start
     * @param end
     */
    public static void quickSort(int[] a, int start, int end) {
        if (start < end) {
            int i = start;
            int j = end;
            int flag = a[i];
            while (i < j) {

                while (i < j && a[j] >= flag) j--;
//                int temp = a[i];
//                a[i]=a[j];
//                a[j]=temp;
                a[i] = a[j];

                while (i < j && a[i] <= flag) i++;
//                temp = a[i];
//                a[i]=a[j];
//                a[j]=temp;
                a[j] = a[i];
            }
            a[i] = flag;
            quickSort(a, start, i - 1);
            quickSort(a, i + 1, end);
        }
    }

    public static void mergeSort(int[] a) {
        Msort(a,0,a.length-1);

    }

    public static void Msort(int[] a,int first,int last){
        if(first<last){
            int middle = (first+last)/2;
            Msort(a,first,middle);
            Msort(a,middle+1,last);
            merge(a,first,middle,last);
        }
    }

    public static void merge(int[] a,int start,int middle,int end){
        int[] temp = new int[a.length];
        int i = start, j = middle+1;
        int k = 0;
        while (i <=middle && j <=end) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        while (i <=middle) temp[k++] = a[i++];
        while (j <=end) temp[k++] = a[j++];
//        for (int l = 0; l < temp.length; l++) {//这样写不对 会把a的值覆盖为0
//            a[l]=temp[l];
//        }
        for (int l = 0; l < k; l++) {
            a[start+l]=temp[l];
        }
    }

    public static void merge(int[] a, int[]b) {
        int[] temp = new int[a.length + b.length];
        int i = 0, j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = b[j++];
            }
        }
        while (i < a.length) temp[k++] = a[i++];
        while (j < b.length) temp[k++] = b[j++];
        for (int l = 0; l < temp.length; l++) {
            System.out.print(temp[l] + " ");

        }
    }

    public static void quick_sort(int s[], int l, int r) {
        if (l < r) {
            //Swap(s[l], s[(l + r) / 2]); //将中间的这个数和第一个数交换 参见注1
            int i = l, j = r, x = s[l];
            while (i < j) {
                while (i < j && s[j] >= x) // 从右向左找第一个小于x的数
                    j--;
                if (i < j)
                    s[i++] = s[j];

                while (i < j && s[i] < x) // 从左向右找第一个大于等于x的数
                    i++;
                if (i < j)
                    s[j--] = s[i];
            }
            s[i] = x;
            quick_sort(s, l, i - 1); // 递归调用
            quick_sort(s, i + 1, r);
        }
    }


}
