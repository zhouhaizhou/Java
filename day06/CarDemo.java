/**
成员变量和局部变量的区别：
1、作用域范围
成员变量定义在类中，整个类中都可以访问。
局部变量定义在函数、语句、局部代码块中，只在所属的区域有效。

2、存在的位置地方
成员变量存在于堆内存的对象中
局部变量存在于栈内存的方法中。

3、存在的时间
成员变量随对象的创建而存在，随对象的消失而消失
局部变量随着所属区域的执行而存在，随着所属区域的结束而释放

4、有没有默认的初始化值
成员变量都有默认的初始化值
局部变量没有默认的初始化值

 */

 class Car{
     int num;
     String color;

     void run(){
         System.out.println(num+"..."+color);
     }
 }

 class CarDemo{
     public static void main(String[] args){
         Car c1=new Car();
         Car c2=new Car();
         show(c1);
         show(c2);

         /**
          匿名对象。没有名字的对象
          new Car();//匿名对象。其实就是定义对象的简写

          Car c=new Car();
          c.run();

          //1、当对象对方法仅进行一次调用的时候，就可以简化成匿名对象，
          new Car().run();

          2、匿名对象可以作为实际参数进行传递

          */

     }
//将汽车的共性部分提取出来
    public static void show(Car c){//类类型的变量   无论什么变量，定义的时候，只要加上类型就能定义变量
        c.num=3;
        c.color="red";
        System.out.println(c.num+"..."+c.color);
    }
 }