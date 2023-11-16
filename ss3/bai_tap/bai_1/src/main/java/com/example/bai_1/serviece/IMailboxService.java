package com.example.bai_1.serviece;

import com.example.bai_1.model.Mailbox;

import java.util.List;

public interface IMailboxService {
    Mailbox getMailbox();
    void update(Mailbox mailbox);
}
