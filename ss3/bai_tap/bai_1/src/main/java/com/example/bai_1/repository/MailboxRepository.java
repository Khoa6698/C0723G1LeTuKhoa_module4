package com.example.bai_1.repository;

import com.example.bai_1.model.Mailbox;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MailboxRepository implements IMailboxRepository {
    private static final  Mailbox mailbox;
    static {
        mailbox = new Mailbox(1,"English",25,true,"King");
    }
    @Override
    public Mailbox getMailbox() {
        return mailbox;
    }

    @Override
    public void update(Mailbox mail) {
        mailbox.setLanguages(mail.getLanguages());
        mailbox.setPageSize(mail.getPageSize());
        mailbox.setSpamsFilters(mail.isSpamsFilters());
        mailbox.setSignature(mail.getSignature());
    }
}
