Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			System.out.println("Check-in date (dd/MM/yyyy):");
			Date checkIn = sdf.parse(sc.next()); }
catch (ParseException e) {
			System.out.println("Invalid date format");
		}
		catch (DomainExeception e) {
			System.out.println(e.getMessage());
		}

/*Vale ressalta o tratamento de exceção feita no codigo em si, o ParseException captura os possiveis erros escrevendo uma data como scanner
ja o DomainExeception é uma exceção criada de forma personalizada: */
package model.exceptions;

public class DomainExeception extends Exception{

	private static final long serialVersionUID = 1L;
	
	
	public DomainExeception(String msgError) {
		super(msgError);
	}
}

/* Com esse domain, fiz uma programação defensiva, presente no construtor da classe-objeto que utilizo na classe main*/
public Reservation(Integer numberroom, Date checkIn, Date checkOut) throws DomainExeception {
		if (!checkOut.after(checkIn)) {

			throw new DomainExeception("Error in reservation: Check-out date must be after check-in date");
		}
		this.numberRoom = numberroom;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
/*Com uma programação defensiva direto no construtor, trato a possivel exceção assim que instaciar o objeto*/

