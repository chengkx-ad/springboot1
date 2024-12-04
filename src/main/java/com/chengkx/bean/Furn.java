package com.chengkx.bean;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "furn01")

// 自动生成tostring  默认情况下会自动显示的声明一个无参构造器
//@ToString

/**
 * 等价于使用了@code @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode
 * 注意： 不会生成全参构造器
 */
@Data

/**
 * 这两个要一起用，如果使用了@All，系统会不再默认生成无参构造器，所以必须配合使用@No
 * 只要有别的构造器生成，就会覆盖默认的无参构造器，所以必须手动生成
 */
@NoArgsConstructor
@AllArgsConstructor

/**
 * 一些细节：
 * 第一点：要想在日志中输出furn结果，得配置Setter方法，但是配好setter方法后，只能显示在后端日志中
 * 第二点：前端页面中显示json数据时，需要getter方法才能显示，所以必须配置getter
 * 但是目前我直接配置了@Data，所以不需要另外配置了
 */

public class Furn {

    private Integer id;
    private String name;
    private String skill;

}
