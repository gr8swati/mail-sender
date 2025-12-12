
This is a simple email notification micro-service built using Spring Boot. I configured Gmail SMTP in the properties file and used the spring-boot-starter-mail dependency, which auto-configures JavaMailSender. The controller only exposes a REST endpoint /mail/send. When this API is called, it delegates the request to the service class. The service builds the email content using SimpleMailMessage and uses JavaMailSender to send it via SMTP.

I used a layered approach—Controller for HTTP, Service for business logic, and Spring Boot handles mail configuration. This structure keeps the app clean, testable, and easy to extend—for example, sending HTML templates or attachments later.
