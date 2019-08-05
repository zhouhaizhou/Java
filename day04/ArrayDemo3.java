import java.util.Arrays;

class ArrayDemo3 {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		int[] arr = { -1, -25, -13, -41, -11, -98, -56, -43 };
		int max = getMax(arr);

	/* 	//调用工具类的排序方法
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)); */

		//调用自己写的“选择排序”方法，对数组进行排序
		// sortXZPX(arr);
		int[] myArr=sortXZPXReturn(arr);
		System.out.println("自己写的选择排序方法，输出的数组为"+Arrays.toString(myArr));//要想打印出数组必须采用Arrays.toString(arr);的方式将数组转化为字符串
		System.out.println("max:" + max);
	}
	/**
	 * 求数组中的最大值
	 * @param arr
	 * @return
	 */
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int x = 1; x < arr.length; x++) {
			if (arr[x] > max) {
				max = arr[x];
			}
		}
		return max;
	}
	/**
	 * 选择排序法，排序数组，不返回值
	 * @param arr
	 */
	public static void sortXZPX(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			int tem=i;
			//将数组中从i开始的最小的元素所在位置的索引赋值给tem
			for (int j = i; j < arr.length; j++) {
				if(arr[j]<arr[tem]){
					tem=j;
				}
			}
			//上面获取了数组中从i开始的最小值的位置索引为tem，利用该索引将第i位上的元素与其进行交换
			int temp1=arr[i];
			arr[i]=arr[tem];
			arr[tem]=temp1;
		}
		// return arr;
	}
	
	/**
	 * 选择排序法，排序数组，返回排序之后的数组
	 * @param arr
	 * @return
	 */
	public static int[] sortXZPXReturn(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			int tem=i;
			//将数组中从i开始的最小的元素所在位置的索引赋值给tem
			for (int j = i; j < arr.length; j++) {
				if(arr[j]<arr[tem]){
					tem=j;
				}
			}
			//上面获取了数组中从i开始的最小值的位置索引为tem，利用该索引将第i位上的元素与其进行交换
			int temp1=arr[i];
			arr[i]=arr[tem];
			arr[tem]=temp1;
		}
		return arr;
	}
}