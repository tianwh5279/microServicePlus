package springcloud.service.impl;

import com.djtu.springcloud.entities.Payment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springcloud.dao.PaymentDao2;
import springcloud.service.PaymentService;

import javax.annotation.Resource;

/**
 * @Author TWH
 * @Date 2020/3/14 16:59
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao2 paymentDao;

    @Override
    @Transactional
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment findPaymentById(Integer id) {
        return paymentDao.findPaymentById(id);
    }
}
