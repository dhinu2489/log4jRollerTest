package com.dnb.log.servlet;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by KumarDin on 12/15/2016.
 */
public class LogServlet extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(LogServlet.class);

    private String message;

    public void init() throws ServletException
    {
        // Do required initialization
        LOGGER.debug("Initializing the LogServlet");
        message = "Message Logged.";
        LOGGER.debug("Initialization Completed");
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {

        LOGGER.debug("Servicing the Get Method.");
        // Set response content type
        response.setContentType("text/html");

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("<h1>" + message + "</h1>");
        LOGGER.debug("Servicing Completed.");
    }

    public void destroy()
    {
        // do nothing.
        LOGGER.debug("Servlet Destroyed");
    }
}
