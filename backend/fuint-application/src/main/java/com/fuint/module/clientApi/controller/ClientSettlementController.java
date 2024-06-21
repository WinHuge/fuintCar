package com.fuint.module.clientApi.controller;

import com.fuint.common.enums.YesOrNoEnum;
import com.fuint.common.param.SettlementParam;
import com.fuint.common.service.OrderService;
import com.fuint.framework.exception.BusinessCheckException;
import com.fuint.framework.web.BaseController;
import com.fuint.framework.web.ResponseObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * 结算中心接口
 *
 * Created by FSQ
 * CopyRight https://www.fuint.cn
 */
@Api(tags="会员端-订单结算相关接口")
@RestController
@AllArgsConstructor
@RequestMapping(value = "/clientApi/settlement")
public class ClientSettlementController extends BaseController {

    /**
     * 订单接口
     * */
    private OrderService orderService;

    /**
     * 订单结算
     */
    @ApiOperation(value = "提交订单结算")
    @RequestMapping(value = "/submit", method = RequestMethod.POST)
    @CrossOrigin
    public ResponseObject submit(HttpServletRequest request, @RequestBody SettlementParam param) throws BusinessCheckException {
        String isWechat = request.getHeader("isWechat") == null ? YesOrNoEnum.NO.getKey() : request.getHeader("isWechat");
        param.setIsWechat(isWechat);
        Map<String, Object> result = orderService.doSettle(request, param);
        return getSuccessResult(result);
    }
}
