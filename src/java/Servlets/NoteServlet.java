/*
 * 
 * 
 * 
 */
package Servlets;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 850354
 */
public class NoteServlet extends HttpServlet {

   protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       //this method gets the path for the notes txt we have made
       String noteFilePath = getServletContext().getRealPath("/WEB-INF/note.txt");
       
       //by declaring this method learned we are preaparing the system to 
       //to read the content in the file
       
       BufferedReader readFile = new BufferedReader(new FileReader (new File (noteFilePath) ));
       // put both title and content in a zero arg constructor so they won't be
       //null
       
       String title = "";
       String content ="";
       
       // now we read the lines from the notes.txt
       title = title+ readFile.readLine();
       content = content + readFile.readLine();
               
               }

}
