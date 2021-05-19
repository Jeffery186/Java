public class math {
    public static void main(String [] args)
    {
        System.out.println(20.0/3);//当参与/运算的两个操作数都是整数时，表示整数除法，否则，表示浮点数
        System.out.println(20/4);
        System.out.println(21%4);//取余

        double x=4;
//        double y=Math.sqrt(x);//平方根
//        System.out.println(y);
        double y=Math.pow(x,6);//幂运算 6次幂
        System.out.println(y);
    }
}