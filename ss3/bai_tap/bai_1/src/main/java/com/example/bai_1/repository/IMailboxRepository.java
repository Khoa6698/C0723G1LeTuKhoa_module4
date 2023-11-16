package com.example.bai_1.repository;

import com.example.bai_1.model.Mailbox;

import java.util.List;

public interface IMailboxRepository {
    Mailbox getMailbox();

    void update(Mailbox mailbox);
}
