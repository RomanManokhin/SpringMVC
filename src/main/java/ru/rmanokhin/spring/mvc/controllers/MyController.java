package ru.rmanokhin.spring.mvc.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.rmanokhin.spring.mvc.employee.Employee;

import javax.validation.Valid;


@Controller
@RequestMapping("/employee")
public class MyController {
    //связывание адреса
    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
//        //т.к. Model работает через getter, мы можем установить дефолтные значения которые показываются в браузере
//        Employee employee = new Employee();
//        employee.setName("Ivan");
//        employee.setSurname("Ivanov");
//        employee.setSalary(5000);
        model.addAttribute("employee", new Employee());
        return "ask-emp-details-view";
    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model){
//        //получаем переданное значение в поле ask-emp-details-view.jsp
//        String empName = request.getParameter("employeeName");
//        //изменяем его
//        empName = "Mr. " + empName;
//        //и возвращаем в show-emp-details-view.jsp
//        model.addAttribute("nameAttribute", empName);
//        //атрибутов может быть сколько угодно
//        model.addAttribute("description", "HELL");
//
//        return "show-emp-details-view";
//    }

    //    @RequestMapping("/showDetails")
//    //@RequestParam("employeeName") - заменяет HttpServletRequest request если данных нужно немного лучше использовать его
//    //Если нужно большое количество данных из HTTP запроса, то будет необходимо использовать HTTPservlet
//    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model) {
//        //изменяем входящие значение
//        empName = "Mr. " + empName;
//        //и возвращаем в show-emp-details-view.jsp
//        model.addAttribute("nameAttribute", empName);
//
//        return "show-emp-details-view";
//    }

    @RequestMapping("/showDetails")
    //связываем атрибут модели по имени "employee" с параметром метода Employee emp и можем работать с полями этого
    //атрибута
    public String showEmpDetails(@Valid @ModelAttribute("employee") Employee emp,
                                 BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "ask-emp-details-view";
        } else {
            return "show-emp-details-view";
        }
    }
}
