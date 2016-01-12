package com.tester.learn.tools.htmlunit;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlAnchor;
import com.gargoylesoftware.htmlunit.html.HtmlDivision;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.util.List;

/**
 * Created by leosong on 16-1-12.
 */
public class Test {


    public static void main(String[] args)
    {

        try
        {
            WebClient webClient = new WebClient();
            webClient.getOptions().setJavaScriptEnabled(true);
            webClient.getOptions().setCssEnabled(false);
            HtmlPage page = webClient.getPage("http://www.sse.com.cn/assortment/stock/list/name/");
//            HtmlDivision div = page.getHtmlElementById("dateList");
//            System.out.println(div.asText());
//
//            HtmlDivision divPagination = page.getHtmlElementById("staticPagination");
//            System.out.println(divPagination.asText());
            List<?> spanList =page.getByXPath("//div[@id='staticPagination']");
            System.out.println(spanList);
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }


    }

}
