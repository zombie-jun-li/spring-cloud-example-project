package mail.api.service;

import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by jun.
 */
@FeignClient(serviceId = "mail")
public interface MailService {
}
