package com.lqw.redisui.command.key;

import com.lqw.redisui.command.JedisCommand;
import com.lqw.redisui.model.RedisVersion;
import com.lqw.redisui.utils.StringUtil;

public class KeyTypeCommand extends JedisCommand {

    private int db;

    private String key;

    public KeyTypeCommand(int id, int db, String key) {
        super(id);
        this.db = db;
        this.key = key;
    }

    @Override
    public void execute() {
        if(StringUtil.isBlank(key)){
            return;
        }
        jedis.select(db);
    }

    @Override
    public RedisVersion getSupportVersion() {
        return null;
    }
}
