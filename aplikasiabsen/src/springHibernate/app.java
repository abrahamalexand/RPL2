/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springHibernate;

import springHibernate.service.karyawanService;
import springHibernate.view.viewKaryawan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {
    private static ApplicationContext applicationContext;
    
    public static void main(String[] args) {
        applicationContext = newClassPathXmlApplicationContext("classpath:spring-configuration.xml");
        new viewKaryawan().setVisible(true);
    }
    
    public static karyawanService getKaryawanService(){
        return(karyawanService)applicationContext.getBean("MahasiswaService");
    }
