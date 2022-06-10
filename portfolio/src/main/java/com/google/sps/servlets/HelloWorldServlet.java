package com.google.sps.servlets;

import java.io.IOException;
import com.google.gson.Gson;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Arrays;



/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
    ArrayList<String> names = new ArrayList<>(Arrays.asList("London", "Tokyo", "New York"));
    
  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    // response.setContentType("text/html;");
    // response.getWriter().println("Hello Shirley!");
    Gson gson = new Gson();
    String json = gson.toJson(names);

     // Send the JSON as the response
     response.setContentType("application/json;");
     response.getWriter().println(json);
  }
}
