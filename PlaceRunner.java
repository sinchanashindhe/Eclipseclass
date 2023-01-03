

		package com.xworkz.map.boot;

		import java.util.ArrayList;
		import java.util.Collection;
		import java.util.stream.Collector;
		import java.util.stream.Collectors;

		import com.xworkz.map.dto.PlaceDto;

		public class PlaceRunner {

			public static void main(String[] args) {

				Collection<PlaceDto> collections = new ArrayList<PlaceDto>();
				collections.add(new PlaceDto("Mysur Palace", "Mysur", "Jayachamaraja Wadiyar", true, 100));
				collections.add(new PlaceDto("Bengalur Palace", "Bengalur", "KempeGouwda", false, 10));
				collections.add(new PlaceDto("Lalith Palace", "Bengalur", "Raj", false, 50));
				collections.add(new PlaceDto("Mumbai Palace", "Mumbai", "Uday", true, 1000));
				collections.add(new PlaceDto("Shivmogga Palace", "Shivmogga", "Ashu", true, 100));

				System.out.println("Place dto which is not destroyed.........");
				collections
				.stream()
				.filter(element -> !element.isDestroyedBy())
				.collect(Collectors.toList())
				.forEach(element -> System.out.println(element));

				System.out.println(System.lineSeparator());
				System.out.println("Location end with r..............");
				
				collections
				.stream()
				.filter(element -> element.getLocation().endsWith("r"))
				.collect(Collectors.toList())
				.forEach(element -> System.out.println(element));

			}

		}


	}

}
