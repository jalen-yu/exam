package cn.xingaohbd.exam.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.xml.internal.bind.v2.model.core.ID;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "ques_bank")
public class QuesBank extends BaseEntity<Integer> implements Serializable {

    private static final long serialVersionUID = -90548008976980309L;

    @Id
    @Column(name="id")
    private ID id;

    @Column(name = "create_time")
    private Date createTime = new Date();

    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    @Column(name = "update_time")
    private Date updateTime = new Date();

    @Column(name = "status")
    private Integer status;

    @Column(name = "ques_name")
    private String quesName;

    @Column(name = "select_A")
    private String selectA;

    @Column(name = "select_B")
    private String selectB;

    @Column(name = "select_C")
    private String selectC;

    @Column(name = "select_D")
    private String selectD;

    @Column(name = "answer")
    private String answer;

    @Column(name = "level")
    private Integer level;

    @Column(name = "ques_type_status")
    private Integer quesTypeStatus;

    @ManyToOne
    @JoinColumn(name="classify_id")
    private Classify classify;

    @Column(name = "analysis")
    private String analysis;

    @Override
    public String toString() {
        return "QuesBank{" +
                "id=" + id +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", status=" + status +
                ", quesName='" + quesName + '\'' +
                ", selectA='" + selectA + '\'' +
                ", selectB='" + selectB + '\'' +
                ", selectC='" + selectC + '\'' +
                ", selectD='" + selectD + '\'' +
                ", answer='" + answer + '\'' +
                ", level=" + level +
                ", quesTypeStatus=" + quesTypeStatus +
                ", classify=" + classify +
                ", analysis='" + analysis + '\'' +
                '}';
    }
}
