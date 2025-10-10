package view;

public class HtmlView {

  /*
  public String renderPage(int clickCount) {
     return """
               <!DOCTYPE html>
               <html>
               <head>
                   <meta charset="UTF-8">
                   <title>Simple MVC Java Server</title>
               </head>
               <body>
                   <h2>Welcome to the MVC Java HTTP Server</h2>
                   <p>Button clicked <b>""" + clickCount + """</b> times.</p>
                   <form action="/click" method="get">
                       <button type="submit">Click Me</button>
                   </form>
               </body>
               </html>
               """;
  }
  */
  public String renderPage(int clickCount) {
    StringBuilder html = new StringBuilder();

    html.append("<!DOCTYPE html>\n");
    html.append("<html>\n");
    html.append("<head>\n");
    html.append("  <meta charset=\"UTF-8\">\n");
    html.append("  <title>Java MVC Server</title>\n");
    html.append("  <link rel=\"stylesheet\" href=\"/style.css\">\n");
    html.append("</head>\n");
    html.append("<body>\n");
    html.append("  <h1>Welcome to the Java MVC HTTP Server</h1>\n");
    html.append("  <p>Button clicked <b>").append(clickCount).append("</b> times.</p>\n");
    html.append("  <form action=\"/click\" method=\"get\">\n");
    html.append("    <button type=\"submit\">Click Me</button>\n");
    html.append("  </form>\n");
    html.append(
        "  <img src=\"/logo.png\" alt=\"Logo\" style=\"margin-top:20px;max-width:150px;\">\n");
    html.append("</body>\n");
    html.append("</html>\n");

    return html.toString();

    /*
          String html = new String(Files.readAllBytes(Paths.get("view/template.html")), StandardCharsets.UTF_8);
       html = html.replace("${count}", String.valueOf(clickCount));
    return html;

     */

  }
}
