import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/WebJava")
public class WebJava extends HttpServlet{
    private static final long serialversionUID = 1L;
    public WebJava() {
        super();
    }
    protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out= response.getWriter();
        Date fecha = new Date();
        out.println("<html><body><h2>Probando cosa</h2><br/><h3>Fecha="+fecha+"</h3></body></html>");
        out.close();
    }
}
