# spring-boot-jsp

Demonstration of XSS vulnerability in JSP page.

How to reproduce:
1. Run Spring boot application via IDE.
2. Open url '/'.
3. Save text like '<script>alert('XSS')</script>'.

Read comments in 'index.jsp' file to protect that page.