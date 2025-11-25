public class HtmlStatement extends Statement {

    @Override
    protected String headerString(Customer aCustomer) {
        return "<H1>Rentals for <EM>" + aCustomer.getName() +
               "</EM></H1><P>\n";
    }

    @Override
    protected String eachRentalString(Rental aRental) {
        return aRental.getMovie().getTitle() + ": " +
               aRental.getCharge() + "<BR>\n";
    }

    @Override
    protected String footerString(Customer aCustomer) {
        return "<P>You owe <EM>" + aCustomer.getTotalCharge() +
               "</EM><P>\n" +
               "On this rental you earned <EM>" +
               aCustomer.getTotalFrequentRenterPoints() +
               "</EM> frequent renter points<P>";
    }
}
