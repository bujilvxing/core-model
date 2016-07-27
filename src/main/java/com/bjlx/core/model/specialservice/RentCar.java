package com.bjlx.core.model.specialservice;

import com.bjlx.core.model.misc.Address;
import com.bjlx.core.model.misc.Contact;
import org.mongodb.morphia.annotations.Entity;

/**
 * Created by pengyt on 2016/7/26.
 */
@Entity
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

    /**
     * 出租的车辆信息
     */
    private Car car;

    /**
     * 是否可以买车险
     */
    private boolean  autoInsurance;

    /**
     * 车险价格
     */
    private Integer  autoInsurancePrice;

    /**
     * 是否送车给租客
     */
    private boolean sendCar;

    
}
