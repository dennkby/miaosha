package miaosha.dao;

import miaosha.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Tony on 2018/4/10.
 */

@Mapper
public interface UserDao {
    @Select("select * from user where id = #{id}")
    public User getUserById(@Param("id") int id);
}
