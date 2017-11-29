package storage.api.service;


import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * Created by jun
 */
@FeignClient(serviceId = "mail")
public interface StorageApiService extends StorageService {
}
