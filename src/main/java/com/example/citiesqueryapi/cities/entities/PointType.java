package com.example.citiesqueryapi.cities.entities;

import org.hibernate.HibernateException;
import org.hibernate.dialect.Dialect;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.metamodel.model.convert.spi.BasicValueConverter;
import org.hibernate.type.descriptor.jdbc.JdbcType;
import org.hibernate.type.spi.TypeConfiguration;
import org.hibernate.usertype.UserType;
import org.postgresql.geometric.PGpoint;

import java.awt.*;
import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@SuppressWarnings("ALL")
public class PointType implements UserType {


  public int[] sqlTypes() {
    return new int[] {java.sql.Types.OTHER};
  }

  @Override
  public int getSqlType() {
    return 0;
  }

  @Override
  public Class returnedClass() {
    return Point.class;
  }

  @Override
  public boolean equals(Object x, Object y) throws HibernateException {
    return false;
  }

  @Override
  public int hashCode(Object x) throws HibernateException {
    return 0;
  }

  @Override
  public Object nullSafeGet(ResultSet rs, int position, SharedSessionContractImplementor session, Object owner) throws SQLException {
    return null;
  }


  public Object nullSafeGet(ResultSet rs, String[] names, SharedSessionContractImplementor session,
                            Object owner) throws HibernateException, SQLException {
    /* 1st */
    /*Object object = rs.getObject(names[0]);
    Double[] points = StringLocationUtils.transform(object.toString());
    return new Point(points[0], points[1]);*/

    /* 2nd */
    /*PGpoint value = (PGpoint) rs.getObject(names[0]);
    return new Point(value.x, value.y);*/

    /* 3rd */
    Object object = rs.getObject(names[0]);
    PGpoint point = new PGpoint(object.toString());
    return new Point();
  }

  @Override
  public void nullSafeSet(PreparedStatement st, Object value, int index,
                          SharedSessionContractImplementor session)
      throws HibernateException, SQLException {

  }

  @Override
  public Object deepCopy(Object value) throws HibernateException {
    return null;
  }

  @Override
  public boolean isMutable() {
    return false;
  }

  @Override
  public Serializable disassemble(Object value) throws HibernateException {
    return null;
  }

  @Override
  public Object assemble(Serializable cached, Object owner) throws HibernateException {
    return null;
  }

  @Override
  public Object replace(Object original, Object target, Object owner) throws HibernateException {
    return null;
  }

  @Override
  public long getDefaultSqlLength(Dialect dialect, JdbcType jdbcType) {
    return UserType.super.getDefaultSqlLength(dialect, jdbcType);
  }

  @Override
  public int getDefaultSqlPrecision(Dialect dialect, JdbcType jdbcType) {
    return UserType.super.getDefaultSqlPrecision(dialect, jdbcType);
  }

  @Override
  public int getDefaultSqlScale(Dialect dialect, JdbcType jdbcType) {
    return UserType.super.getDefaultSqlScale(dialect, jdbcType);
  }

  @Override
  public JdbcType getJdbcType(TypeConfiguration typeConfiguration) {
    return UserType.super.getJdbcType(typeConfiguration);
  }

  @Override
  public BasicValueConverter getValueConverter() {
    return UserType.super.getValueConverter();
  }
}