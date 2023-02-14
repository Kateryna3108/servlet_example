package com.example.servlet_example;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerViewServlet extends HttpServlet {
    private List<Customer> customers = Arrays.asList(new Customer (1, "Kateryna", "Havrylova", "famale", 40, "SCC", "Sumy", 40024, "099", "kh@mail"),
                                                    new Customer(2, "Alex", "Vorona", "male", 38, "PB", "Sumy", 40016, "067", "ov@mail"),
                                                    new Customer(3, "Valentyna", "Hubar", "famale", 40, "SCC", "Chernihiv", 30016, "098", "vh@mail"),
                                                    new Customer(4, "Vasyl", "Kukhar", "male", 48, "no", "Chernihiv", 30016, "098", "vk@mail"),
                                                    new Customer (5, "Kateryna", "Havrylova", "famale", 40, "SCC", "Sumy", 40024, "099", "kh@mail"),
                                                    new Customer(6, "Alex", "Vorona", "male", 38, "PB", "Sumy", 40016, "067", "ov@mail"),
                                                    new Customer(7, "Valentyna", "Hubar", "famale", 40, "SCC", "Chernihiv", 30016, "098", "vh@mail"),
                                                    new Customer(8, "Vasyl", "Kukhar", "male", 48, "no", "Chernihiv", 30016, "098", "vk@mail"),
                                                    new Customer (9, "Kateryna", "Havrylova", "famale", 40, "SCC", "Sumy", 40024, "099", "kh@mail"),
                                                    new Customer(10, "Alex", "Vorona", "male", 38, "PB", "Sumy", 40016, "067", "ov@mail"),
                                                    new Customer(11, "Valentyna", "Hubar", "famale", 40, "SCC", "Chernihiv", 30016, "098", "vh@mail"),
                                                    new Customer(12, "Vasyl", "Kukhar", "male", 48, "no", "Chernihiv", 30016, "098", "vk@mail"));

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customersList", customers);
        request.setAttribute("customers", getCustomerTable());
        request.getRequestDispatcher("/WEB-INF/jsp/customers.jsp").forward(request, response);
    }

    public String getCustomerTable() {
        StringBuilder sb = new StringBuilder();
        for (Customer customer : customers) {
            sb.append("<tr><td>")
                    .append(customer.getId())
                    .append("</td><td>")
                    .append(customer.getName())
                    .append("</td><td>")
                    .append(customer.getLastName())
                    .append("</td><td>")
                    .append(customer.getGender())
                    .append("</td><td>")
                    .append(customer.getAge())
                    .append("</td><td>")
                    .append(customer.getWork())
                    .append("</td><td>")
                    .append(customer.getCity())
                    .append("</td><td>")
                    .append(customer.getPostNumber())
                    .append("</td><td>")
                    .append(customer.getPhone())
                    .append("</td><td>")
                    .append(customer.getMail())
                    .append("</td></tr>");
        }
        return sb.toString();

    }
}
