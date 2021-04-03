package ifsc.sti.tcc.utilidades;

import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static Date criarData(int dia, int mes, int ano) {
		Calendar lCalendar = Calendar.getInstance();
		lCalendar.set(Calendar.YEAR, ano);
		lCalendar.set(Calendar.MONTH, mes - 1);
		lCalendar.set(Calendar.DAY_OF_MONTH, dia);
		return lCalendar.getTime();
	}
	
	public static Date adicionarDiasNoAtual(int dias) {
		Calendar lCalendar = Calendar.getInstance();
		lCalendar.add(Calendar.DAY_OF_MONTH, dias);
		return lCalendar.getTime();
	}
}
