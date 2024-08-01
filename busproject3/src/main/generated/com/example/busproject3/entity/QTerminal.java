package com.example.busproject3.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTerminal is a Querydsl query type for Terminal
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTerminal extends EntityPathBase<Terminal> {

    private static final long serialVersionUID = -1146082142L;

    public static final QTerminal terminal = new QTerminal("terminal");

    public final DateTimePath<java.time.LocalDateTime> createdAt = createDateTime("createdAt", java.time.LocalDateTime.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Double> latitude = createNumber("latitude", Double.class);

    public final StringPath location = createString("location");

    public final NumberPath<Double> longitude = createNumber("longitude", Double.class);

    public final StringPath terminalId = createString("terminalId");

    public final StringPath terminalName = createString("terminalName");

    public QTerminal(String variable) {
        super(Terminal.class, forVariable(variable));
    }

    public QTerminal(Path<? extends Terminal> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTerminal(PathMetadata metadata) {
        super(Terminal.class, metadata);
    }

}

