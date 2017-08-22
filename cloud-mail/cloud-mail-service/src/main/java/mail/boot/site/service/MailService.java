package mail.boot.site.service;

import mail.api.request.SendSimpleMailRequest;
import mail.boot.config.properties.MailProperties;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by jun.
 */
@Service
public class MailService {
    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private MailProperties mailProperties;

    public void sendMail(SendSimpleMailRequest sendMailRequest) {
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        BeanUtils.copyProperties(sendMailRequest, simpleMailMessage);
        simpleMailMessage.setSentDate(new Date());
        simpleMailMessage.setFrom(mailProperties.getUsername());
        javaMailSender.send(simpleMailMessage);
    }
}
