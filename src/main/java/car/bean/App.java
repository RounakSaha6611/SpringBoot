package car.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("appBeanContext.xml");

        MyBean myBean = (MyBean) context.getBean("myBean");

        //myBean.setMessage("Print this");
        myBean.showMessage();
        System.out.println(myBean);

        MyBean myNextBean = (MyBean) context.getBean("myBean");

        myNextBean.setMessage("Print another this");
        myNextBean.showMessage();
        System.out.println(myNextBean);
    }
}
