package com.bjlx.core.model.specialservice;

import com.bjlx.core.model.misc.Address;
import com.bjlx.core.model.misc.Contact;

/**
 * Created by pengyt on 2016/7/26.
 */

public class RentCar {

    /**
     * 价格
     */
    private Integer price;

    /**
     * 取车地点
     */
    private Address pickupAddr;

    /**
     * 还车地点
     */
    private Address returnAddr;

    /**
     * 联系人
     */
    private Contact contact;

    /**
     * 起租天数
     */
    private Integer minRentDay;
}
