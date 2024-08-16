package com.fuint.common.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 预约实体
 *
 * Created by FSQ
 * CopyRight https://www.fuint.cn
 */
@Data
public class BookDto implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("自增ID")
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty("预约名称")
    private String name;

    @ApiModelProperty("所属商户ID")
    private Integer merchantId;

    @ApiModelProperty("所属店铺ID")
    private Integer storeId;

    @ApiModelProperty("预约类型")
    private String type;

    @ApiModelProperty("图片地址")
    private String logo;

    @ApiModelProperty("关联商品ID")
    private Integer goodsId;

    @ApiModelProperty("类别ID")
    private Integer cateId;

    @ApiModelProperty("可预约日期")
    private String serviceDates;

    @ApiModelProperty("可预约日期列表")
    private List<DayDto> dateList;

    @ApiModelProperty("可预约时间段")
    private String serviceTimes;

    @ApiModelProperty("可预约时间段列表")
    private List<TimeDto> timeList;

    @ApiModelProperty("可预约员工ID")
    private String serviceStaffIds;

    @ApiModelProperty("描述")
    private String description;

    @ApiModelProperty("创建时间")
    private Date createTime;

    @ApiModelProperty("更新时间")
    private Date updateTime;

    @ApiModelProperty("最后操作人")
    private String operator;

    @ApiModelProperty("排序")
    private Integer sort;

    @ApiModelProperty("A：正常；D：删除")
    private String status;

}
