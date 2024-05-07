package com.example.backend4f;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "home", value = "/home")
public class HelloServlet extends HttpServlet {
    private String message;

    //INIT
    public void init() {
        message = "Benvenuto nel sito del Galvani!";
    }

    // GET
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Usera Agent: " + response.getHeader("User-Agent"));
        System.out.println("Accept Encoding" + response.getHeader("Accept-Encoding"));
        System.out.println("Connection" + response.getHeader("Connection"));
        response.setContentType("text/html");
        // Pagina di Benvenuto
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    // DELETE
    public void doDelete(HttpservletRequest request, HttpServletResponse response) throws IOException {
        public void sendError(){
            response.sendError(response.SC_NOT_FOUND, "Funzione non disponibile");
        }
    }

    // PUT
    public void doPut(HttpservletRequest request, HttpServletResponse response) throws IOException {
        public void sendError(){
            response.sendError(response.SC_NOT_IMPLEMENTED, "Funzione non implementata");
        }
    }

    // DESTROY
    public void destroy() {
    }
}