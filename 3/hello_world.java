public class hello_world {
    public static void main(String [] args)
    {
        System.out.println("你好，世界！");

        int vacationDay;
        vacationDay=12;
        System.out.println(vacationDay);
        System.out.println(vacationDay);
//        double salary;

        double salary=65000;
        long earthPopulation;
        boolean done;//布尔值
        System.out.println(salary);

        var aaa=10;
        System.out.println(aaa);

        int n=123456789;
        float f=n;
        System.out.println(f);//数值类型转换

//        强制类型转换
        double x=9.997;
        int nx=(int) x;
        System.out.println(nx);//强制类型转换通过截断小数部分将浮点值转换为整型
//        如果想对浮点数进行舍入运算，以便取得最接近的整数，那就可以使用 Math.round 方法。

        int a;
        a=1;
        a+=4;//等价与a=a+4
        System.out.println(a);

        int b=12;
        b++;//自增1个单位
        System.out.println("\n"+b);
    }
}
//注释