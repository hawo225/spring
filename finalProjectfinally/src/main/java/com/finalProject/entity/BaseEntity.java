package com.finalProject.entity;

import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

@EntityListeners(value = {AuditingEntityListener.class})
// Entity Listener란 엔티티의 변화를 감지하고 데이블의 데이터를 조작하는 일을 하며.

// AuditingEntityListener란 Spring Data JPA에서 시간에 대해서 자동으로 값을 넣어주며
// 하이버네이트가 생성일자, 수정일자 값을 자동으로 채워준다

@MappedSuperclass
@Getter
// BaseTimeEntity을 상속받음
public abstract class BaseEntity extends BaseTimeEntity{
// BaseTimeEntity에 @CreatedBy를 추가한다
	
    @CreatedBy
 // 데이터가 생성될 때 유저의 ID가 DB에 저장되게 기능을 구현한다.
    
    @Column(updatable = false)
    private String createdBy;

    @LastModifiedBy
    private String modifiedBy;

}