package com.feng.jun.webfj.common.base;

/**
 * Created by JackDan9 on 2018/8/2.
 */

import com.feng.jun.webfj.common.log.Logger;

/**
 *
 * @author JackDan9
 * @version webfj V1.0.0, 2018年5月23日
 * @see
 * @since webfj V1.0.0
 */

public class BaseController {
    public static final String FAILD = "faild";
    public static final String SUCCESS = "success";
    protected static final String MAX_LONG_AS_STRING = "9223372036854775807";

    /**
     * 日志
     */
    protected Logger logger = Logger.getLogger(this.getClass());
}
