package demo.todo.mybatis;

import org.piaohao.act.db.mybatis.BaseMapper;

import java.util.List;

public interface AccountMapper extends BaseMapper {
    List<Account> selectAll();
}
