package com.rugby.base.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Yuanbo on 2016/12/6.
 */
@Getter
@Setter
@ToString
public abstract class BaseEntity implements Serializable{
    String id;//id
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Date createDate;//创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    Date modifyDate;//修改时间

}
