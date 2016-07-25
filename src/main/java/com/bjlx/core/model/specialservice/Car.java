package com.bjlx.core.model.specialservice;

import com.bjlx.core.model.account.RealNameInfo;
import com.bjlx.core.model.misc.Address;
import com.bjlx.core.model.misc.Contact;
import org.bson.types.ObjectId;
import org.hibernate.validator.constraints.NotBlank;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

/**
 * Created by pengyt on 2016/7/25.
 * 汽车信息
 */
@Entity
public class Car {

    /**
     * 主键
     */
    @NotBlank
    @Id
    private ObjectId id;

    /**
     * 牌照
     */
    private String carId;

    /**
     * 档。1表示自动挡，2表示手动挡
     */
    private Integer transmission;

    /**
     * 车型
     */
    private String vehicleType;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 车主信息
     */
    private RealNameInfo carOwner;

    /**
     * 排量
     */
    private Float displacement;

    /**
     * 座位数
     */
    private Integer seatNum;

    /**
     * 名称
     */
    private String name;

    /**
     * 燃料。例如：汽油、天然气、电
     */
    private String fuelType;

    /**
     * 驱动方式
     */


    /**
     * 有无天窗
     */

    /**
     * GPS导航
     */

    /**
     * 座椅
     */

    /**
     * 气囊数量
     */

    /**
     * 变速箱类型
     */

    /**
     * 空调
     */
}
