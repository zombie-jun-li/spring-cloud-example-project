package mail.api.service;

import mail.api.request.SendSimpleMailRequest;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jun.
 */
@FeignClient(serviceId = "mail")
public interface MailApiService extends MailService {

    @RequestMapping(value = "/simple-mail", method = RequestMethod.POST)
    void sendMail(@RequestBody SendSimpleMailRequest sendMailRequest);
}
