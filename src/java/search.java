
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.Scanner;
import javax.servlet.RequestDispatcher;
       
public class search extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException 
    {
        res.setContentType("text/html");
        PrintWriter out  = res.getWriter();
        String searchvalue = req.getParameter("studentid");
        out.println("<h2>Hi welcome to the servlet in the html world this is search page.</h2>"+searchvalue);
       
        
        Scanner sc;
        String filepath = "C:\\Users\\W10\\Documents\\NetBeansProjects\\lbjprojectnew\\web\\newcsv.csv";
        
        
        boolean found = false;
        String studentid = ""; String studentname = "";String gender = "";String city = "";String birthday = ""; 
        String state = "";
        String email = ""; String qualification = ""; String stream = ""; 
        
        try{
            
            sc = new Scanner(new File(filepath));
            sc.useDelimiter("[,\n]");
            
            while(sc.hasNext() && !found)
            {   
                studentid = sc.next();
                out.println(studentid);
                studentname = sc.next();
                gender = sc.next();
                birthday = sc.next();
                city = sc.next();
                state = sc.next();
                email = sc.next();
                qualification = sc.next();
                stream = sc.next();
                
                
                if(studentid.equals(searchvalue))
                {
                    found = true;
                }
            }
            if(found)
            {
                RequestDispatcher d = req.getRequestDispatcher("./displaysearchstudent.jsp");
                req.setAttribute("studentid", studentid);
                req.setAttribute("studentname", studentname);
                req.setAttribute("gender", gender);
                req.setAttribute("birthday", birthday);
                req.setAttribute("city", city);
                req.setAttribute("state", state);
                req.setAttribute("email", email);
                req.setAttribute("qualification", qualification);
                req.setAttribute("stream", stream);
                
                
                d.forward(req, res);
                out.println("<h2>RECORD FOUND</h2>");
                out.println("here is the detail");
               
                out.println("id:- "+studentid+"Name:- "+studentname+ "gender:- "+gender+"birthday:- "+birthday+
                        "qualification:- "+qualification+ "stream:-"+stream+"email:- "+email);
            }
            if(!found)
            {
                res.sendRedirect("newhtmlerror.html");
                
            }
        }
        catch(Exception ex)
        {
            System.out.println("error"+ex);
        }
        out.println("<h2>Hi welcome to the servlet in the html world this is search page.</h2>"+searchvalue);
    }
}




