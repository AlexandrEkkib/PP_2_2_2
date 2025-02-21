package web.model;

import java.util.List;
import java.util.stream.Collectors;

public class CarsService {
    public static List<Cars> carsCount(List<Cars> carsList, Integer number) {

    return (number == null || number <= 0 || number >= 5)
            ? carsList
            : carsList.stream().limit(number).collect(Collectors.toList());
    }
}
