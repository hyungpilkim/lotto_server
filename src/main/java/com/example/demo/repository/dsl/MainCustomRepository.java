package com.example.demo.repository.dsl;

import java.util.List;

import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.QEntityMst;
import com.example.demo.entity.QEntityMstEtc;
import com.example.demo.entity.QEntityMstSup;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;

import lombok.extern.slf4j.Slf4j;

@Repository
@Slf4j
public class MainCustomRepository extends QuerydslRepositorySupport{
	private final JPAQueryFactory queryFactory;

	public MainCustomRepository(JPAQueryFactory queryFactory) {
        super(MainDto.class);
        this.queryFactory = queryFactory;
    }

	/**
	 * 회차 당첨번호 
	 * @param drwNo
	 * @return
	 */
	public MainDto getLottoInfo(int drwNo) {
		log.debug("drwNo : " + drwNo);
		QEntityMst entityMst = QEntityMst.entityMst;
		QEntityMstEtc entityMstEtc = QEntityMstEtc.entityMstEtc;
		
		BooleanBuilder builder = new BooleanBuilder();
		if (drwNo > 0) {
            builder.and(entityMst._order.eq(drwNo));
        }
		
		MainDto result = queryFactory.select(Projections.bean(MainDto.class 
				,entityMst._order
				,entityMst.num1
				,entityMst.num2
				,entityMst.num3
				,entityMst.num4
				,entityMst.num5
				,entityMst.num6
				,entityMst.num7
				,entityMst.winDate
				,entityMstEtc.etc
				,entityMstEtc.totalSalesPrc
				,entityMstEtc.payLimit
				))
			  .from(entityMst)
			  .innerJoin(entityMstEtc)
			  .on(entityMst._order.eq(entityMstEtc._order))
			  .where(builder)
			  .orderBy(entityMst._order.desc())
			  .fetchFirst();
		
		if (result != null) {
			result.setGradeList(getGradeInfo(result.get_order()));
		}
		
		return result;
	}
	
	/**
	 * 회차 순위별 당첨금액 리스트 
	 * @param drwNo
	 * @return
	 */
	private List<MainDtoGradeInfo> getGradeInfo(int drwNo) {
		QEntityMstSup entityMstSup = QEntityMstSup.entityMstSup;
		return queryFactory.select(Projections.bean(MainDtoGradeInfo.class 
				,entityMstSup.rank
				,entityMstSup.winPrc
				,entityMstSup.winCnt
				,entityMstSup.winPrcGm
				,entityMstSup.winRule
				))
			  .from(entityMstSup)
			  .where(entityMstSup._order.eq(drwNo))
			  .fetch();
	}
}
