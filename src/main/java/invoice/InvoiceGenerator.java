package invoice;

public class InvoiceGenerator {

    private final EmailSender email;
    private final InvoiceDao dao;

    public InvoiceGenerator(EmailSender email, InvoiceDao dao) {
        this.email = email;
        this.dao = dao;
    }

    public Invoice generate(Invoice invoice) {

        double amount = invoice.getNetValue();

        Invoice nf = new Invoice(amount, tax(amount));

        email.send(nf);
        dao.persist(nf);

        return nf;
    }

    private double tax(double amount) {
        return amount * 0.06;
    }
}