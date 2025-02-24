package web.model;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsServiceImpl implements CarsService{

    @Override
    public  List<Cars> carsCount(Integer number) {
        return (number == null || number <= 0 || number >= 5)
            ? carsList
            : carsList.stream().limit(number).collect(Collectors.toList());
    }


}
