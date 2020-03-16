package springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author TWH
 * @Date 2020/3/14 14:33
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class Payment8005 {

    public static void main(String[] args) {
        SpringApplication.run(Payment8005.class,args);
    }
}
