/*
 * ©2002-2016 SDZN, Inc. All rights reserved.
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * TestServlet 功能描述：Servlet注入测试，不需要在web.xml中进行配置
 *
 * @author RickyLee【lsr@sdzn.com.cn】
 * @date 2017/3/22 17:53
 */
@WebServlet(name = "testServlet",urlPatterns = "/login/*")
public class TestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}