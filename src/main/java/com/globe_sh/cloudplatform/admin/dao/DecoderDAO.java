package com.globe_sh.cloudplatform.admin.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.Param;
import com.globe_sh.cloudplatform.admin.entity.DecoderEntity;

@Mapper
public interface DecoderDAO {
    @Select("select * from c_data_decoder")
    public List < DecoderEntity > getDecoderAll();

    @Select("SELECT * FROM c_data_decoder WHERE data_code = #{code}")
    public DecoderEntity getDecoderByCode(@Param("code") String code);
/*
    @Delete("DELETE FROM raw WHERE id = #{id}")
    public int deleteById(String id);

    @Insert("INSERT INTO raw(id, first_name, last_name,email_address) " +
        " VALUES (#{id}, #{firstName}, #{lastName}, #{emailId})")
    public int insert(FactoryEntity raw);

    @Update("Update raw set first_name=#{firstName}, " +
        " last_name=#{lastName}, email_address=#{emailId} where id=#{id}")
    public int update(FactoryEntity employee);
*/    
}