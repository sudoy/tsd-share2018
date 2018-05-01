package sudo.tsd0424;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test4_24_3 {

	public static void main(String[] args) {
//		LocalDate date1 = LocalDate.of(2018, 4, 1);
//		LocalDate date2 = LocalDate.of(2018, 5, 1);
//
//		// isAfter もし不等号で表すなら… >
//		// isBefore もし不等号で表すなら… <
//		if(date1.isAfter(date2) || date1.equals(date2)) {
//			System.out.println( date1 + " is after " + date2);
//		}else {
//			System.out.println( date2 + " is after " + date1);
//		}

		// parse
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月d日");
//		LocalDateTime date3 = LocalDateTime.parse("2018-04-24T18:00:00");
//		System.out.println(date3);
//
//		DateTimeFormatter formatter2 = DateTimeFormatter.BASIC_ISO_DATE;
//		LocalDateTime date4 = LocalDateTime.now();
//		String str = date4.format(formatter2);
//		System.out.println(str);

		LocalDateTime time = LocalDateTime.of(2016, 1, 30, 1, 0, 0);
		String str = time.format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
		System.out.println(str);

	}

}
