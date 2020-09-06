package com.jojoldu.book.springboot.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * 주요 어노테이션을 클래스에 가깝게
 */

@Getter
@NoArgsConstructor
/**
 * 테이블과 매칭될 클래스임을 나타냄
 * 클래스의 카멜케이스 이름을 언더스코어 네이밍(_)으로 테이블 이름 매칭
 * ex) SalesManager.java -> sales_manager table
 */
@Entity
public class Posts {

    @Id // 해당 테이블의 PK 필드
    /**
     * PK 생성 규칙
     * GenerationType.IDENTITY 옵션 추가 시 auto_increment
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 테이블의 칼럼을 나타냄
     * 굳이 선언하지 않더라도 해당 클래스의 필드는 모두 칼럼이 됨
     * 여기서 사용한 이유는 문자열의 사이즈를 늘리기 위해(default: VARCHAR(255))
     */
    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
