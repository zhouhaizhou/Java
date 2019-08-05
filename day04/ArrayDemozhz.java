class ArrayDemozhz {
	public static void main(String[] args) {
		// System.out.println("Hello World!");
		int[] arr = { -1, -25, -13, -41, -11, -98, -56, -43 };
		int max = getMax(arr);
		System.out.println("max:" + max);
    }
    /**
     * 获取数组中的最大值
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
}