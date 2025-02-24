package web.model;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsServiceImpl implements CarsService{

    @Override
    public  List<Cars> carsCount(Integer number) {
        carsList.add(new Cars(1000,"MB", 100));
        carsList.add(new Cars(1001,"MB", 100));
        carsList.add(new Cars(1002,"MB", 102));
        carsList.add(new Cars(1003,"MB", 104));
        carsList.add(new Cars(1004,"MB", 102));

    return (number == null || number <= 0 || number >= 5)
            ? carsList
            : carsList.stream().limit(number).collect(Collectors.toList());
    }


}
