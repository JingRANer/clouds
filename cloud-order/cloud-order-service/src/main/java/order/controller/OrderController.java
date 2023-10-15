package order.controller;

import org.springframework.web.bind.annotation.*;
import com.cloud.order.rpc.pojo.User;

@RestController
@RequestMapping("/order")
public class OrderController {

//    @Autowired
//    private OrderService orderService;

    @GetMapping("/{id}")
    public User queryOrderByUserId(@PathVariable("id") Long id,
                                   @RequestHeader(value = "Truth", required = false) String truth) {
        // 根据id查询订单并返回
        User user = new User();
        user.setId(String.valueOf(id));

        System.out.println("id:" + id + ", header："+truth);
        return user;
    }
}
