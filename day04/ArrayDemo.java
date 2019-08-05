class ArrayDemo 
{
	public static void main(String[] args) 
	{

		//元素类型[]  数组名=new 元素类型[元素个数或数组长度]
		int[] arr= new int[3];//默认arr[i]中的值为0
		arr[0]=89;//为数组赋值
		System.out.println("Hello World!");
	}
}
/*
内存的划分：
1、寄存器
2、本地方法区
3、栈内存
    存储的都是局部变量
	而且变量所属的作用域一旦结束，该变量就自动释放
4、堆内存
     存储的是数组和对象（其实数组也是一个对象）凡是new建立在堆中
	 特点：
	 1、每一个实体都有首地址值
	 2、堆内存中的每一个变量都有某人初始化值，根据类型的不同而不同。整数是0，小数0.0或者0.0f，boolean false
	 3、垃圾回收机制
*/