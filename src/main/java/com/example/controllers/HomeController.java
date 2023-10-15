package com.example.controllers;

<<<<<<< Updated upstream
=======
import com.example.Beans.ScopeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
>>>>>>> Stashed changes
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private final ApplicationContext applicationContext;

    public HomeController(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @RequestMapping("/protoType")
    @ResponseBody
    public String protoType() {
        ScopeBean protoTypeScopeBean1 = (ScopeBean) applicationContext.getBean("protoTypeScopeBean");
        String m1 = String.valueOf(protoTypeScopeBean1);
        ScopeBean protoTypeScopeBean2 = (ScopeBean) applicationContext.getBean("protoTypeScopeBean");
        String m2 = String.valueOf(protoTypeScopeBean2);

        return "m1: " + m1 + " m2: " + m2;
    }

    @RequestMapping("/singleTon")
    @ResponseBody
    public String singleTon() {
        ScopeBean singleTonScopeBean1 = (ScopeBean) applicationContext.getBean("singleTonScopeBean");
        String m1 = String.valueOf(singleTonScopeBean1);
        ScopeBean singleTonScopeBean2 = (ScopeBean) applicationContext.getBean("singleTonScopeBean");
        String m2 = String.valueOf(singleTonScopeBean2);

        return "m1: " + m1 + " m2: " + m2;
    }

    @RequestMapping("/request")
    @ResponseBody
    public String request() {
        ScopeBean requestScopeBean1 = (ScopeBean) applicationContext.getBean("requestScopeBean");
        String m1 = String.valueOf(requestScopeBean1);
        ScopeBean requestScopeBean2 = (ScopeBean) applicationContext.getBean("requestScopeBean");
        String m2 = String.valueOf(requestScopeBean2);

        return "m1: " + m1 + " m2: " + m2;
    }

    @RequestMapping("/session")
    @ResponseBody
    public String session() {
        ScopeBean sessionScopeBean1 = (ScopeBean) applicationContext.getBean("sessionScopeBean");
        String m1 = String.valueOf(sessionScopeBean1);
        ScopeBean sessionScopeBean2 = (ScopeBean) applicationContext.getBean("sessionScopeBean");
        String m2 = String.valueOf(sessionScopeBean2);

<<<<<<< Updated upstream
        return "version : " ;
=======
        return "m1: " + m1 + " m2: " + m2;
>>>>>>> Stashed changes
    }
}
