package com.webservice.springbootwebservice.Service;

import com.webservice.spring_boot_webservice.User;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {

    public static final Map<String, User> usuarios = new HashMap<>();

    @PostConstruct
    public void initialize(){
        User carlos = new User();
        User roger = new User();
        User steven = new User();

        carlos.setIdEmpleado(111);
        carlos.setEmpleado("Carlos");
        carlos.setSueldo(20000);

        roger.setIdEmpleado(112);
        roger.setEmpleado("Roger");
        roger.setSueldo(25000);

        steven.setIdEmpleado(113);
        steven.setEmpleado("Steven");
        steven.setSueldo(23000);

        usuarios.put(carlos.getEmpleado(), carlos);
        usuarios.put(roger.getEmpleado(), roger);
        usuarios.put(steven.getEmpleado(), steven);
    }

    public User getUser(String nombre){
        return usuarios.get(nombre);
    }
}