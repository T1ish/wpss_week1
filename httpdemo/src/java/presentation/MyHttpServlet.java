/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Z
 */
@WebServlet(name = "MyHttpServlet", urlPatterns = {"/MyHttpServlet"})
public class MyHttpServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String n = "Ali";
        String u = "Civilingeniør i Software Teknologi";
        String j = "Java EE";
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Lidt om mig</title>");   
            out.println("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>");
            out.println("</head>");
            out.println("<body>");
            out.println("<header>");
            out.println("<nav>");
            out.println("<a href=\"kontakt.html\">Kontakt Information</a>");
            out.println("</nav>");
            out.println("</header>");
            out.println("<main>");
            out.println("<section>");
            out.println("<h1>Kort præsentation</h1>");
            out.println("<img src=\"img/logo.PNG\" alt=\"En avatar af mig\" />");
            out.println("<h2>Hvem er jeg</h2>");
            out.println("<p>Jeg er drengen med kasketten i klassen. Du kan kalde mig for " + n + " som de fleste gør. Det er trods alt mit efternavn. Billedet ovenfor repræsenterer mig meget fint og blev brugt fordi jeg ikke har billeder af mig på computeren. Jeg er uddannet " + u + " fra DTU. Desværre er det ret mange mangler sammenlignet med arbejdslivet og jeg er derfor igang med at udfylde hullerne. Jeg kan nemlig ikke lide at jeg ikke ved nok om det jeg skal arbejde med, heh.</p>");
            out.println("<p>Jeg elsker at lære nye ting, lige i øjeblikket er det kun om IT og nærmere bestemt programmeringssprog og Java EE. Der er så meget at lære, og firmaer forventer at du allerede kan det som en erfaren udvikler selvom man er nyuddannet...lidt ærgeligt, men desværre sandt. Heldigvis er det det vi skal lære i faget så jeg er rigtig glad for at se hvor jeg starter i Java EE så jeg kan fortsætte denne sti efter fagets slutning og blive bedre bekendt med Java stakken.</p>");
            out.println("<p>På min github kan man se at der ligger projekter i Ruby on Rails og Grails (Groovy). Det skyldes at jeg har intet erfaring/lært om webudvikling og dynamiske sprog. Jeg fandt en tutorial og en bog, og så var det bare at komme igang. Det er utroligt hvor meget jeg får lært i første omgang og jeg kommer nok til at gå disse igennem en gang til for at få de fleste detajler på plads.</p>");
            out.println("<p>IT er dog ikke det eneste jeg kan lide. Jeg kan også lide japansk tegneserie, kultur og sprog. Det meget interessant at se at japanese har tegneserie bestemt for forskellige alder og de går virkelig op i deres efterforskning for deres tegneserie emne. Jeg er også for...vedikkehvilke.gang gået igang med Japansk igen.</p>");
            out.println("<h2>Dette fag</h2>");
            out.println("<p>Grunden til at jeg har taget dette fag er at vi ude på DTU aldrig fik lært webprogrammering, hverken client-side eller server-side. Derfor er jeg utrolig glad for at det fandtes her. Selvom jeg havde troet at vi ville lærer PHP i første omgang, er jeg utrolig glad for at det er " + j + ". Jeg har ofte undret mig over hvordan jeg skulle starte på " + j + " fordi det er enormt. Vi lærte kun Java SE ude på skolen. Når jeg spurgte folk på arbejdet så vidste de det ikke fordi de har alle lært lidt her og der, og på nettet så ændres ordenen for hver person man spørger. Derfor er det rigtig godt at faget giver mig mit startpunkt ind til " + j + " verdenen.</p>");
            out.println("<p>I dette fag regner jeg med at lære Servlets og JSP godt nok til at bruge det i arbejdslivet. Jeg regner med at jeg herefter kan bygge videre på denne viden med EJB, JSF, JPA og mere. Jeg regner med at kunne senere lettere skifte det ud med Spring Framework og lærer om Hibernate som erstatning for JPA. Jeg regner med at blive en fullstack-java udvikler før jeg går ind på applikationsarkitekt. Jep, jeg regner med en hel masse da dette fag vil åbne op for en hel masse muligheder for mig!</p>");
            out.println("</section>");
            out.println("</main>");
            out.println("</body>");
            out.println("</html>");
            
            
            
            
            /* TODO output your page here. You may use following sample code. */
            /*
            String name = request.getParameter("navn");
            String age = request.getParameter("alder");
            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet MyHttpServlet</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet MyHttpServlet at " + request.getContextPath() + "</h1>");
                out.println("<h1>Hej " + name + " fra serveren.</h1>");
                out.println("</body>");
                out.println("</html>"); 
            }
            */
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
