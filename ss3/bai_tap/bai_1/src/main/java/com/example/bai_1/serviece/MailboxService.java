package com.example.bai_1.serviece;

import com.example.bai_1.model.Mailbox;
import com.example.bai_1.repository.IMailboxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MailboxService implements IMailboxService{

    @Autowired
    private IMailboxRepository mailboxRepository;
    @Override
    public Mailbox getMailbox() {
       return mailboxRepository.getMailbox();
    }

    @Override
    public void update(Mailbox mailbox) {
        mailboxRepository.update(mailbox);
    }
}
