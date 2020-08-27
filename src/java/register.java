
import java.io.BufferedWriter;
import java.io.File;
import java.io.PrintWriter;
import javax.servlet.http.*;
import java.io.FileWriter;
import java.io.IOException;


public class register extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException 
    {
        res.setContentType("text/html");
        PrintWriter out  = res.getWriter();
        
        out.println("<h2>Hi welcome to the servlet in the html world.</h2>");
        String studentid = req.getParameter("studentid");
        String studentname = req.getParameter("studentname");
        String gender = req.getParameter("gender");
        String birthday = req.getParameter("birthday");
        String city = req.getParameter("city");
        String state = req.getParameter("state");
        String email = req.getParameter("emailid");
        String qualification = req.getParameter("qualification");
        String stream = req.getParameter("stream");
        
        out.println("name = "+studentid);
        out.println("id = "+studentname);
        out.println("gender = "+gender);
        out.println("bd = "+birthday);
        out.println("email = "+email);
        out.print("qual = "+qualification);
        out.println("stream = "+stream);
        
        String filepath = "C:\\Users\\W10\\Documents\\NetBeansProjects\\lbjprojectnew\\web\\newcsv.csv";
        
        File file = new File(filepath); 
        try{
            FileWriter fw = new FileWriter(filepath,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            pw.println(studentid+","+studentname+","+gender+","+birthday+","
                    +city+","+state+","+email+","+qualification+","+stream);
            pw.flush();
            pw.close();
            System.out.println("The Data has been saved Successfully");
            res.sendRedirect("./filewritecomplete.html");
        }
        catch(Exception e){
           
            System.out.println("error"+e);
        }
             
    }
}


