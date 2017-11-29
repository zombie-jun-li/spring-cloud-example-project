package web.service.boot.upload;

import mail.api.request.SendSimpleMailRequest;
import mail.api.service.MailApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by jun.
 */
@Service
public class UploadService {

    @Autowired
    private MailApiService mailApiService;

    public void upload() {
        SendSimpleMailRequest sendSimpleMailRequest = new SendSimpleMailRequest();
        sendSimpleMailRequest.setTo("2114507542@qq.com");
        sendSimpleMailRequest.setSubject("hello world");
        sendSimpleMailRequest.setText("hello world");
        mailApiService.sendMail(sendSimpleMailRequest);
    }
}
