package com.deswaef.spring.examples.caching.mvc;

import com.deswaef.spring.examples.caching.model.CacheableMessage;
import com.deswaef.spring.examples.caching.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.apache.commons.lang3.StringUtils.isNumeric;

/**
 * User: Quinten
 * Date: 12-4-2014
 * Time: 00:04
 *
 * @author Quinten De Swaef
 */
@Controller
public class MessagesController {

    private IMessageService messageService;

    @Autowired
    public MessagesController(IMessageService messageService) {
        this.messageService = messageService;
    }

    @RequestMapping(value = "/messages/{messageId}")
    public @ResponseBody String getMessage(@PathVariable("messageId") String messageId) {
        if (!isNumeric(messageId)) {
            return "The id must be a numeric value";
        }

        CacheableMessage message = messageService.getById(Long.valueOf(messageId));
        if (message != null) {
            return message.getData();
        } else {
            return "this message was not found!";
        }
    }

}
