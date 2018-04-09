package com.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import java.io.Serializable;
import java.util.Date;

/**
 * @author 范正荣
 * @Date 2018/2/18 0018 15:59.
 * 理财项目
 */
@Entity
@Getter
@Setter
@ToString
public class Project  implements Serializable {

    private static final long serialVersionUID = -1122438315340197898L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="project_id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "create_user_id")
    private Long create_user_id;

    @Column(name = "create_time")
    @JsonFormat(timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

}
