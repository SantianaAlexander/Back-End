package com.example.backend4f;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "login", value = "/login")
public class HelloServlet extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = System.out.println(request.getParameter("username"));
        String password = System.out.println(request.getParameter("password"));
        HttpSession session = request.getSession(true);
        session.setAttribute("username", username);
        session.setAttribute("password", password);

            private static final Map<String, String> credentials = new HashMap<>();

            public static void loadCredentials(String filePath) {
                File file = new File(filePath);

                try (Scanner scanner = new Scanner(file)) {
                    while (scanner.hasNextLine()) {
                        String line = scanner.nextLine();
                        String[] parts = line.split(" ", 2);
                        if (parts.length == 2) {
                            credentials.put(parts[0], parts[1]);
                        }
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("File non trovato: " + filePath);
                    e.printStackTrace();
                }
            }


            public static boolean authenticate(String user, String pass) {
                return credentials.getOrDefault(user, "").equals(pass);
            }

            public static void main(String[] args) {

                System.out.println(System.getProperty("user.dir"));
                loadCredentials("login.txt");

            }

        if (authenticate = true) {
            response.sendRedirect("/voti");
            session.setAttribute("username", username);
        } else {
            response.sendRedirect("/errore");
            session.setAttribute("error", "Credenziali non valide!")
        }

        response.setContentType("text/html");

    }

    public void doPut(HttpservletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/errore");
    }

    public void doDelete(HttpservletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/errore");
    }

    public void doOptions(HttpservletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/errore");
    }

    public void doTrace(HttpservletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect("/errore");
    }

    public void destroy() {
    }
}
