package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {           

        //gets session
        HttpSession session = request.getSession();
        
        //sets local var to session value
        String username = (String) session.getAttribute("sessionUser");

        //checks if username is null if true forces login
        if (username == null || username.equals("")) {
            response.sendRedirect("login"); //redirects to login page
            return;
        }
        
        request.setAttribute("username", username ); //sets usernane to display on web page
        
        getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);  //loads home page
        
        return;

       
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        //does nothing
    }

}
