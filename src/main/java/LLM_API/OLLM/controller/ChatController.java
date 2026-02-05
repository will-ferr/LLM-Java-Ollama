package LLM_API.OLLM.controller;

import LLM_API.OLLM.service.ChatService;
import org.springframework.ai.chat.model.ChatModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/chat")
public class ChatController {

    private ChatService chatService;

    @Autowired
    public ChatController(ChatService chatService) {
        this.chatService = chatService;
    }

    @GetMapping("/message")
    public String chat(@RequestParam(value = "messagem") String messagem) {
        return chatService.chat(messagem);
    }
}
