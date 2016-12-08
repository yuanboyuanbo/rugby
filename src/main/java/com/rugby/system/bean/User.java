package com.rugby.system.bean;


import com.rugby.base.bean.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Yuanbo on 2016/12/6.
*/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity {
    private String name; //真实姓名
    private String password; //密码
    private String telephone; //电话号码
    private String address; //家庭地址

}
