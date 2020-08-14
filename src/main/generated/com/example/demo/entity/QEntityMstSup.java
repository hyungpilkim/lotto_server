package com.example.demo.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEntityMstSup is a Querydsl query type for EntityMstSup
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEntityMstSup extends EntityPathBase<EntityMstSup> {

    private static final long serialVersionUID = -726636492L;

    public static final QEntityMstSup entityMstSup = new QEntityMstSup("entityMstSup");

    public final NumberPath<Integer> _order = createNumber("_order", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> rank = createNumber("rank", Integer.class);

    public final NumberPath<Integer> winCnt = createNumber("winCnt", Integer.class);

    public final NumberPath<java.math.BigInteger> winPrc = createNumber("winPrc", java.math.BigInteger.class);

    public final NumberPath<java.math.BigInteger> winPrcGm = createNumber("winPrcGm", java.math.BigInteger.class);

    public final StringPath winRule = createString("winRule");

    public QEntityMstSup(String variable) {
        super(EntityMstSup.class, forVariable(variable));
    }

    public QEntityMstSup(Path<? extends EntityMstSup> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEntityMstSup(PathMetadata metadata) {
        super(EntityMstSup.class, metadata);
    }

}

