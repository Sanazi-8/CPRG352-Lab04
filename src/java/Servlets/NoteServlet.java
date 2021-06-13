/*
 * 
 * 
 * 
 */
package Servlets;

import Models.Note;
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
       title = title + readFile.readLine();
       content = content + readFile.readLine();
       //declare the note 
       Note note = new Note (title, content);
       //remember to stop the buffered file
       readFile.close();
       
       
       //set the attribute (notes)
       request.setAttribute("note", note);
       
       //now we are getting the edit button 
       String editButton = request.getParameter("edit");
       
       //if else statements to intake the input of the user
       //of wether they clicked the edit button or not
       
       if(editButton !=null){
         // in this condition the user has clicked the button
         //so we display the edit page 
         getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
       }
       else{
           //in this condition the user has not clicked edit
           //so the program shows the view page
           getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
       }
       
       
               }
   
   
   

}
