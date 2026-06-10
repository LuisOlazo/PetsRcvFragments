package com.luis.petsrcv;

import java.util.Properties;
import java.util.function.Consumer;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSender {
    private static final String EMAIL_FROM = "your_email@gmail.com";//Using Gmail
    private static final String PASSWORD = "your_application_password";//Manage application password

    public static void sendEmail(String name, String email , String messages, Consumer<Exception> onFailure) {
        new Thread(() -> {
            try {
                //SMTP server properties
                Properties props = new Properties();
                props.put("mail.smtp.host", "smtp.gmail.com");      // Gmail Server
                props.put("mail.smtp.port", "587");                  // SMTP Port
                props.put("mail.smtp.auth", "true");                 // Authentication required
                props.put("mail.smtp.starttls.enable", "true");      // Enable TLS

                // Create the session with authentication
                Session session = Session.getInstance(props, new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(EMAIL_FROM, PASSWORD);
                    }
                });

                //Create msg
                MimeMessage message = new MimeMessage(session);
                message.setFrom(new InternetAddress(EMAIL_FROM));
                message.setRecipient(Message.RecipientType.TO, new InternetAddress(EMAIL_FROM));
                message.setSubject("New contact email from app: " + name);

                //Message body
                String cuerpo = "You have received a new contact message:\n\n"
                        + "Names: " + name + "\n\n"
                        + "Email: " + email + "\n\n"
                        + "Message:\n" + messages;

                message.setText(cuerpo);

                // Send Email
                Transport.send(message);

            } catch (Exception e) {
                onFailure.accept(e);
            }
        }).start();
    }
}
