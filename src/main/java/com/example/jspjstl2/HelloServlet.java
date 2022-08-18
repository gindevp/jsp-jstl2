package com.example.jspjstl2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    List<Animal> list=new ArrayList<>();
    public void init() {

        list.add(new Animal("Mai Van Hoang","1983-08-20","Ha noi","https://scontent-hkt1-1.xx.fbcdn.net/v/t39.30808-6/299719300_6440214712691061_7718369177021701029_n.jpg?stp=dst-jpg_p526x296&_nc_cat=1&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=kDdN88jAPwcAX_VrdCw&_nc_ht=scontent-hkt1-1.xx&oh=00_AT_BjU_JAhpap6U0OkiewK3MO60Q-9_Vy1WL2JGaphLAeQ&oe=63032725"));
        list.add(new Animal("Mai Van Hoang","1983-08-20","Ha noi","https://scontent-hkt1-1.xx.fbcdn.net/v/t39.30808-6/299719300_6440214712691061_7718369177021701029_n.jpg?stp=dst-jpg_p526x296&_nc_cat=1&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=kDdN88jAPwcAX_VrdCw&_nc_ht=scontent-hkt1-1.xx&oh=00_AT_BjU_JAhpap6U0OkiewK3MO60Q-9_Vy1WL2JGaphLAeQ&oe=63032725"));
        list.add(new Animal("Mai Van Hoang","1983-08-20","Ha noi","https://scontent-hkt1-1.xx.fbcdn.net/v/t39.30808-6/299719300_6440214712691061_7718369177021701029_n.jpg?stp=dst-jpg_p526x296&_nc_cat=1&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=kDdN88jAPwcAX_VrdCw&_nc_ht=scontent-hkt1-1.xx&oh=00_AT_BjU_JAhpap6U0OkiewK3MO60Q-9_Vy1WL2JGaphLAeQ&oe=63032725"));
        list.add(new Animal("Mai Van Hoang","1983-08-20","Ha noi","https://scontent-hkt1-1.xx.fbcdn.net/v/t39.30808-6/299719300_6440214712691061_7718369177021701029_n.jpg?stp=dst-jpg_p526x296&_nc_cat=1&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=kDdN88jAPwcAX_VrdCw&_nc_ht=scontent-hkt1-1.xx&oh=00_AT_BjU_JAhpap6U0OkiewK3MO60Q-9_Vy1WL2JGaphLAeQ&oe=63032725"));
        list.add(new Animal("Mai Van Hoang","1983-08-20","Ha noi","https://scontent-hkt1-1.xx.fbcdn.net/v/t39.30808-6/299719300_6440214712691061_7718369177021701029_n.jpg?stp=dst-jpg_p526x296&_nc_cat=1&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=kDdN88jAPwcAX_VrdCw&_nc_ht=scontent-hkt1-1.xx&oh=00_AT_BjU_JAhpap6U0OkiewK3MO60Q-9_Vy1WL2JGaphLAeQ&oe=63032725"));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.setAttribute("list",list);
        request.getRequestDispatcher("hi.jsp").forward(request,response);
    }

    public void destroy() {
    }
}