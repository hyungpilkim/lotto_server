package com.example.demo.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEntityMst is a Querydsl query type for EntityMst
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEntityMst extends EntityPathBase<EntityMst> {

    private static final long serialVersionUID = 1924500410L;

    public static final QEntityMst entityMst = new QEntityMst("entityMst");

    public final NumberPath<Integer> _order = createNumber("_order", Integer.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> num1 = createNumber("num1", Integer.class);

    public final NumberPath<Integer> num2 = createNumber("num2", Integer.class);

    public final NumberPath<Integer> num3 = createNumber("num3", Integer.class);

    public final NumberPath<Integer> num4 = createNumber("num4", Integer.class);

    public final NumberPath<Integer> num5 = createNumber("num5", Integer.class);

    public final NumberPath<Integer> num6 = createNumber("num6", Integer.class);

    public final NumberPath<Integer> num7 = createNumber("num7", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> regDt = createDateTime("regDt", java.time.LocalDateTime.class);

    public final StringPath winDate = createString("winDate");

    public QEntityMst(String variable) {
        super(EntityMst.class, forVariable(variable));
    }

    public QEntityMst(Path<? extends EntityMst> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEntityMst(PathMetadata metadata) {
        super(EntityMst.class, metadata);
    }

}

