package com.project.services.socket.Message;

/**
 * Created by Administrator on 2016/3/7.
 */
public class MoneyBox extends MessageBase {
    public int Total;
    public int CurrentPackt;
    public String state;

    public void Load(String[] str) {
        super.Load(str);
            Cmd = str[0];
            Total = Integer.parseInt(str[1]);
            CurrentPackt = Integer.parseInt(str[2]);
            state = str[3];


    }
}
