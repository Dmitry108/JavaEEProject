package ru.home.aglar.servlets;

import ru.home.aglar.domain.DBRepository;
import ru.home.aglar.model.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class ProductsPageServlet extends HttpServlet {
//    private static Logger logger = LoggerFactory.getLogger(ProductsPageServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.printf("<html><body>");
        List<Product> products = DBRepository.getAllProducts();
        for (Product product : products) {
            out.printf(String.format("<h2>%s</h2>", product));
        }
        out.printf("</body></html>");
        out.close();
    }
}