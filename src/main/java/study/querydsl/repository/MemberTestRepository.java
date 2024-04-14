package study.querydsl.repository;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;
import study.querydsl.entity.Member;
import study.querydsl.entity.QMember;

import java.util.List;

import static study.querydsl.entity.QMember.*;


@Repository
public class MemberTestRepository extends QuerydslRepositorySupport {

    public MemberTestRepository() {
        super(Member.class);
    }


    public List<Member> basicSelect(){
        return from(member)
                .fetch();
    }

    public List<Member> basicSelectFrom(){
        return from(member)
                .fetch();
    }


}
