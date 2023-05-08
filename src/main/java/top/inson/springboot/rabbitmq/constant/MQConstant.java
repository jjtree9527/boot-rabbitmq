package top.inson.springboot.rabbitmq.constant;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * @author jingjitree
 * @version 1.0
 * @className MQConstant
 * @description
 * @date 2022/1/3 17:09
 **/
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class MQConstant {

    /**
     * 交换机名称
     */
    public static final String DIRECT_EXCHANGE_NAME = "jxwl_cloud";

    /**
     * 队列名称
     */
    public static final String QUEUE_SMS_NAME = "jxwl_queue_sms";
    public static final String QUEUE_WECHAT_NAME = "jxwl_queue_wechat";
    public static final String QUEUE_EMAIL_NAME = "jxwl_queue_email";

    /**
     * routing key名称
     */
    public static final String ROUTING_KEY_SMS_NAME = "jxwl_cloud_sms";
    public static final String ROUTING_KEY_WECHAT_NAME = "jxwl_cloud_wechat";
    public static final String ROUTING_KEY_EMAIL_NAME = "jxwl_cloud_email";


}
