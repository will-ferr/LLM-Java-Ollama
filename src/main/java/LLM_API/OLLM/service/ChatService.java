package LLM_API.OLLM.service;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Service;

@Service
public class ChatService {
    private final OllamaChatModel ollamaChatModel;

    public ChatService(OllamaChatModel ollamaChatModel) {
        this.ollamaChatModel = ollamaChatModel;
    }

    public String chat(String imput){
        return ollamaChatModel.call(imput);
    }
}
