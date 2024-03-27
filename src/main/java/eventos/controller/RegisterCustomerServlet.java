package eventos.controller;


import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import eventos.models.Customers;
import eventos.services.impl.*;
import eventos.utility.PasswordEncryption;

@WebServlet("/RegisterCustomerServlet")
public class RegisterCustomerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        String customerName = request.getParameter("name");
        String customerMobileNumber = request.getParameter("mobileNumber");
        String customerEmail = request.getParameter("email");
        String customerDobStr = request.getParameter("dob");
        String customerPassword = request.getParameter("password");
        System.out.println(customerPassword);
        String confirmPassword = request.getParameter("confirmPassword");
        System.out.println(confirmPassword);
        String status = "";

        if (customerPassword != null && customerPassword.equals(confirmPassword)) {
            try {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date customerDobDate = sdf.parse(customerDobStr);
                java.sql.Date customerDob = new java.sql.Date(customerDobDate.getTime());
                
                String[] encryptionResult = PasswordEncryption.encryption(confirmPassword);
                String customer_password_hash = encryptionResult[0];
                String customer_password_salt = encryptionResult[1];
        

                CustomerDAOImpl userService = new CustomerDAOImpl();
                status = userService.registerUser(customerName,customerMobileNumber,customerEmail,customerDob,customer_password_hash,customer_password_salt);
            } catch (ParseException e) {
                status = "Error parsing date.";
            }
        } else {
            status = "Password not matching!";
        }
        
        

        RequestDispatcher rd = request.getRequestDispatcher(status);
        rd.forward(request, response);
    }

    
}
