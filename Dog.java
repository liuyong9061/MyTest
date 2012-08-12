/*=============================================================================
#     FileName: Dog.java
#         Desc: 学习this关键字 
#       Author: Liu Yong
#        Email: jayxjadmin@gmail.com
#     HomePage: http://blog.sina.com.cn/ly9061
#      Version: 0.0.1
#   LastChange: 2012-08-12 01:59:55
#      History:
=============================================================================*/

class Dog{
    int age;
    void jump(int age){
        System.out.println("狗的年龄是"+age);
        System.out.println("狗的年龄是"+this.age);

    }

}