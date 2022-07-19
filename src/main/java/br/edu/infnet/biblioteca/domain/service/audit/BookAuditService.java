package br.edu.infnet.biblioteca.domain.service.audit;

import br.edu.infnet.biblioteca.domain.model.data.book.BookAudit;
import br.edu.infnet.biblioteca.domain.notify.Notifier;
import org.springframework.stereotype.Service;

@Service
public class BookAuditService {

    private final Notifier notifier;

    public BookAuditService(final Notifier notifier) {
        this.notifier = notifier;
    }

    public void createAudit(final BookAudit rent, final String uuid) {
        System.out.printf("Logger: Create Audit to %s with uuid %s%n", rent, uuid);
        notifier.notify("leonardo@.infnet.com.br", "reserved book");
    }
}
