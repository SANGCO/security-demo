package io.sangco.securitydemo.domain;

import lombok.Data;
import org.hibernate.annotations.Entity;
import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;

@Data
@Entity
public class Member {
    @Id
    @GeneratedValue
    Long id;
    String name;
    String username;
    String remark;

    public Member() {
    }

    public Member(String name, String username, String remark) {
        this.name = name;
        this.username = username;
        this.remark = remark;
    }
}
