package springbook.utility;

import org.springframework.context.support.GenericApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ncrash on 2014. 2. 24..
 */
public class BeanDefinitionUtils {
    public static void printBeanDefinitions(GenericApplicationContext applicationContext) {
        List<List<String>> roleBeanInfos = new ArrayList<List<String>>();

        roleBeanInfos.add(new ArrayList<String>());
        roleBeanInfos.add(new ArrayList<String>());
        roleBeanInfos.add(new ArrayList<String>());

        for (String name : applicationContext.getBeanDefinitionNames()) {
            int role = applicationContext.getBeanDefinition(name).getRole();
            List<String> beanInfos = roleBeanInfos.get(role);
            beanInfos.add(role + "\t" + name + "\t" + applicationContext.getBean(name).getClass().getName());
        }

        for(List<String> beanInfos : roleBeanInfos) {
            for(String beanInfo : beanInfos) {
                System.out.println(beanInfo);
            }
        }
    }
}
