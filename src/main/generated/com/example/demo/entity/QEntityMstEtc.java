package com.example.demo.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEntityMstEtc is a Querydsl query type for EntityMstEtc
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEntityMstEtc extends EntityPathBase<EntityMstEtc> {

    private static final long serialVersionUID = -726649990L;

    public static final QEntityMstEtc entityMstEtc = new QEntityMstEtc("entityMstEtc");

    public final NumberPath<Integer> _order = createNumber("_order", Integer.class);

    public final StringPath etc = createString("etc");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath payLimit = createString("payLimit");

    public final NumberPath<java.math.BigInteger> totalSalesPrc = createNumber("totalSalesPrc", java.math.BigInteger.class);

    public QEntityMstEtc(String variable) {
        super(EntityMstEtc.class, forVariable(variable));
    }

    public QEntityMstEtc(Path<? extends EntityMstEtc> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEntityMstEtc(PathMetadata metadata) {
        super(EntityMstEtc.class, metadata);
    }

}

