import com.hcy.bean.Address;
import com.hcy.bean.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Auther HCY
 * @Date 2022/3/14 21:24
 * @Version V1.0
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
//        Person person = context.getBean("person", Person.class);
//        Person person2 = context.getBean("person", Person.class);
//        //默认单例
//        System.out.println(person == person2);

        /*spring对象方式一：根据bean标签的id来获取对象*/
//        Person person = context.getBean("person", Person.class);
//        Person person2 = context.getBean("person",Person.class);
//        System.out.println(person == person2);

        /*spring对象方式二：根据bean的类型来获取对象
         * 注意：当通过类型进行获取的时候，如果存在两个相同类型对象，将无法完成获取工作
         * */
//        Person bean = context.getBean(Person.class);
//        System.out.println(bean);
        //默认单例
       // System.out.println(person == person2);

        /**
         * 当需要从容器中获取对象的时候，最好要保留无参构造方法，因为底层的实现是反射
         *
         *  Class clazz = Person.class;
         *  Object obj = clazz.newInstance();默认调用无参的构造方法，此方法已经被弃用
         *  Object obj = class.getDeclaredConstructor().newInstance()
         *
         */
/*        *//*spring对象方式三：根据构造器来获取对象*//*
        Person person2 = context.getBean("person", Person.class);
        System.out.println(person2);*/

/*        //参数数量相同的多个构造方法
        Person person5 = context.getBean("person5", Person.class);
        System.out.println(person5);*/

/*        //dates
        Person person = context.getBean("person", Person.class);
        System.out.println(person);*/

        /*P空间测试*/
//        Person person6 = context.getBean("person6", Person.class);
//        System.out.println(person6);

       /* //复杂类型测试
        Person person7 = context.getBean("person7", Person.class);
        System.out.println(person7);*/
        /*//验证内部bean无法从IOC获取对象属性值
        Address address2 = context.getBean("address2", Address.class);
        System.out.println(address2);*/


        /*//bean继承
        Person son = context.getBean("son", Person.class);
        System.out.println(son);
        Person parent = context.getBean("parent", Person.class);
        System.out.println(parent);*/

        /*//单例双例模式
        Person person8 = context.getBean("person8", Person.class);
        Person person81 = context.getBean("person8", Person.class);
        System.out.println("单例模式比较：" +(person8 == person81));
        Person person9 = context.getBean("person9", Person.class);
        Person person91 = context.getBean("person9", Person.class);
        System.out.println("多例模式比较：" +(person9 == person91));*/

        /*//工厂模式
        //静态模式
        Person person10 = context.getBean("person10", Person.class);
        System.out.println(person10);
        //实例模式
        Person person11 = context.getBean("person11", Person.class);
        System.out.println(person11);*/

        /*//继承FactoryBean来创建对象
        Person myFactoryBean = context.getBean("myFactoryBean", Person.class);
        System.out.println(myFactoryBean);*/

        //bean对象的初始化和销毁方法
        Person person12 = context.getBean("person12", Person.class);
        System.out.println("初始化：" + person12);
        ((ClassPathXmlApplicationContext)context).close();
    }
}
