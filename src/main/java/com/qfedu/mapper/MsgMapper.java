package com.qfedu.mapper;

import com.qfedu.domain.Message;

import java.util.List;

public interface MsgMapper {
   int insert(Message msg);

   List<Message> query();
}
