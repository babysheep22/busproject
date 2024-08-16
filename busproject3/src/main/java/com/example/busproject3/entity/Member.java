package com.example.busproject3.entity;

import com.example.busproject3.constant.Role;
import com.example.busproject3.dto.MemberFormDto;
import jakarta.persistence.*;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;
import org.springframework.security.crypto.password.PasswordEncoder;


@Entity
@Table(name = "member")
@Getter
@Setter
@ToString
public class Member {
    @Id
    @Column(name = "member_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;

    private String phonenum;


    @Enumerated(EnumType.STRING)
    private Role role;

    public static Member createMember(MemberFormDto memberFormDto , PasswordEncoder passwordEncoder){
        Member member = new Member();
        member.setName(memberFormDto.getName());
        member.setEmail(memberFormDto.getEmail());
        member.setPassword(memberFormDto.getPassword());
        member.setPhonenum(memberFormDto.getPhonenum());
        String password = passwordEncoder.encode(memberFormDto.getPassword());
        member.setPassword(memberFormDto.getPassword());
        member.setRole(Role.ADMIN); //어드민으로 권한 설정
        return member;
    }
}
