package mail.boot.site.controller;

import mail.api.request.SendSimpleMailRequest;
import mail.api.service.MailApiService;
import mail.boot.site.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jun
 */
@RestController
public class MailController implements MailApiService {
    @Autowired
    private MailService mailService;

    @Override
    public void sendMail(@RequestBody SendSimpleMailRequest sendMailRequest) {
        mailService.sendMail(sendMailRequest);
    }
}
