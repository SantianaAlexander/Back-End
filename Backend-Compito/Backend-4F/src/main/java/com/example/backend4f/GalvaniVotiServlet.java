package com.example.backend4f;

import java.util.ArrayList;
import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "voti", value = "/voti")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            String attributoSalvato = (String) session.getAttribute("username");
            public static int[] getGradesByUsername(attributoSalvato, String filePath) {
                File file = new File(filePath);
                try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        if (line.startsWith(attributoSalvato + " ")) {
                            return parseGrades(line);
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Error reading the file: " + e.getMessage());
                }
                return new int[]{};  // Return empty array if username is not found
            }

            private static int[] parseGrades(String data) {
                // Expect data in format "username [grade1, grade2, grade3, ...]"
                int startIndex = data.indexOf('[') + 1;
                int endIndex = data.indexOf(']');
                if (startIndex < 0 || endIndex < 0) return new int[]{};

                String gradesString = data.substring(startIndex, endIndex).trim();
                if (gradesString.isEmpty()) return new int[]{};

                String[] gradesArray = gradesString.split(",\\s*");
                int[] grades = new int[gradesArray.length];
                for (int i = 0; i < gradesArray.length; i++) {
                    try {
                        grades[i] = Integer.parseInt(gradesArray[i]);
                    } catch (NumberFormatException e) {
                        System.out.println("Failed to parse grade: " + gradesArray[i]);
                        return new int[]{};  // Return empty array in case of parsing error
                    }
                }
                return grades;
            }

            public static void main(String[] args) {
                String filePath = "voti.txt";  // Update with the actual file path
                attributoSalvato
                int[] grades = getGradesByUsername(attributoSalvato, filePath);
                if (grades.length > 0) {
                    System.out.println("Grades for " + attributoSalvato + ":");
                    for (int grade : grades) {
                        System.out.print(grade + " ");
                    }
                } else {
                    System.out.println("No grades found for " + attributoSalvato);
                }
            }

        response.setContentType("text/html");


    }

    public void doPut(HttpservletRequest request, HttpServletResponse response) throws IOException {
        public void sendError(){
            response.sendError(response.SC_NOT_IMPLEMENTED, "Funzione non implementata");
        }
    }

    public void doPost(HttpservletRequest request, HttpServletResponse response) throws IOException {
        public void sendError(){
            response.sendError(response.SC_NOT_FOUND, "Funzione non disponibile");
        }
    }

    public void destroy() {
    }
}