package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.User;
import services.AccountService;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        //start session
        HttpSession session = request.getSession();
        

        if (request.getParameter("username") != null && request.getParameter("password") != null) {
            String username = request.getParameter("username");
            session.setAttribute("username", username);
            String password = request.getParameter("password");
            session.setAttribute("password", password);
        }      
       

        if (request.getQueryString() != null) {
            if (request.getQueryString().equals("logout")) {
                session.invalidate();
                request.setAttribute("message", "You have sucessfully logged out.");
                getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
                return;

            }
        }

        getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        return;

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if (username == null || username.equals("") && password == null || password.equals("")) {
            request.setAttribute("message", "Please enter your username and password");
            //display form again
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            //after reload stop rest of execution
            return;
        }

         AccountService userlogin =  new AccountService();
         User loginInfo = userlogin.login(username,password);

        request.setAttribute("username", username);//setting values of textboxes
        request.setAttribute("password", password);

        if (loginInfo == null) {
            request.setAttribute("message", "Invalid login info");
            //display form again

            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
            //after reload stop rest of execution
            return;
        }

        getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
        return;
    }

}
